package jobless.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jobless.service.user.GetUserService;

@Controller("userSessionTestController")
public class UserSessionTestController {

	@Autowired
	GetUserService getUserService;
	
	@RequestMapping(value="loginTest", method=RequestMethod.GET)
	public String SessionTest(@RequestParam String loginId,
							  @RequestParam String password
							 ) {
			
		return "";
	}
	
}
