package jobless.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jobless.service.authuser.AuthUser;

@Controller("indexController")
public class IndexController {
	
	@RequestMapping(value="/main")
	public String controllerMain() {
		System.out.println("메인 페이지");
		return "view/main/main";
	}
	
	/*@RequestMapping(value="/main")
	public ModelAndView controllerMain(HttpSession session) {
		System.out.println("메인 페이지");
		
		ModelAndView mv = new ModelAndView();
		
		AuthUser authUser = new AuthUser(1, "testLoginId", "testNick", 
										"testEmail", 0,	false, 1);
		session.setAttribute("authUser", authUser);
		
		mv.setViewName("view/main/main");
		
		return mv;
	}*/
}
