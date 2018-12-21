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
import jobless.model.JobAddVO;
import jobless.model.PostDetailVO;
import jobless.service.authuser.AuthUser;
import jobless.service.clip.ReadClipService;
import jobless.service.jobadd.JobAddService;
import jobless.service.post.ReadPostService;

@Controller("indexController")
public class IndexController {
	
	@Autowired
	ReadPostService readPost;
	
	@Autowired
	ReadClipService readClip;
	
	@Autowired
	JobAddService jobAddService;
	
	@RequestMapping(value="/main")
	public ModelAndView controllerMain() {
		System.out.println("메인 페이지");
		ModelAndView mv = new ModelAndView();
		
		List<JobAddVO> add = jobAddService.selectAllAdd();
		
	
		
		Condition condition = new Condition();
		
		List<PostDetailVO> postList = readPost.readDetailPostList(1, condition);
		List<ClipDetailVO> clipList = readClip.readClipDetailList(condition);
		mv.addObject("clipDetailList", clipList);
		mv.addObject("postDetailList", postList);
		
		mv.addObject("add", add);
		
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
