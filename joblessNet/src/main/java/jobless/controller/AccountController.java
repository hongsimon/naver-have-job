package jobless.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jobless.exception.DoesNotMatchSecurityCode;
import jobless.exception.OverlapEmailException;
import jobless.exception.OverlapLoginIdException;
import jobless.exception.OverlapNickNameException;
import jobless.exception.RecaptchaNotRunningException;
import jobless.exception.SignInFailException;
import jobless.exception.UserNotDeleteException;
import jobless.exception.UserNotFoundException;
import jobless.exception.UserRequestNullException;
import jobless.model.UserVO;
import jobless.service.authuser.AuthUser;
import jobless.service.authuser.LoginService;
import jobless.service.authuser.LogoutService;
import jobless.service.email.EmailSendService;
import jobless.service.recaptcha.RecaptchaService;
import jobless.service.user.DeleteUserService;
import jobless.service.user.GetUserService;
import jobless.service.user.JoinCheckService;
import jobless.service.user.JoinUserService;
import jobless.service.user.ModifyUserService;
import jobless.service.user.UserRequest;


@Controller("accountController")
public class AccountController {
	
	@Autowired
	GetUserService getUserService;
	
	@Autowired
	JoinUserService joinUserService;
	
	@Autowired
	JoinCheckService joinCheckService;
	
	@Autowired
	ModifyUserService modifyUserService;
	
	@Autowired
	DeleteUserService deleteUserService;  
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	LogoutService logoutService;
	
	@Autowired
	EmailSendService emailSendService;
	
	@Autowired
	RecaptchaService recaptchaService;
	
	//로그인 페이지
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login_GET() {
		System.out.println("login_GET");
		return "view/loginPage/login-main";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login_POST(@RequestParam String loginId,
			@RequestParam String password,
			@RequestParam("g-recaptcha-response") String recaptcha,
			HttpSession session
			) {
		System.out.println("login_POST");
		
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		ModelAndView modelAndView = new ModelAndView();
		UserRequest userRequest = new UserRequest(loginId, password);
		try {
			
			userRequest.validateLogin(errors);
			
			modelAndView.addObject("errors", errors);
			modelAndView.addObject("value", userRequest);
			modelAndView.setViewName("view/loginPage/login-main");
			AuthUser authUser = loginService.login(loginId, password);
			
			recaptchaService.recaptcha(recaptcha);
			
			session.setAttribute("authUser", authUser);
		}catch (SignInFailException e) {
			e.getMessage();
			errors.put("Id_or_Pw_NotMatch", true);
			return modelAndView;
		}catch (RecaptchaNotRunningException e) {
			e.getMessage();
			errors.put("Not_Running_Recaptcha", true);
			return modelAndView;
		}
		
		modelAndView.setViewName("redirect:/main");
		return modelAndView;
	}
	
	
	//로그아웃 페이지
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpServletRequest req) {
		System.out.println("logout_GET");
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			session.invalidate();
		}
		
