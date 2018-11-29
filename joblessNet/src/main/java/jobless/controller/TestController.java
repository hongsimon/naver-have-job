package jobless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("testController")
public class TestController {
	@RequestMapping(value="/test2")
	public String controllerTest() {
		return "test2";
	}
}
