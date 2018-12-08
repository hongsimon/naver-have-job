package jobless.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jobless.exception.OverlapEmailException;
import jobless.exception.OverlapLoginIdException;
import jobless.exception.OverlapNickNameException;
import jobless.exception.UserNotFoundException;
import jobless.model.UserVO;
import jobless.service.user.DeleteUserService;
import jobless.service.user.GetUserService;
import jobless.service.user.JoinUserService;
import jobless.service.user.UserRequest;


@Controller("accountController")
public class AccountController {

	@Autowired
	DeleteUserService deleteUserService;  
	
	@Autowired
	GetUserService getUserService;
	
	@Autowired
	JoinUserService joinUserService;
	
	@Autowired
	HttpServletRequest req;
	
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String controllerJoin_GET() {
		System.out.println("회원가입 페이지_GET");
		return "join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String controllerJoin_POST(@RequestParam String loginId,
									  @RequestParam String nickName,
									  @RequestParam String password,
									  @RequestParam String passwordCheck,
									  @RequestParam String email,
									  @RequestParam int platformId
									  ) {
		
		UserRequest userRequest = new UserRequest(loginId, nickName, password, email, platformId);
		userRequest.setPasswordCheck(passwordCheck);
		
		//잘못된 정보는 errors라는 맵을 넣어놓기 위해 errors라는 맵을 생성
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		
		userRequest.validate(errors);
		
		//errors는 view에 표출해주기 위해 request라는 속성 값으로 넣어줌
		req.setAttribute("errors", errors);
		
		if(!errors.isEmpty()) {
			return "join";
		}
		
		try {
			joinUserService.joinUser(new UserRequest(userRequest.getLoginId(), userRequest.getNickName(),
					userRequest.getPassword(), userRequest.getEmail(),
					userRequest.getPlatformId()));
			
		}catch (OverlapLoginIdException e) {
			req.setAttribute("OverlapLoginIdException", true);
			e.getMessage();
			return "join";
		}catch (OverlapNickNameException e) {
			req.setAttribute("OverlapNickNameException", true);
			e.getMessage();
			return "join";
		}catch (OverlapEmailException e) {
			req.setAttribute("OverlapEmailException", true);
			e.getMessage();
			return "join";
		}catch (DuplicateKeyException e) {
			req.setAttribute("DuplicateKeyException", true);
			e.getMessage();
			return "join";
		}

		System.out.println("회원가입 페이지_POST");
		
		return "redirect:/main"; 
	}
	
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
	
	@RequestMapping(value="selectUser", method=RequestMethod.GET)
	public String controllerSelectUser_GET() {
		return "selectUser";
	}
	
	@RequestMapping(value="selectUser", method=RequestMethod.POST)
	public String controllerSelectUser_POST(@RequestParam int userId) {
		try {
			UserVO user = getUserService.getUserByUserId(userId);
			req.setAttribute("user", user);
		}catch (UserNotFoundException e) {
			e.getMessage();
			req.setAttribute("user", "찾을수 없는 사용자인 것이에오");
			return "selectUser";
		}
		return "selectUser";
	}
}