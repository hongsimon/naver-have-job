package jobless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("indexController")
public class IndexController {

	@RequestMapping(value="/main")
	public String controllerMain() {
		System.out.println("메인 페이지");
		return "main";
	}
}
