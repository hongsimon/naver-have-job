package jobless.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jobless.model.AttendanceCheckVO;
import jobless.model.JobAddVO;
import jobless.model.UserVO;
import jobless.service.attendancecheck.InsertAttendanceCheckService;
import jobless.service.attendancecheck.SelectAttendanceCheckService;
import jobless.service.authuser.AuthUser;
import jobless.service.authuser.LoginService;
import jobless.service.authuser.LogoutService;
import jobless.service.email.EmailSendService;
import jobless.service.jobadd.JobAddService;
import jobless.service.recaptcha.RecaptchaService;
import jobless.service.user.DeleteUserService;
import jobless.service.user.GetUserService;
import jobless.service.user.JoinCheckService;
import jobless.service.user.JoinUserService;
import jobless.service.user.ModifyUserService;
import jobless.service.user.UserRequest;

@Controller("userController")
public class UserController {

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

	@Autowired
	JobAddService jobAddService;
	
	@Autowired
	SelectAttendanceCheckService SACS; 
	
	@Autowired
	InsertAttendanceCheckService IACS;

	// 회원정보수정
	@RequestMapping(value = "/config/changeProfile", method = RequestMethod.GET)
	public ModelAndView configChangeProfile_GET() {
		System.out.println("configChangeProfile_GET");
		
		ModelAndView mv = new ModelAndView();
		
		List<JobAddVO> add = jobAddService.selectAllAdd();
		mv.addObject("add", add);
		mv.setViewName("view/service/changeProfile");
		
		return mv;
	}

	@RequestMapping(value = "/config/changeProfile", method = RequestMethod.POST)
	public ModelAndView configChangeProfile_POST(@RequestParam int userId, @RequestParam String nickName,
			@RequestParam String email, HttpSession session) {
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

		if (userVO.getNickName().equals(nickName)) {

		} else if (userNickName != null) {
			errors.put("sameNick", true);
		}

		if (userVO.getEmail().equals(email)) {

		} else if (userEmail != null) {
			errors.put("sameEmail", true);
		}

		if (!errors.isEmpty()) {
			return modelAndView;
		}

		modifyUserService.modifyUserData(new UserRequest(userId, nickName, email));

		UserVO user = getUserService.getUserByUserId(userId);
		AuthUser authUser = new AuthUser(user.getUserId(), user.getLoginId(), user.getNickName(), user.getEmail(),
				user.getPoint(), user.getAdmin(), user.getPlatformId(),user.isStreamer(), user.getIconId(), user.getFileName());
		
		session.setAttribute("authUser", authUser);

		modelAndView.addObject("Success", true);
		List<JobAddVO> add = jobAddService.selectAllAdd();
		modelAndView.addObject("add", add);
		modelAndView.setViewName("view/service/changeProfile");
		return modelAndView;
	}

	// 비밀번호 변경
	@RequestMapping(value = "/config/changeProfile/password")
	public ModelAndView configChangePassword_POST(@RequestParam int userId, @RequestParam String nowPw,
			@RequestParam String newPw, @RequestParam String newPwCk,
			RedirectAttributes redirectAttributes) {
		System.out.println("configChangePassword_POST");

		ModelAndView modelAndView = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		UserVO user = getUserService.getUserByUserId(userId);
		UserRequest userRequest = new UserRequest(nowPw, user.getPassword(), newPw, newPwCk);

		
		
		userRequest.validateModifyPw(errors);
		
		if (!errors.isEmpty()) {
			modelAndView.addObject("errors", errors);
			modelAndView.setViewName("view/service/changeProfile");
			return modelAndView;
		}else if(errors.isEmpty()) {
			
			modifyUserService.modifyUserPw(new UserRequest(userId, newPw));
			
			redirectAttributes.addFlashAttribute("Success", "Success");
			modelAndView.setViewName("redirect:/config/changeProfile");
			
		}
		

		return modelAndView;
	}

	// 아이디, 비밀번호 찾기

