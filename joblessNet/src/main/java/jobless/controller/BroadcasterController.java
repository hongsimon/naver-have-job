package jobless.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jobless.model.BoardApplyVO;
import jobless.model.UserVO;
import jobless.service.authuser.AuthUser;
import jobless.service.board.BoardApplyRequest;
import jobless.service.board.CreateBoardApplyService;
import jobless.service.board.DeleteBoardApplyService;
import jobless.service.board.ModifyBoardApplyService;
import jobless.service.board.ReadBoardApplyService;
import jobless.service.comment.CommentRequest;
import jobless.service.user.GetUserService;
import jobless.service.user.ModifyUserService;

@Controller("broadcasterController")
public class BroadcasterController {
	
	@Autowired
	GetUserService getUser;
	
	@Autowired
	ModifyUserService modifyUser;
	
	@Autowired
	ReadBoardApplyService readBoardApply;
	
	@Autowired
	CreateBoardApplyService createBoardApply;
	
	@Autowired
	ModifyBoardApplyService modifyBoardApply;
	
	@Autowired
	DeleteBoardApplyService deleteBoardApply;
	
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
	
	
	@RequestMapping(value="/adminApplyPage", method = RequestMethod.GET)
	public ModelAndView adminApplyPage_GET(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		
		AuthUser authUser = (AuthUser) session.getAttribute("authUser");
		List<BoardApplyVO> boardApplyList = readBoardApply.readBoardApplyList();
		
		if(authUser.isAdmin()==false) {
			System.out.println("어드민 없음");
			System.out.println(authUser.getLoginId());
			System.out.println(authUser.isAdmin());
			mv.setViewName("errorpage");
		}else {
			mv.addObject("boardApplyList", boardApplyList);
			mv.setViewName("view/manager/manager-checkBroadcasterIn");
		}		
		return mv;
	}
	
	@RequestMapping(value="/adminPermission", method = RequestMethod.GET)
	public ModelAndView adminPermission_GET(HttpSession session, @RequestParam("userId") int userId, @RequestParam("applyId")int applyId) {
		ModelAndView mv = new ModelAndView();
		
		AuthUser authUser = (AuthUser) session.getAttribute("authUser");
		List<BoardApplyVO> boardApplyList = readBoardApply.readBoardApplyList();
		
		System.out.println(applyId);
		
		if(authUser.isAdmin()==false) {
			System.out.println("어드민 없음");
			System.out.println(authUser.getLoginId());
			System.out.println(authUser.isAdmin());
			mv.setViewName("errorpage");
		}else {
			modifyUser.updateIsStreamer(userId);
			modifyBoardApply.modifyBoardApply(applyId);
			mv.addObject("boardApplyList", boardApplyList);
			mv.setViewName("redirect:adminApplyPage");
		}		
		return mv;
	}
	
	@RequestMapping(value="/deleteAdminPermission", method = RequestMethod.GET)
	public ModelAndView deleteAdminPermission_GET(HttpSession session, int applyId) {
		ModelAndView mv = new ModelAndView();
		
		AuthUser authUser = (AuthUser) session.getAttribute("authUser");
		List<BoardApplyVO> boardApplyList = readBoardApply.readBoardApplyList();
		
		if(authUser.isAdmin()==false) {
			System.out.println("어드민 없음");
			System.out.println(authUser.getLoginId());
			System.out.println(authUser.isAdmin());
			mv.setViewName("errorpage");
		}else {
			deleteBoardApply.deleteBoardApply(applyId);
			mv.addObject("boardApplyList", boardApplyList);
			mv.setViewName("redirect:adminApplyPage");
		}		
		return mv;
	}
}
