package jobless.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jobless.exception.ReadPostException;
import jobless.model.BoardApplyVO;
import jobless.model.BoardCategoryVO;
import jobless.model.JobAddVO;
import jobless.model.PostDetailVO;
import jobless.model.PostVO;
import jobless.model.UserVO;
import jobless.service.authuser.AuthUser;
import jobless.service.board.BoardApplyRequest;
import jobless.service.board.BoardCategoryRequest;
import jobless.service.board.BoardRequest;
import jobless.service.board.CreateBoardApplyService;
import jobless.service.board.CreateBoardCategoryService;
import jobless.service.board.DeleteBoardApplyService;
import jobless.service.board.InsertBoardService;
import jobless.service.board.ModifyBoardApplyService;
import jobless.service.board.ReadBoardApplyService;
import jobless.service.board.SelectBoardCategoryService;
import jobless.service.comment.CommentRequest;
import jobless.service.jobadd.JobAddService;
import jobless.service.post.ReadPostService;
import jobless.service.user.GetUserService;
import jobless.service.user.ModifyUserService;

@Controller("broadcasterController")
public class BroadcasterController {
	
	@Autowired
	ReadPostService readPost;
	
	@Autowired
	SelectBoardCategoryService selectCategory;
	
	@Autowired
	GetUserService getUser;
	
	@Autowired
	ModifyUserService modifyUser;
	
	@Autowired
	InsertBoardService insertBoard;
	
	@Autowired
	ReadBoardApplyService readBoardApply;
	
	@Autowired
	CreateBoardApplyService createBoardApply;
	
	@Autowired
	ModifyBoardApplyService modifyBoardApply;
	
	@Autowired
	DeleteBoardApplyService deleteBoardApply;

	@Autowired
	CreateBoardCategoryService createCategory;
	
	@Autowired
	JobAddService jobAddService;
	
	@RequestMapping(value="/broadcasterBoardList", method=RequestMethod.GET)
	public ModelAndView broadcasterBoardList_GET(@RequestParam("boardId")int boardId) {
		System.out.println("broadcasterBoardList_GET");
		
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		List<PostVO> postList;
		List<BoardCategoryVO> boardCategory;
		
		try {
			postList = readPost.readPostByBoardId(boardId);
			//boardCategory = selectCategory.
		} catch (ReadPostException e) {
			System.out.println("viewPostList Error");
			errors.put("ReadPostException", true);
			e.getMessage();
			mv.setViewName("view/error/500");
			return mv;
		}
		
//		for(PostDetailVO post : postDetail) {
//			System.out.println(post.toString());
//		}
		mv.addObject("postList", postList);
		List<JobAddVO> add = jobAddService.selectAllAdd();
		mv.addObject("add", add);
		mv.setViewName("view/border/border-community");

		System.out.println("정상 작동");
		return mv;
	}
	
	@RequestMapping(value="/broadcasterList", method = RequestMethod.GET)
	public ModelAndView broadcaster_GET() {
		 
		
		ModelAndView mv = new ModelAndView();
		
		List<UserVO> streamerList = getUser.getStreamerAll();
		
		List<JobAddVO> add = jobAddService.selectAllAdd();
		mv.addObject("add", add);
		mv.addObject("streamerList", streamerList);
		mv.setViewName("view/border/border-broadcasterCommunity");
		return mv;
	}
	
	@RequestMapping(value="/broadcasterApply", method = RequestMethod.GET)
	public ModelAndView streamerList_GET() {
		ModelAndView mv = new ModelAndView();
		List<JobAddVO> add = jobAddService.selectAllAdd();
		mv.addObject("add", add);
				
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
		
		List<JobAddVO> add = jobAddService.selectAllAdd();
		mv.addObject("add", add);
		return mv;
	}
	
}
