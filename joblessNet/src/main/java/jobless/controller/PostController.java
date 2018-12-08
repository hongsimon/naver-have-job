package jobless.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.cj.Session;

import jobless.model.PostVO;
import jobless.service.post.PostRequest;
import jobless.service.post.ReadPostService;
import jobless.service.post.WritePostService;

@Controller("postController")
public class PostController {

	@Autowired
	ReadPostService readService;
	
	@Autowired
	WritePostService writeService;
	
	@RequestMapping(value="/viewPost", method=RequestMethod.GET)
	public ModelAndView controllerViewPost_GET(@RequestParam int postId) {
		System.out.println("해당 게시글로  이동"+ postId);
		
		PostVO post = readService.readPostById(postId);
		ModelAndView mv = new ModelAndView();
		
		if(post == null) {
			System.out.println("post 못 가져옴");
			mv.setViewName("errorPage");
		}else {
			mv.addObject("post", post);
			mv.setViewName("viewPost");
		}
		return mv;
	}
	
	@RequestMapping(value="/insertPost", method=RequestMethod.GET)
	public ModelAndView controllerInsertPost_GET(@RequestAttribute HttpSession session) {
		System.out.println("게시글 작성 페이지로 이동");
		
		ModelAndView mv = new ModelAndView();
		
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser가 null임");
			mv.setViewName("errorPage");
		}else {
			mv.setViewName("insertPost");
			System.out.println("성공");
		}
		return mv;
	}
	
	public String controllerInsertPost_POST() {
		return null;
	}
	
	public String controllerDeletePost_GET() {
		return null;
	}
	
	public String controllerUpdatePost_GET() {
		return null;
	}
	
	public String controllerUpdatePost_POST() {
		return null;	
	}
}
