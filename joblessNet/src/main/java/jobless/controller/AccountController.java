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
import jobless.service.user.UserRequest;


@Controller("accountController")
public class AccountController {

	@Autowired
	DeleteUserService deleteUserService;  
	
	@Autowired
	GetUserService getUserService;
	
	@Autowired
	JoinCheckService joinCheckService;
	
	@Autowired
	JoinUserService joinUserService;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	LogoutService logoutService;
	
	@Autowired
	EmailSendService emailSendService;
	
	@Autowired
	RecaptchaService recaptchaService;
	
	//회원가입 페이지
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String controllerJoin_GET() {
		System.out.println("회원가입 페이지_GET");
		return "view/loginPage/login-join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public ModelAndView controllerJoin_POST(@RequestParam String loginId,
									  @RequestParam String nickName,
									  @RequestParam String password,
									  @RequestParam String passwordCheck,
									  @RequestParam String email,
									  @RequestParam int platformId
									  ) {
		System.out.println("회원가입 페이지_POST");
		
		ModelAndView modelAndView = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		
		UserRequest userRequest = new UserRequest(loginId, nickName, password, email, platformId);
		userRequest.setPasswordCheck(passwordCheck);
		
		try {
			//잘못된 정보는 errors라는 맵을 넣어놓기 위해 errors라는 맵을 생성
			
			userRequest.validate(errors);
			System.out.println(errors);
			//errors는 view에 표출해주기 위해 request라는 속성 값으로 넣어줌
			modelAndView.addObject("errors", errors);
			modelAndView.setViewName("view/loginPage/login-join");
			if(!errors.isEmpty()) {
				return modelAndView;
			}
			
			joinCheckService.joinCheck(new UserRequest(userRequest.getLoginId(), userRequest.getNickName(),
					userRequest.getPassword(), userRequest.getEmail(),
					userRequest.getPlatformId()));
			
		}catch (OverlapLoginIdException e) {
			errors.put("OverlapLoginIdException", true);
			System.out.println(errors);
			e.getMessage();
			return modelAndView;
		}catch (OverlapNickNameException e) {
			errors.put("OverlapNickNameException", true);
			System.out.println(errors);
			e.getMessage();
			return modelAndView;
		}catch (OverlapEmailException e) {
			errors.put("OverlapEmailException", true);
			System.out.println(errors);
			e.getMessage();
			return modelAndView;
		}catch (DuplicateKeyException e) {
			errors.put("DuplicateKeyException", true);
			System.out.println(errors);
			e.getMessage();
			return modelAndView;
		}
		String code = emailSendService.emailService(userRequest.getEmail());
		
		modelAndView.addObject("code", code);
		modelAndView.addObject("user", userRequest);
		modelAndView.setViewName("view/loginPage/login-join-check");
		return modelAndView; 
	}
	
	
	//회원탈퇴 페이지
	@RequestMapping(value="/deleteUser", method=RequestMethod.GET)
	public String controllerDeleteUser_GET() {
		System.out.println("회원삭제 페이지_GET");
		return "deleteUser";
	}
	
	@RequestMapping(value="/deleteUser", method=RequestMethod.POST)
	public String controllerDeleteUser_POST(@RequestParam int userId) {
		System.out.println("회원삭제 페이지_POST");
		deleteUserService.deleteUser(userId);
		
		return "redirect:/main";
	}
	
	
	//회원검색 페이지
	@RequestMapping(value="/selectUser", method=RequestMethod.GET)
	public String controllerSelectUser_GET() {
		return "selectUser";
	}
	
	@RequestMapping(value="/selectUser", method=RequestMethod.POST)
	public String controllerSelectUser_POST(@RequestParam int userId) {
		ModelAndView modelAndView = new ModelAndView();
		
		try {
			UserVO user = getUserService.getUserByUserId(userId);
			modelAndView.addObject("user", user);
		}catch (UserNotFoundException e) {
			e.getMessage();
			modelAndView.addObject("user", "찾을수 없는 사용자인 것이에오");
			return "selectUser";
		}
		return "selectUser";
	}
	

	//로그인 페이지
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login_GET() {
		return "view/loginPage/login-main";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login_POST(@RequestParam String loginId,
								   @RequestParam String password,
								   @RequestParam("g-recaptcha-response") String recaptcha,
								   HttpSession session
								  ) {
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		ModelAndView modelAndView = new ModelAndView();
		try {
			AuthUser authUser = loginService.login(loginId, password);
			
			recaptchaService.recaptcha(recaptcha);
			
			UserRequest userRequest = new UserRequest(loginId, password);
			userRequest.validateLogin(errors);
			System.out.println(errors);
			modelAndView.addObject("errors", errors);
			modelAndView.setViewName("view/loginPage/login-main");
			if(!errors.isEmpty()) {
				return modelAndView;
			}
			
			session.setAttribute("authUser", authUser);
		}catch (SignInFailException e) {
			e.getMessage();
			errors.put("Id_or_Pw_NotMatch", true);
			modelAndView.addObject("errors", errors);
			return modelAndView;
		}catch (RecaptchaNotRunningException e) {
			e.getMessage();
			errors.put("Not_Running_Recaptcha", true);
			modelAndView.addObject("errors", errors);
			return modelAndView;
		}
		modelAndView.setViewName("redirect:/main");
		return modelAndView;
	}
	
	
	//회원가입 이메일 체크 페이지
	@RequestMapping(value="/join-check", method=RequestMethod.GET)
	public String loginCheck_GET() {
		System.out.println("loginCheck_GET");
		return "view/loginPage/login-join-check";
	}
	
	@RequestMapping(value="/join-check", method=RequestMethod.POST)
	public ModelAndView loginCheck_POST(@RequestParam String securityCode,
								  @RequestParam String code,
								  @RequestParam String loginId,
								  @RequestParam String nickName,
								  @RequestParam String password,
								  @RequestParam String email,
								  @RequestParam int platformId
								 ) {
		System.out.println("loginCheck_POST");
	
		UserRequest userRequest = new UserRequest(loginId, nickName, password, email, platformId);
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		ModelAndView modelAndView = new ModelAndView();
		
		try {
			joinUserService.joinUser(userRequest, code, securityCode);
		
			modelAndView.setViewName("join-check");
		}catch (UserRequestNullException e) {
			e.getMessage();
			errors.put("UserRequestNullException", true);
			modelAndView.addObject("errors", errors);
			return modelAndView;
		}catch (DoesNotMatchSecurityCode e) {
			e.getMessage();
			errors.put("DoesNotMatchSecurityCode", true);
			modelAndView.addObject("errors", errors);
			return modelAndView;
		}
		
		modelAndView.setViewName("redirect:/main");
		return modelAndView;
	}
	
	//이메일 재전송 서비스(회원가입 전용)
	@RequestMapping(value="/email-again" ,method=RequestMethod.POST)
	public ModelAndView emailAgainSend(
								  @RequestParam String loginId,
								  @RequestParam String nickName,
								  @RequestParam String password,
								  @RequestParam String email,
								  @RequestParam int platformId
								) {
		ModelAndView modelAndView = new ModelAndView();
		UserRequest userRequest = new UserRequest(loginId, nickName, password, email, platformId);
		
		String code = emailSendService.emailService(userRequest.getEmail());
		
		System.out.println(code);
		
		modelAndView.addObject("code", code);
		modelAndView.addObject("user", userRequest);
		modelAndView.setViewName("view/loginPage/login-join-check");
		
		return modelAndView;
	}
	
	//로그아웃 페이지
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpServletRequest req) {
		
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			session.invalidate();
		}
		
		return "redirect:/main";
	}
}