	// 1(시작)
	// 1 -> 2
	@RequestMapping(value = "/userSearch/loginPage", method = RequestMethod.GET)
	public String userSearchLoginPage_GET() {
		System.out.println("userSearchLoginPage_GET");
		return "view/search/search_login_page";
	}

	// 1.5(이메일 수정페이지)
	// 1.5 -> 2
	@RequestMapping(value = "/userSearch/search_login", method = RequestMethod.POST)
	public ModelAndView Search_login_POST(@RequestParam String email) {
		System.out.println("Search_login_POST");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view/search/search_login");
		return modelAndView;
	}

	// 2(아이디 입력 페이지))
	// 2 -> 1.5(이메일 수정)
	// 2 -> 2.5(아이디를 찾는페이지)
	// 2 -> 3 (비번찾기)
	@RequestMapping(value = "/userSearch/search_login_check", method = RequestMethod.POST)
	public ModelAndView Search_login_check_GET(@RequestParam String emailurl) {
		System.out.println("Search_login_check_POST");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("email", emailurl);
		modelAndView.setViewName("view/search/search_login_check");
		return modelAndView;
	}

	// 2.5(아이디를 찾는페이지)
	@RequestMapping(value = "/userSearch/search_login_checkId", method = RequestMethod.POST)
	public ModelAndView Search_login_checkId_POST(
			@RequestParam(required = false, value = "email", defaultValue = "email..") String email,
			HttpSession session) {
		System.out.println("Search_login_checkId_POST");

		ModelAndView modelAndView = new ModelAndView();

		UserVO user = getUserService.getUserByEmail(email);

		emailSendService.emailService(email, "loginId," + user.getLoginId());

		modelAndView.addObject("email", email);
		modelAndView.setViewName("view/search/search_login_checkId");
		return modelAndView;
	}

	// 3(비번찾기)
	@RequestMapping(value = "/userSearch/search_login_checkPassword", method = RequestMethod.POST)
	public ModelAndView Search_login_checkPassword_POST(@RequestParam String email, @RequestParam String id,
			HttpSession session) {
		System.out.println("Search_login_checkPassword_POST");
		ModelAndView modelAndView = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();

		UserVO userEmail = getUserService.getUserByEmail(email);

		modelAndView.addObject("errors", errors);
		modelAndView.setViewName("view/search/search_login_check");

		// 입력받은 이메일이 존재하는지 확인..
		if (userEmail == null) {
			errors.put("notFoundEmail", true);
			modelAndView.addObject("email", email);
			return modelAndView;
		}

		// 확인후 이메일로 검색한 loginId와 입력받은 id와 일치한지 검사
		if (!userEmail.getLoginId().equals(id)) {
			errors.put("notMatchUser", true);
			modelAndView.addObject("email", email);
			return modelAndView;
		}

		UserVO user = getUserService.getUserByEmail(email);

		// 이 모든것이 완벽하다면.. 이메일 전송!!!!
		String code = emailSendService.emailService(email, "passwordChange," + user.getNickName());

		session.setAttribute("userId", userEmail.getUserId());
		session.setAttribute("email", email);
		session.setAttribute("code", code);
		session.setMaxInactiveInterval(60 * 10);

		modelAndView.setViewName("view/search/search_login_checkPassword");
		return modelAndView;
	}

	// 4(비밀번호 변경!!)
	@RequestMapping(value = "/changePassword", method = RequestMethod.GET)
	public ModelAndView userPasswordChange_GET() {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("view/search/search_change_password");
		return modelAndView;
	}

	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	public ModelAndView userPasswordChange_POST(@RequestParam String password, @RequestParam String passwordCheck,
			@RequestParam int userId, HttpSession session) {

		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		ModelAndView modelAndView = new ModelAndView();

		// 비번입력했는지
		if (password == null || password.equals("")) {
			errors.put("password", true);
		}
		// 비번체크 입력했는지
		if (passwordCheck == null || passwordCheck.equals("")) {
			errors.put("passwordCheck", true);
		}
		// 비밀번호가 일치하지 않을때
		if (!password.equals(passwordCheck)) {
			errors.put("notMatchPw", true);
		}

		// 에러를 보내기 위한것들
		modelAndView.addObject("errors", errors);
		// 에러뜨면 보내질 경로
		modelAndView.setViewName("view/search/search_change_password");

		// 에러가 있으면!!! 비번 변경페이지로 던짐
		if (!errors.isEmpty()) {
			return modelAndView;
		}

		modifyUserService.modifyUserPw(new UserRequest(userId, password));

		// 정상적으로 끝나면 메인으로 던져줌
		modelAndView.setViewName("redirect:/main");

		if (session != null) {
			session.invalidate();
		}

		return modelAndView;
	}

