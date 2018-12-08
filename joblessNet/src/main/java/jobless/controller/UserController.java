package jobless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userController")
public class UserController {
	@RequestMapping(value="/main")
	public String controllerMain() {
		System.out.println("메인 페이지");
		return "view/main/main";
	}
	
	@RequestMapping(value="/join")
	public String controllerJoin() {
		System.out.println("회원가입 페이지");
		return "view/loginPage/singin";
	}
}
