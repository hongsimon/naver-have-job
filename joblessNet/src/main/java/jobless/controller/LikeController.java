package jobless.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jobless.exception.NotMoreLikeException;
import jobless.model.LikeVO;
import jobless.service.like.InsertLikeService;
import jobless.service.like.SelectLikeService;

@Controller("likeController")
public class LikeController {

	@Autowired
	InsertLikeService insertLikeService;
	
	@Autowired
	SelectLikeService selectLikeService;
	
	@RequestMapping(value="/clipLike", method=RequestMethod.POST)
	public ModelAndView ClipLike_POST(
								@RequestParam int userId,
								@RequestParam int clip_or_postId
							   ) {
		
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		ModelAndView modelAndView = new ModelAndView();

		
		try {
			modelAndView.addObject("errors", errors);
			modelAndView.addObject("clip_or_postId", clip_or_postId);
			selectLikeService.selectLikeClip(new LikeVO(userId, clip_or_postId));
			
			insertLikeService.insertLikeClip(new LikeVO(userId, clip_or_postId));
		}catch (NotMoreLikeException e) {
			errors.put("NotMoreLike", true);
			e.getMessage();
			modelAndView.setViewName("view/view/border-hotClip-view");
			return modelAndView;
		}
		modelAndView.setViewName("redirect:/selectClip?clipId="+clip_or_postId);
		return modelAndView;
	}
	
	@RequestMapping(value="/postLike", method=RequestMethod.POST)
	public ModelAndView PostLike_POST(
								@RequestParam int userId,
								@RequestParam int clip_or_postId
							   ) {
		
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		ModelAndView modelAndView = new ModelAndView();

		
		try {
			modelAndView.addObject("errors", errors);
			modelAndView.addObject("clip_or_postId", clip_or_postId);
			selectLikeService.selectLikePost(new LikeVO(userId, clip_or_postId));
			
			insertLikeService.insertLikeClip(new LikeVO(userId, clip_or_postId));
		}catch (NotMoreLikeException e) {
			errors.put("NotMoreLike", true);
			e.getMessage();
			modelAndView.setViewName("view/view/border-community-view");
			return modelAndView;
		}
		modelAndView.setViewName("redirect:/viewPost?postId="+clip_or_postId);
		return modelAndView;
	}
	
}
