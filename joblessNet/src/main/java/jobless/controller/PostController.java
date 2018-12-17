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
import jobless.model.BoardCategoryVO;
import jobless.model.CommentVO;
import jobless.model.ContentVO;
import jobless.model.JobAddVO;
import jobless.model.PostDetailVO;
import jobless.model.PostVO;
import jobless.service.board.ReadBoardService;
import jobless.service.board.SelectBoardCategoryService;
import jobless.service.comment.ReadCommentService;
import jobless.service.comment.WriteCommentService;
import jobless.service.jobadd.JobAddService;
import jobless.service.post.DeletePostService;
import jobless.service.post.ModifyPostService;
import jobless.service.post.PostRequest;
import jobless.service.post.ReadPostService;
import jobless.service.post.WritePostService;

@Controller("postController")
public class PostController {
	
	@Autowired
	WriteCommentService writeComment;
	
	@Autowired
	ReadBoardService readBoard;

	@Autowired
	ReadPostService readPost;
	
	@Autowired
	ReadCommentService readComment;
	
	@Autowired
	SelectBoardCategoryService readBoardCategory;
	
	@Autowired
	WritePostService writeService;
	
	@Autowired
	DeletePostService deleteService;
	
	@Autowired
	ModifyPostService modifyService;
	
	@Autowired
	JobAddService jobAddService;
	
	// 완전 성공
	@RequestMapping(value="/viewPostList", method=RequestMethod.GET)
	public ModelAndView controllerViewPostList_GET(@RequestParam(value="boardId", required=false, defaultValue="0") int boardId,
													@RequestParam(value="categoryId", required=false, defaultValue="0") int categoryId) {
		System.out.println("viewPostList_GET");
		System.err.println(categoryId);
		ModelAndView mv = new ModelAndView();
		List<PostDetailVO> postDetail;
		List<BoardCategoryVO> boardCategory;
		
		boardCategory = readBoardCategory.selectBoardCategotyByAll(); // 카테고리 모두 가져옴 (카테고리 목록 뽑는데 사용)

		if(categoryId != 0 && categoryId != 1) {
			postDetail = readPost.readDetailPostByCategoryId(categoryId); // categoryId로 해당된 post 모두 가져옴 (리스트 뽑는데 사용)
		}else {
			postDetail = readPost.readDetailPostAll(); // 모든 post를 가져옴
		}
		
		
		if(postDetail == null) {
			mv.setViewName("view/error/500");
		}else {
			mv.addObject("postDetail", postDetail);
			mv.addObject("boardCategory", boardCategory);
			mv.setViewName("view/border/border-community");
		}
		
		List<JobAddVO> add = jobAddService.selectAllAdd();
		mv.addObject("add", add);
		
		System.out.println("정상 작동");
		return mv;
	}
	
	
	@RequestMapping(value="/viewPost", method=RequestMethod.GET)
	public ModelAndView controllerViewPost_GET(@RequestParam int postId,
												@RequestParam(value="categoryId", required=false, defaultValue="0") int categoryId) {
		System.out.println("viewPost_GET");
		System.out.println("psotId = "+ postId);
		
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		
		List<CommentVO> comment;
		List<PostVO> postList = null;
		List<BoardCategoryVO> boardCategoryList;
		List<PostDetailVO> postDetailAll;

		PostDetailVO postDetail;
		BoardCategoryVO boardCategory;
		
		int countComment;
	
		try {
			readPost.readPostById(postId); // 조회수 증가
			comment = readComment.readAllByPostId(postId); // 해당글에 댓글들
			countComment = readComment.readCountPostComment(postId); // 댓글 개수
			postDetail = readPost.readPostByDetail(postId); // 해당글 정보
			boardCategoryList = readBoardCategory.selectBoardCategotyByAll(); // 카테고리 모두 가져옴 (카테고리 목록 뽑는데 사용)
			
			if(categoryId != 0 && categoryId != 1) { // 게시물 가져오기
				postDetailAll = readPost.readDetailPostByCategoryId(categoryId); // categoryId로 해당된 post 모두 가져옴 (리스트 뽑는데 사용)
			}else {
				postDetailAll = readPost.readDetailPostAll(); // 모든 post를 가져옴
			}
			postList = readPost.readAllPost(); // psot에 모든 정보가져옴
			
			int boardCategoryId = postDetail.getPost().getCategoryId();
			
			boardCategory = readBoardCategory.selectBoardCategotyById(boardCategoryId);
		} catch (ReadPostException e) {
			System.out.println("viewPost Error");
			errors.put("ReadPostException", true);
			e.getMessage();
			mv.setViewName("view/error/500");
			return mv;
		}
			List<JobAddVO> add = jobAddService.selectAllAdd();
			mv.addObject("add", add);
		
			mv.addObject("postDetail", postDetail);
			mv.addObject("postDetailAll", postDetailAll);
			mv.addObject("comment", comment);
			mv.addObject("count", countComment);
			mv.addObject("boardCategory", boardCategory);
			mv.addObject("postList",postList);
			mv.addObject("boardCategoryList", boardCategoryList);
			mv.setViewName("view/view/border-community-view");
		return mv;
	}
	
