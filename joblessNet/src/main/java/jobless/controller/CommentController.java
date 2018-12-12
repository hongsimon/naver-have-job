package jobless.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jobless.model.UserVO;
import jobless.service.authuser.AuthUser;
import jobless.service.clip.ClipRequest;
import jobless.service.comment.CommentRequest;
import jobless.service.comment.DeleteCommentService;
import jobless.service.comment.ReadCommentService;
import jobless.service.comment.WriteCommentService;

@Controller("commentController")
public class CommentController {
	
	@Autowired
	WriteCommentService writeComment;
	
	@Autowired
	ReadCommentService readComment;
	
	@Autowired
	DeleteCommentService deleteComment;
	
	@RequestMapping(value="/insertClipComment", method=RequestMethod.POST)
	public ModelAndView insertClipComment_POST(HttpSession session,
												  @RequestParam("content") String content, 
												  @RequestParam("userId") int userId,
												  @RequestParam("postId") int postId,
												  @RequestParam("clipId") int clipId){
		System.out.println("insertClipComment_POST");
		
		ModelAndView mv = new ModelAndView();
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser 객체가 없습니다. 로그인해주세요");
			mv.setViewName("errorpage");
		}else {
			CommentRequest commentRequest = new CommentRequest(content, userId, postId, clipId);
			writeComment.writeClipComment(commentRequest);
			mv.setViewName("redirect:viewClip");
		}
		return mv;
	}
	
	
	@RequestMapping(value="/insertPostComment", method=RequestMethod.POST)
	public ModelAndView insertPostComment_POST(HttpSession session,
												  @RequestParam("content") String content, 
												  @RequestParam("userId") int userId,
												  @RequestParam("postId") int postId,
												  @RequestParam("clipId") int clipId){
		System.out.println("insertPostComment_POST");
		
		ModelAndView mv = new ModelAndView();
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser 객체가 없습니다. 로그인해주세요");
			mv.setViewName("errorpage");
		}else {
			CommentRequest commentRequest = new CommentRequest(content, userId, postId, clipId);
			writeComment.writePostComment(commentRequest);
			mv.setViewName("redirect:viewClip");
		}
		return mv;
	}
	
	@RequestMapping(value="/deleteComment", method=RequestMethod.GET)
	public ModelAndView deleteComment_GET(HttpSession session,
										@RequestParam int commentId){
		System.out.println("deleteComment_GET");
		
		ModelAndView mv = new ModelAndView();
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser 객체가 없습니다. 로그인해주세요");
			mv.setViewName("errorpage");
		}else {
			AuthUser authUser = (AuthUser) session.getAttribute("authUser");
			deleteComment.delete(commentId);
			mv.setViewName("redirect:viewClip");
		}
		return mv;
	}
}