	private static final String TIME_SERVER = "pool.ntp.org";

	
	// 출쳌!
	@RequestMapping(value = "/attendanceCheck", method = RequestMethod.GET)
	public ModelAndView attendanceCheck_GET(HttpSession session) {
		System.out.println("attendanceCheck_GET");
		ModelAndView modelAndView = new ModelAndView();
		
		if(session.getAttribute("authUser") != null) {
			NTPUDPClient timeClient = new NTPUDPClient();
			timeClient.setDefaultTimeout(1000);
			try {
				timeClient.open();
				InetAddress address = InetAddress.getByName(TIME_SERVER);
				TimeInfo timeInfo = timeClient.getTime(address);
				long returnTime = timeInfo.getMessage().getTransmitTimeStamp().getTime(); // 서버로부터 시간 가져오는 코드
				
				Date date = new Date(returnTime);
				LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();// date 에서
				//-----------------------------위는 시간관련 로직---------------------------------------
				
				String localDate = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));	
				
				List<AttendanceCheckVO> attendanceCheck = SACS.selectByAllAttendce(localDate);
				
				
				modelAndView.addObject("attendanceCheck", attendanceCheck);
				modelAndView.setViewName("/view/service/attendance_check");
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}else {
			modelAndView.setViewName("redirect:/main");
			return modelAndView;
		}
		List<JobAddVO> add = jobAddService.selectAllAdd();
		modelAndView.addObject("add", add);
		return modelAndView;
	}

	@RequestMapping(value = "/attendanceCheck", method = RequestMethod.POST)
	public ModelAndView attendanceCheck_POST(@RequestParam int userId,
											 @RequestParam String nickName,
											 @RequestParam(defaultValue=" ", required=false) String comment) {
		System.out.println("attendanceCheck_POST");

		ModelAndView modelAndView = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		
		NTPUDPClient timeClient = new NTPUDPClient();
		timeClient.setDefaultTimeout(1000);
		try {
			timeClient.open();
			InetAddress address = InetAddress.getByName(TIME_SERVER);
			TimeInfo timeInfo = timeClient.getTime(address);
			long returnTime = timeInfo.getMessage().getTransmitTimeStamp().getTime(); // 서버로부터 시간 가져오는 코드

			Date date = new Date(returnTime);
			LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();// date 에서
			//-----------------------------위는 시간관련 로직---------------------------------------
			
			String localDate = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));	

			UserVO user = getUserService.getUserByUserId(userId);
			
			if(user == null) {
				errors.put("userId", true);
			}
			
			int sameCheck = SACS.selectByIdAttendce(new AttendanceCheckVO(userId, localDate));
			System.out.println(sameCheck);
			
			if(sameCheck == 1) {
				errors.put("same", true);
			}
			
			List<AttendanceCheckVO> attendanceCheck = SACS.selectByAllAttendce(localDate);
			
			
			modelAndView.addObject("attendanceCheck", attendanceCheck);
			modelAndView.addObject("errors", errors);
			modelAndView.setViewName("/view/service/attendance_check");
			
			if(!errors.isEmpty()) {
				return modelAndView;
			}
			
			IACS.insertAttendceCheck(new AttendanceCheckVO(userId, nickName, comment));
			modifyUserService.pointPay(userId);
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		modelAndView.setViewName("redirect:/attendanceCheck");
		return modelAndView;
	}

}
