package jobless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller("accountController")
public class AccountController {

	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String controllerJoin_GET() {
		System.out.println("회원가입 페이지_GET");
		return "join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String controllerJoin_POST(@RequestParam String login_id,
									  @RequestParam String nickName,
									  @RequestParam String password,
									  @RequestParam String email,
									  @RequestParam int platform_id/*,
									  UserRequest userRequest*/
									  ) {
		System.out.println("회원가입 페이지_POST");
		
//		userRequest.setLogin_id(login_id);
//		userRequest.setNickName(nickName);
//		userRequest.setPassword(password);
//		userRequest.setEmail(email);
//		userRequest.setPlatform_id(platform_id);
//		
//		UserServiceImpl userService = new UserServiceImpl();
//		userService.joinUser(userRequest);
		return "redirect:/main";
	}
}
