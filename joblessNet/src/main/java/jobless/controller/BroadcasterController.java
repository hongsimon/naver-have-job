package jobless.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jobless.model.UserVO;
import jobless.service.board.BoardApplyRequest;
import jobless.service.board.CreateBoardApplyService;
import jobless.service.comment.CommentRequest;
import jobless.service.user.GetUserService;

@Controller("broadcasterController")
public class BroadcasterController {
	
	@Autowired
	GetUserService getUser;
	
	@Autowired
	CreateBoardApplyService createBoardApply;
	
	@RequestMapping(value="/broadcasterList", method = RequestMethod.GET)
	public ModelAndView broadcaster_GET() {
		ModelAndView mv = new ModelAndView();
		
		List<UserVO> streamerList = getUser.getStreamerAll();
		
		mv.addObject("streamerList", streamerList);
		mv.setViewName("view/border/border-broadcasterCommunity");
		return mv;
	}
	
	@RequestMapping(value="/broadcasterApply", method = RequestMethod.GET)
	public ModelAndView streamerList_GET() {
		ModelAndView mv = new ModelAndView();
				
		mv.setViewName("view/service/broadcaster_application");
		return mv;
	}
	
	@RequestMapping(value="/broadcasterApply", method=RequestMethod.POST)
	public ModelAndView broadcasterApply_POST(HttpSession session,
												  @RequestParam("userId") int userId,
												  @RequestParam("content") String content, 												  
												  @RequestParam("broadcasterURL") String broadcasterURL){
		
		ModelAndView mv = new ModelAndView();
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser 객체가 없습니다. 로그인해주세요");
			mv.setViewName("errorpage");
		}else {
			BoardApplyRequest boardApplyRequest = new BoardApplyRequest(userId, content, broadcasterURL);
			createBoardApply.createBoardApply(boardApplyRequest);
			mv.setViewName("redirect:main");
		}
		return mv;
	}
	
}
