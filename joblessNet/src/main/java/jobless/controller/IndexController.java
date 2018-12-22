package jobless.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jobless.dao.condition.Condition;
import jobless.dao.condition.Id;
import jobless.dao.condition.Order;
import jobless.model.ClipDetailVO;
import jobless.model.JobAddVO;
import jobless.model.PostDetailVO;
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
		Condition condition1 = new Condition();
		
		
		List<PostDetailVO> postAllList = readPost.readDetailPostList(1, condition);
		
		Order order = new Order();
		order.setLikes(true);
		condition1.setOrder(order);
		List<PostDetailVO> postLikeList = readPost.readDetailPostList(1, condition1);
		
		Id id = new Id();
		id.setCategoryId(2);
		condition1.setId(id);
		List<PostDetailVO> postNoticeList = readPost.readDetailPostList(1, condition1);
		
		id.setCategoryId(3);
		condition1.setId(id);
		List<PostDetailVO> postEventList = readPost.readDetailPostList(1, condition1);
		
		List<ClipDetailVO> clipList = readClip.readClipDetailList(condition);
		
		mv.addObject("postAllList", postAllList);
		mv.addObject("postLikeList", postLikeList);
		mv.addObject("postNoticeList", postNoticeList);
		mv.addObject("postEventList", postEventList);
		
		mv.addObject("clipDetailList", clipList);
		
		for(PostDetailVO posts : postLikeList) {
			System.out.println(posts.toString());
		}
		
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
