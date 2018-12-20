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

import jobless.dao.condition.Condition;
import jobless.dao.condition.Id;
import jobless.dao.condition.Limit;
import jobless.dao.condition.Order;
import jobless.dao.condition.Period;
import jobless.dao.condition.Text;
import jobless.exception.ReadPostException;
import jobless.model.BoardCategoryVO;
import jobless.model.CommentVO;
import jobless.model.ContentVO;
import jobless.model.CriteriaVO;
import jobless.model.PageMakerVO;
import jobless.model.PostDetailVO;
import jobless.model.PostVO;
import jobless.service.board.ReadBoardService;
import jobless.service.board.SelectBoardCategoryService;
import jobless.service.comment.ReadCommentService;
import jobless.service.comment.WriteCommentService;
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
	WritePostService writeService;

	@Autowired
	DeletePostService deleteService;
	
	@Autowired
	ModifyPostService modifyService;

	@Autowired
	ReadBoardService readBoard;

	@Autowired
	ReadPostService readPost;
	
	@Autowired
	ReadCommentService readComment;
	
	@Autowired
	SelectBoardCategoryService readBoardCategory;
	
	// 완전 성공
	@RequestMapping(value="/viewPostList", method=RequestMethod.GET)
	public ModelAndView controllerViewPostList_GET(@RequestParam(value="boardId", required=false, defaultValue="1") int boardId,
													@RequestParam(value="categoryId", required=false, defaultValue="0") int categoryId,
													@RequestParam(value = "page", required = false) String pageStr) {
		System.out.println("viewPostList_GET");
		
		ModelAndView mv = new ModelAndView();
		BoardCategoryVO boardCategory = new BoardCategoryVO();
		Condition condition = new Condition();
		
		List<BoardCategoryVO> boardCategoryList;		
		List<PostDetailVO> postList;
		
		PostVO post;
		PostDetailVO postDetail;
		CriteriaVO cri;
		PageMakerVO pageMaker;
		
		
		Id id;
		Text text;
		Period period;
		Limit limit;
		Order order;
		
		int page;
		int index;
		int postPerPage;
		int postTotalCountPage;
		
		// 페이징 -------------------------------------------------------------
		
		if(pageStr == null || pageStr.trim().isEmpty()) {
			page = 1;
		} else {
			page = Integer.parseInt(pageStr);
		}
		
		postPerPage = 5;
		
		cri = new CriteriaVO();
		cri.setPage(page);
		cri.setPerPageNum(postPerPage);
		
		
		index = cri.getPageStart();
		limit = new Limit(index, postPerPage);
		
		pageMaker = new PageMakerVO();
		
		post = new PostVO();
		post.setBoardId(boardId);
		post.setCategoryId(categoryId);
		postTotalCountPage = readPost.readPostTotalCount(post);
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(postTotalCountPage);
		
		condition.setLimit(limit);
		
//		for(PostDetailVO post :postList) {
//			System.out.println("리스트임"+post.toString());
//		}
		
		// -------------------------------------------------------------------
		
		// 카테고리 목록 가져오기
		boardCategoryList = readBoardCategory.selectBoardCategoryByBoardId(boardId); // 해당 보드에 맞는 카테고리 모두 가져옴 (카테고리 목록 뽑는데 사용)
		id = new Id();
		id.setCategoryId(categoryId);
		condition.setId(id);
		postList = readPost.readDetailPostList(boardId, condition); // 해당 보드에 맞는 모든 post를 가져옴
		
		
		if(postList == null) {
			mv.setViewName("view/error/500");
		}else {
			mv.addObject("postDetail", postList); // 페이징하는 것
			mv.addObject("pageMaker", pageMaker); // 페이징 페이지 개수
			mv.addObject("boardCategory", boardCategoryList); // 카테고리 한것
			mv.setViewName("view/border/border-community");
		}
		
		System.out.println("정상 작동");
		return mv;
	}

	
	@RequestMapping(value="/viewPost", method=RequestMethod.GET)
	public ModelAndView controllerViewPost_GET(@RequestParam(value="postId") int postId,
												@RequestParam(value="boardId") int boardId,
												@RequestParam(value="categoryId", required=false) int categoryId,
												@RequestParam(value = "page", required = false) String pageStr) {
		System.out.println("viewPost_GET");
		System.out.println("psotId = "+ postId);
		System.out.println("categoryId = "+ categoryId);
		System.out.println("boardId = "+ boardId);
		
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		Condition condition = new Condition();
		
		List<CommentVO> comment;
		List<BoardCategoryVO> boardCategoryList;
		List<PostDetailVO> postList;
		
		BoardCategoryVO boardCategory;
		PostVO post;
		PostDetailVO postDetail;
		CriteriaVO cri;
		PageMakerVO pageMaker;
		
		
		Id id;
		Text text;
		Period period;
		Limit limit;
		Order order;
		
		int page;
		int index;
		int postPerPage;
		int postTotalCountPage;
		int countComment;
		
		// 페이징 -------------------------------------------------------------
		
		if(pageStr == null || pageStr.trim().isEmpty()) {
			page = 1;
		} else {
			page = Integer.parseInt(pageStr);
		}
				
		postPerPage = 5;
			
		cri = new CriteriaVO();
		cri.setPage(page);
		cri.setPerPageNum(postPerPage);
				
				
		index = cri.getPageStart();
		limit = new Limit(index, postPerPage);
				
		pageMaker = new PageMakerVO();
				
		post = new PostVO();
		post.setBoardId(boardId);
		post.setCategoryId(categoryId);
		postTotalCountPage = readPost.readPostTotalCount(post);
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(postTotalCountPage);
				
		condition.setLimit(limit);
				
//		for(PostDetailVO post :postList) {
//			System.out.println("리스트임"+post.toString());
//		}
				
		// -------------------------------------------------------------------
	
		try {
			postDetail = readPost.readPostByDetail(postId); // 해당글 정보
			boardCategoryList = readBoardCategory.selectBoardCategoryByBoardId(boardId); // 해당 보드에 맞는 카테고리 모두 가져옴 (카테고리 목록 뽑는데 사용)
			readPost.readPostById(postId); // 조회수 증가
			
			
			countComment = readComment.readCountPostComment(postId); // 댓글 개수
			comment = readComment.readAllByPostId(postId); // 해당글에 댓글들
			
			
			postList = readPost.readDetailPostList(boardId, condition); // 해당 보드에 맞는 모든 post를 가져옴
			
			int boardCategoryId = postDetail.getPost().getCategoryId();
			boardCategory = readBoardCategory.selectBoardCategotyById(boardCategoryId);
			System.out.println(boardCategory.getCategoryName());
		
		} catch (ReadPostException e) {
			System.out.println("viewPost Error");
			errors.put("ReadPostException", true);
			e.getMessage();
			mv.setViewName("view/error/500");
			return mv;
		}
		
		
		mv.addObject("postDetail", postDetail);
		mv.addObject("postList", postList);
		mv.addObject("comment", comment);
		mv.addObject("count", countComment);
		mv.addObject("boardCategory", boardCategory);
		mv.addObject("boardCategoryList", boardCategoryList);
		mv.setViewName("view/view/border-community-view");
		return mv;
	}
	
	// 성공
	@RequestMapping(value="/insertPost", method=RequestMethod.GET)
	public ModelAndView controllerInsertPost_GET(HttpSession session, 
													@RequestParam int boardId,
													@RequestParam int categoryId) {
		System.out.println("게시글 작성 페이지로 이동");
		System.out.println("boardId"+boardId);
		
		ModelAndView mv = new ModelAndView();
		
		List<BoardCategoryVO> boardCategoryList;
		
		if(session.getAttribute("authUser") == null) { // 게시글 적성은 로그인 상태에 가능하기에
			System.out.println("authUser가 null임");
			mv.setViewName("view/loginPage/login-main");
		}else {
			boardCategoryList = readBoardCategory.selectBoardCategoryByBoardId(boardId); // 해당 보드에 맞는 카테고리 모두 가져옴 (카테고리 목록 뽑는데 사용)
			PostRequest postReq = new PostRequest(); 
			postReq.setBoardId(boardId);
			postReq.setCategoryId(categoryId);
			mv.addObject("postReq", postReq);
			mv.addObject("boardCategoryList",boardCategoryList);
			mv.setViewName("view/write/border-community-write");
			System.out.println("성공");
		}
		return mv;
	}
	
	// 성공
	@RequestMapping(value="/insertPost", method=RequestMethod.POST)
	public ModelAndView controllerInsertPost_POST(HttpSession session,
													@RequestParam String postTitle,
													@RequestParam int writerId,
													@RequestParam("borderName") int categoryId,
													@RequestParam String content,
													@RequestParam int boardId) {
		System.out.println("게시글 작성한 거 올리는 중");
		
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		PostRequest postReq;
		
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser가 null임");
			mv.setViewName("view/loginPage/login-main");
		}else {
			System.out.println("categoryId="+categoryId);
			postReq = new PostRequest(postTitle, content, boardId, writerId, categoryId);
				// 적성한 게시글에 정보를 담음
				int postId = writeService.writePost(postReq);
				// insert함 그리고 해당 아이디를 가져옴
				mv = controllerViewPost_GET(postId, boardId, 0, null);
				// 해당 아이디로 자신이 쓴 글로 이동하게 함
				System.out.println("성공");
		}
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
		
		if(session.getAttribute("authUser") == null || writerId != userId) {
			System.out.println("authUser가 null임 아니면 자신의 글이 아님");
			mv.setViewName("view/loginPage/login-main");
		}else {
			deleteService.deletePost(postId, contentId); // 삭제할 아이디를 받아와 삭제
			System.out.println("삭제 성공");
			mv.setViewName("view/border/border-community"); // deletePost라는 페이지로 가서 postList로 이동하는 버튼 만들예정
		}
		return mv;
	}
	
	// 
	@RequestMapping(value="/updatePost", method=RequestMethod.GET)
	public ModelAndView controllerUpdatePost_GET(HttpSession session, 
												@RequestParam int postId,
												@RequestParam int boardId) {
		System.out.println("게시글 수정 정보 가져오는 중");
		
		ModelAndView mv = new ModelAndView();
		
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser가 null임");
			mv.setViewName("view/loginPage/login-main");
		}else {
			PostVO post = readPost.readPostById(postId);
			ContentVO content = readPost.readContentById(post.getContentId());
			
			PostRequest postReq = new PostRequest(postId, content.getContentId(), post.getTitle(), content.getContent(), boardId, post.getCategoryId());
			mv.addObject("postReq", postReq); // 게시글 정보를 jsp에 보내기 위해서
			mv.setViewName("view/write/border-community-write");
		}
		return mv;
	}
	
	@RequestMapping(value="/updatePost", method=RequestMethod.POST)
	public ModelAndView controllerUpdatePost_POST(HttpSession session,
													@RequestParam int postId,
													@RequestParam int boardId,
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
			mv = controllerViewPost_GET(postId, boardId, categoryId, null); // 수정
		}
		return mv;	
	}
}
	