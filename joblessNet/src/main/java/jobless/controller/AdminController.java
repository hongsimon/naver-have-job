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
import jobless.model.JobAddVO;
import jobless.model.UserVO;
import jobless.service.authuser.AuthUser;
import jobless.service.board.BoardCategoryRequest;
import jobless.service.board.BoardRequest;
import jobless.service.board.CreateBoardApplyService;
import jobless.service.board.CreateBoardCategoryService;
import jobless.service.board.DeleteBoardApplyService;
import jobless.service.board.InsertBoardService;
import jobless.service.board.ModifyBoardApplyService;
import jobless.service.board.ReadBoardApplyService;
import jobless.service.board.SelectBoardCategoryService;
import jobless.service.jobadd.JobAddService;
import jobless.service.post.ReadPostService;
import jobless.service.user.GetUserService;
import jobless.service.user.ModifyUserService;

@Controller("adminController")
public class AdminController {
	
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
	
	
	//광고 설정
	@RequestMapping(value="/addJobConfig", method=RequestMethod.GET)
	public ModelAndView addJobConfig_GET() {
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("addJobConfig_GET");

		List<JobAddVO> add = jobAddService.selectAllAdd();
		modelAndView.addObject("add", add);
		modelAndView.setViewName("view/manager/manager-banner");

		return modelAndView;
	}
	
	@RequestMapping(value="/addJobConfig", method=RequestMethod.POST)
	public ModelAndView addJobConfig_POST(@RequestParam(name="addId") int addId,
						 				  @RequestParam(name="addTitle") String addTitle,
						 				  @RequestParam(name="addLink") String addLink) {
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("addJobConfig_POST");
		
			jobAddService.modifyAdd(new JobAddVO(addId, addTitle, addLink));
		
		
		
		List<JobAddVO> add = jobAddService.selectAllAdd();
		modelAndView.addObject("add", add);
		modelAndView.setViewName("view/manager/manager-banner");

		return modelAndView;
	}
	
	
	//요청관리 게시판
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
			List<JobAddVO> add = jobAddService.selectAllAdd();
			mv.addObject("add", add);
			mv.addObject("boardApplyList", boardApplyList);
			mv.setViewName("view/manager/manager-checkBroadcasterIn");
		}		
		return mv;
	}
	
	@RequestMapping(value="/adminPermission", method = RequestMethod.GET)
	public ModelAndView adminPermission_GET(HttpSession session, @RequestParam("userId") int userId, 
											@RequestParam("applyId")int applyId
											) {
		ModelAndView mv = new ModelAndView();
		
		AuthUser authUser = (AuthUser) session.getAttribute("authUser");
		List<BoardApplyVO> boardApplyList = readBoardApply.readBoardApplyList();
		String[] categorys = {"공지", "이벤트", "유머", "게임", "방송국"};
		System.out.println(applyId);
		
		if(authUser.isAdmin()==false) {
			System.out.println("어드민 없음");
			System.out.println(authUser.getLoginId());
			System.out.println(authUser.isAdmin());
			mv.setViewName("errorpage");
		}else {
			UserVO user = getUser.getUserByUserId(userId);
			String boardName = user.getNickName();
			int lastInsertBoardId = insertBoard.insert(new BoardRequest(boardName, userId));
						
			for (String string : categorys) {
				createCategory.createBoardCategory(new BoardCategoryRequest(string, lastInsertBoardId));
			}
			
			modifyUser.updateIsStreamer(userId);
			modifyBoardApply.modifyBoardApply(applyId);
			List<JobAddVO> add = jobAddService.selectAllAdd();
			mv.addObject("add", add);
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
			
			List<JobAddVO> add = jobAddService.selectAllAdd();
			mv.addObject("add", add);
			mv.addObject("boardApplyList", boardApplyList);
			mv.setViewName("redirect:adminApplyPage");
		}		
		return mv;
	}
	
}
