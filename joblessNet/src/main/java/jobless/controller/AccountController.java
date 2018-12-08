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
import org.springframework.web.servlet.ModelAndView;

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
		ModelAndView modelAndView = new ModelAndView();
		try {
			
			
			UserRequest userRequest = new UserRequest(loginId, nickName, password, email, platformId);
			userRequest.setPasswordCheck(passwordCheck);
			
			//잘못된 정보는 errors라는 맵을 넣어놓기 위해 errors라는 맵을 생성
			Map<String, Boolean> errors = new HashMap<String, Boolean>();
			
			userRequest.validate(errors);
			
			//errors는 view에 표출해주기 위해 request라는 속성 값으로 넣어줌\
			modelAndView.addObject("errors", errors);
			modelAndView.setViewName("view/loginPage/login-join");
			if(!errors.isEmpty()) {
				return modelAndView;
			}
			
			joinUserService.joinUser(new UserRequest(userRequest.getLoginId(), userRequest.getNickName(),
					userRequest.getPassword(), userRequest.getEmail(),
					userRequest.getPlatformId()));
			
		}catch (OverlapLoginIdException e) {
			modelAndView.addObject("OverlapLoginIdException", true);
			modelAndView.setViewName("view/loginPage/login-join");
			e.getMessage();
			return modelAndView;
		}catch (OverlapNickNameException e) {
			modelAndView.addObject("OverlapNickNameException", true);
			modelAndView.setViewName("view/loginPage/login-join");
			e.getMessage();
			return modelAndView;
		}catch (OverlapEmailException e) {
			modelAndView.addObject("OverlapEmailException", true);
			modelAndView.setViewName("view/loginPage/login-join");
			e.getMessage();
			return modelAndView;
		}catch (DuplicateKeyException e) {
			modelAndView.addObject("DuplicateKeyException", true);
			modelAndView.setViewName("view/loginPage/login-join");
			e.getMessage();
			return modelAndView;
		}

		System.out.println("회원가입 페이지_POST");
		
		modelAndView.setViewName("view/main/main");
		return modelAndView; 
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
}