	// 성공
	@RequestMapping(value="/insertPost", method=RequestMethod.GET)
	public ModelAndView controllerInsertPost_GET(HttpSession session, @RequestParam int boardId) {
		System.out.println("게시글 작성 페이지로 이동");
		
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		System.out.println(boardId);
		if(session.getAttribute("authUser") == null) { // 게시글 적성은 로그인 상태에 가능하기에
			System.out.println("authUser가 null임");
			mv.setViewName("view/loginPage/login-main");
		}else {
			PostRequest postReq = new PostRequest(); 
			postReq.setBoardId(boardId);
			mv.addObject("postReq", postReq);
			mv.setViewName("view/write/border-community-write");
			System.out.println("성공");
		}
		List<JobAddVO> add = jobAddService.selectAllAdd();
		mv.addObject("add", add);
		return mv;
	}
	
	// 성공
	@RequestMapping(value="/insertPost", method=RequestMethod.POST)
	public ModelAndView controllerInsertPost_POST(HttpSession session,
													@RequestParam String postTitle,
													@RequestParam int writerId,
													@RequestParam("borderName") String borderName,
													@RequestParam int boardId,
													@RequestParam String content) {
		System.out.println("게시글 작성한 거 올리는 중");
		
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		PostRequest postReq;
		int categoryId;
		
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser가 null임");
			mv.setViewName("view/loginPage/login-main");
		}else {
			System.out.println(borderName);
			switch (borderName) {
			case "freeTalk":
				categoryId = 1;
				break;
			case "joke":
				categoryId = 2;
				break;
			case "news":
				categoryId = 3;
				break;
			case "game":
				categoryId = 4;
				break;
			default:
				categoryId = 0;
				break;
			}
			if(categoryId != 0 && categoryId > 0 && categoryId < 5) {
				postReq = new PostRequest(postTitle, content, boardId, writerId, categoryId);
				// 적성한 게시글에 정보를 담음
				int postId = writeService.writePost(postReq);
				// insert함 그리고 해당 아이디를 가져옴
				mv = controllerViewPost_GET(postId, 0);
				// 해당 아이디로 자신이 쓴 글로 이동하게 함
				System.out.println("성공");
			}else {
				System.out.println("게시판이 선택되지않았거나 오류");
			}
		}
		List<JobAddVO> add = jobAddService.selectAllAdd();
		mv.addObject("add", add);
		return mv;
	}
	
	// 성공
	@RequestMapping(value="/deletePost", method=RequestMethod.GET)
	public ModelAndView controllerDeletePost_POST(HttpSession session, 
													@RequestParam("postId") int postId, 
													@RequestParam int contentId, 
													@RequestParam("writerId") int writerId, 
													@RequestParam("authUserUserId") int userId) {
		System.out.println("게시글 삭제 진행중");
		
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		
		if(session.getAttribute("authUser") == null || writerId != userId) {
			System.out.println("authUser가 null임 아니면 자신의 글이 아님");
			mv.setViewName("view/loginPage/login-main");
		}else {
			deleteService.deletePost(postId, contentId); // 삭제할 아이디를 받아와 삭제
			System.out.println("삭제 성공");
			mv.setViewName("view/border/border-community"); // deletePost라는 페이지로 가서 postList로 이동하는 버튼 만들예정
		}
		List<JobAddVO> add = jobAddService.selectAllAdd();
		mv.addObject("add", add);
		return mv;
	}
	
	// 
	@RequestMapping(value="/updatePost", method=RequestMethod.GET)
	public ModelAndView controllerUpdatePost_GET(HttpSession session, @RequestParam int postId) {
		System.out.println("게시글 수정 정보 가져오는 중");
		
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser가 null임");
			mv.setViewName("view/loginPage/login-main");
		}else {
			PostVO post = readPost.readPostById(postId);
			ContentVO content = readPost.readContentById(post.getContentId());
			
			PostRequest postReq = new PostRequest(post.getTitle(), content.getContent(), post.getBoardId(), post.getWriterId(), post.getCategoryId());
			mv.addObject("postReq", postReq); // 게시글 정보를 jsp에 보내기 위해서
			mv.setViewName("view/write/border-community-write");
		}
		List<JobAddVO> add = jobAddService.selectAllAdd();
		mv.addObject("add", add);
		return mv;
	}
	
	@RequestMapping(value="/updatePost", method=RequestMethod.POST)
	public ModelAndView controllerUpdatePost_POST(HttpSession session,
													@RequestParam int postId,
													@RequestParam int contentId,
													@RequestParam String title,
													@RequestParam String content,
													@RequestParam int categoryId) {
		System.out.println("게시글 수정 정보 가져오는 중");
		
		ModelAndView mv = new ModelAndView();
		
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser가 null임");
			mv.setViewName("errorPage");
		}else {
			PostRequest postReq = new PostRequest(postId, contentId, title, content, categoryId);
			modifyService.modifyPost(postReq);
			controllerViewPost_GET(postId, 0);
		}
		List<JobAddVO> add = jobAddService.selectAllAdd();
		mv.addObject("add", add);
		return mv;	
	}
}
