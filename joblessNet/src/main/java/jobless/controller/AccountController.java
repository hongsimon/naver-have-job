package jobless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jobless.service.user.DeleteUserServiceImpl;


@Controller("accountController")
public class AccountController {

	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String controllerJoin_GET() {
		System.out.println("회원가입 페이지_GET");
		return "join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String controllerJoin_POST(@RequestParam String postTitle,
									  @RequestParam int contentId
									  ) {
		System.out.println("회원가입 페이지_POST");
		
		return "redirect:/main";
	}
	
	@RequestMapping(value="/deleteUser", method=RequestMethod.GET)
	public String controllerDeleteUser_GET() {
		System.out.println("회원삭제 페이지_GET");
		return "deleteUser";
	}
	
	@RequestMapping(value="/deleteUser", method=RequestMethod.POST)
	public String ccontrollerDeleteUser_POST(@RequestParam int userId,
											 DeleteUserServiceImpl deleteUserServiceImpl
											) {
		System.out.println("회원삭제 페이지_POST");
		deleteUserServiceImpl.deleteUser(userId);
		
		return "redirect:/main";
	}
	
}
