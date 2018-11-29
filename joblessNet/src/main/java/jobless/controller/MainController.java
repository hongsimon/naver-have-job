package jobless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("mainController")
public class MainController {
	@RequestMapping(value="/test")
	public String controllerTest() {
		return "test";
	}
	
}
