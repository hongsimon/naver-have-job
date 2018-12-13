package jobless.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jobless.dao.condition.Condition;
import jobless.model.ClipDetailVO;
import jobless.service.authuser.AuthUser;
import jobless.service.clip.ReadClipService;

@Controller("indexController")
public class IndexController {
	
	@Autowired
	ReadClipService readClip;
	
	@RequestMapping(value="/main")
	public ModelAndView controllerMain() {
		System.out.println("메인 페이지");
		ModelAndView mv = new ModelAndView();
		Condition condition = new Condition();
		List<ClipDetailVO> clipList = readClip.readClipDetailList(condition);
		mv.addObject("clipDetailList", clipList);
		
		mv.setViewName("view/main/main");
		return mv;
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
