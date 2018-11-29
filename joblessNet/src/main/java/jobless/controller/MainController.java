package jobless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("mainController")
public class MainController {
	@RequestMapping(value="/test")
	public String controllerTest() {
		return "test";
	}
	
	@RequestMapping(value="/main")
	public String controllerMain() {
		System.out.println("메인 페이지");
		return "main";
	}
	
	@RequestMapping(value="/join")
	public String controllerJoin() {
		System.out.println("회원가입 페이지");
		return "join";
	}
}