		return "redirect:/main";
	}
	
	
	//회원가입 페이지
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String userJoin_GET() {
		System.out.println("userJoin_GET");
		
		return "view/loginPage/login-join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public ModelAndView userJoin_POST(@RequestParam String loginId,
									  @RequestParam String nickName,
									  @RequestParam String password,
									  @RequestParam String passwordCheck,
									  @RequestParam String email,
									  @RequestParam int platformId,
									  @RequestParam("g-recaptcha-response") String recaptcha,
									  HttpSession session
									  
									  ) {
		System.out.println("userJoin_POST");
		
		ModelAndView modelAndView = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		
		UserRequest userRequest = new UserRequest(loginId, nickName, password, email, platformId);
		userRequest.setPasswordCheck(passwordCheck);
		
		try {
			
			userRequest.validate(errors);
			modelAndView.addObject("errors", errors);
			modelAndView.addObject("value", userRequest);
			modelAndView.setViewName("view/loginPage/login-join");
			if(!errors.isEmpty()) {
				return modelAndView;
			}
			
			joinCheckService.joinCheck(userRequest);
			
			recaptchaService.recaptcha(recaptcha);
		}catch (OverlapLoginIdException e) {
			errors.put("OverlapLoginIdException", true);
			e.getMessage();
			return modelAndView;
		}catch (OverlapNickNameException e) {
			errors.put("OverlapNickNameException", true);
			e.getMessage();
			return modelAndView;
		}catch (OverlapEmailException e) {
			errors.put("OverlapEmailException", true);
			e.getMessage();
			return modelAndView;
		}catch (DuplicateKeyException e) {
			errors.put("DuplicateKeyException", true);
			e.getMessage();
			return modelAndView;
		}catch (RecaptchaNotRunningException e) {
			errors.put("Not_Running_Recaptcha", true);
			e.getMessage();
			return modelAndView;
		}
		String code = emailSendService.emailService(userRequest.getEmail());
		
		session.setAttribute("code", code);
		session.setAttribute("user", userRequest);
		session.setMaxInactiveInterval(600);
		modelAndView.setViewName("redirect:/join-check");
		return modelAndView; 
	}
	
	
	//회원가입 이메일 체크 페이지
		@RequestMapping(value="/join-check", method=RequestMethod.GET)
		public String joinCheck_GET() {
			System.out.println("joinCheck_GET");
			return "view/loginPage/login-join-check";
		}
		
		@RequestMapping(value="/join-check", method=RequestMethod.POST)
		public ModelAndView joinCheck_POST(@RequestParam String securityCode,
									  @RequestParam String code,
									  @RequestParam String loginId,
									  @RequestParam String nickName,
									  @RequestParam String password,
									  @RequestParam String email,
									  @RequestParam int platformId
									 ) {
			System.out.println("joinCheck_POST");
		
			UserRequest userRequest = new UserRequest(loginId, nickName, password, email, platformId);
			Map<String, Boolean> errors = new HashMap<String, Boolean>();
			ModelAndView modelAndView = new ModelAndView();
			
			try {
				modelAndView.setViewName("view/loginPage/login-join-check");
				
				
				if(!code.equals(securityCode)) {
					errors.put("notMatchCode", true);
					modelAndView.addObject("errors", errors);
					return modelAndView;
				}
				
				joinUserService.joinUser(userRequest);
				modelAndView.addObject("errors", errors);
			}catch (DoesNotMatchSecurityCode e) {
				e.getMessage();
				System.out.println("DoesNotMatchSecurityCode");
				errors.put("DoesNotMatchSecurityCode", true);
				return modelAndView;
			}
			
			modelAndView.setViewName("redirect:/main");
			return modelAndView;
		}
		
	
	//설정페이지
	
	@RequestMapping(value="/config/favoriteList", method=RequestMethod.GET)
	public String configFavoriteList_GET() {
		System.out.println("configFavoriteList_GET");
		return "view/service/favoriteList";
	}
	
	
	//회원정보수정
	@RequestMapping(value="/config/changeProfile", method=RequestMethod.GET)
	public String configChangeProfile_GET() {
		System.out.println("configChangeProfile_GET");
		return "view/service/changeProfile";
	}
	
	@RequestMapping(value="/config/changeProfile", method=RequestMethod.POST)
	public ModelAndView configChangeProfile_POST(
											@RequestParam int userId,
											@RequestParam String nickName,
											@RequestParam String email,
											HttpSession session
										  ) {
		System.out.println("configChangeProfile_POST");
		
		
		ModelAndView modelAndView = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		UserRequest userRequest = new UserRequest(userId, nickName, email);
		
			userRequest.validateModify(errors);
			modelAndView.addObject("errors", errors);
			modelAndView.setViewName("view/service/changeProfile");
			
			UserVO userVO = getUserService.getUserByUserId(userId);
			UserVO userNickName = getUserService.getUserByNickName(nickName);
			UserVO userEmail = getUserService.getUserByEmail(email);
			
			if(userVO.getNickName().equals(nickName)) {
				System.out.println("내 닉넴임");
			}else if(userNickName != null) {
				System.out.println("누가 쓰고있는 닉넴!!");
				errors.put("sameNick", true);
			}
			
			if(userVO.getEmail().equals(email)) {
				System.out.println("내 이멜임");
			}else if(userEmail != null) {
				System.out.println("누가 쓰고있는 이멜!!");
				errors.put("sameEmail", true);
			}
			
			if(!errors.isEmpty()) {
				return modelAndView;
			}
			
			modifyUserService.modifyUserData(new UserRequest(userId, nickName, email));
			
			UserVO user= getUserService.getUserByUserId(userId);
			AuthUser authUser = new AuthUser(user.getUserId(), user.getLoginId(), user.getNickName(), user.getEmail(), user.getPoint(), user.getAdmin(), user.getPlatformId());
			
			session.setAttribute("authUser", authUser);
			
		
		modelAndView.setViewName("redirect:/config/changeProfile");
		return modelAndView;
	}
	
	
	//회원탈퇴
	@RequestMapping(value="/config/userDel", method=RequestMethod.GET)
	public String configUserDel_GET() {
		System.out.println("configUserDel_GET");
		return "view/service/userDel";
	}
	
	@RequestMapping(value="/config/userDel", method=RequestMethod.POST)
	public String configUserDel_POST(@RequestParam int userId,
									 HttpServletRequest req
									) {
		System.out.println("configUserDel_POST");
		
		try {
			deleteUserService.deleteUser(userId);
		}catch (UserNotFoundException e) {
			e.getMessage();
		}catch (UserNotDeleteException e) {
			e.getMessage();
		}
		
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			session.invalidate();
		}
		
		return "redirect:/main";
	}
	
	//이메일 재전송 서비스(회원가입 전용)
	@RequestMapping(value="/email-again" ,method=RequestMethod.POST)
	public ModelAndView emailAgainSend(
								  @RequestParam String loginId,
								  @RequestParam String nickName,
								  @RequestParam String password,
								  @RequestParam String email,
								  @RequestParam int platformId,
								  HttpSession session
								) {
		System.out.println("emailAgainSend_POST");
		ModelAndView modelAndView = new ModelAndView();
		UserRequest userRequest = new UserRequest(loginId, nickName, password, email, platformId);
		
		String code = emailSendService.emailService(userRequest.getEmail());
		
		System.out.println(code);
		
		session.setAttribute("code", code);
		session.setAttribute("user", userRequest);
		session.setMaxInactiveInterval(600);

		modelAndView.setViewName("redirect:/join-check");
		return modelAndView;
	}
}
