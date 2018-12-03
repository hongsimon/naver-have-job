package jobless.controller;

import javax.management.AttributeValueExp;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jobless.service.post.PostRequest;
import jobless.service.post.WritePostService;

@Controller("mainController")
public class MainController {
	
	@Autowired
	WritePostService writePost;
	
	@RequestMapping(value="/test", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView controllerTest() {
		ModelAndView a = new ModelAndView();
		PostRequest postReq	= new PostRequest();
		writePost.writePost(postReq);
		
		return a;
	}
	
}
