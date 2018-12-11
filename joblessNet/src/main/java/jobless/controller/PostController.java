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

import jobless.model.PostVO;
import jobless.service.post.DeletePostService;
import jobless.service.post.ModifyPostService;
import jobless.service.post.PostRequest;
import jobless.service.post.ReadPostService;
import jobless.service.post.WritePostService;

@Controller("postController")
public class PostController {

	@Autowired
	ReadPostService readService;
	
	@Autowired
	WritePostService writeService;
	
	@Autowired
	DeletePostService deleteService;
	
	@Autowired
	ModifyPostService modifyService;
	
	@RequestMapping(value="/viewPostList", method=RequestMethod.GET)
	public ModelAndView viewClip_GET() {
		System.out.println("viewPostList_GET");
		
		/* clip 메인페이지 읽어오기 (조건없이 clip 전부 읽어옴)*/
		List<PostVO> postList = readService.readAllPost();
		ModelAndView mv = new ModelAndView();
		
		
		
		if(postList == null) {
			System.out.println("clip List 불러오기 실패");
			mv.setViewName("errorPage");
		}else {
			for(PostVO post : postList) {
				System.out.println(post.toString());
			}
			
			System.out.println("정상 작동");
			mv.addObject("postList", postList);
			mv.setViewName("view/border/border-community");
		}
		
		return mv;
	}
	
	@RequestMapping(value="/viewPost", method=RequestMethod.GET)
	public ModelAndView controllerViewPost_GET(@RequestParam int postId) {
		System.out.println("해당 게시글로  이동"+ postId);
		
		PostVO post = readService.readPostById(postId); // 게시글 클릭시, 게시글의 postId로 해당 게시글에 정보를 가져옴 
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		
		if(post == null) {
			System.out.println("post 못 가져옴");
			mv.setViewName("errorPage");
		}else {
			PostRequest postReq = new PostRequest(postId, 
													0, 
													"고쳐야함", 
													post.getTitle(), 
													post.getWriteDate(), 
													post.getBoardId(), 
													post.getViews(), 
													post.getWriterId(), 
													post.getCategoryId());
			System.out.println(postReq.toString());
			mv.addObject("postReq", postReq); // 게시글 정보를 jsp에 보내기 위해서 
			mv.setViewName("view/view/border-community-view");
		}
		return mv;
	}
	
	// 성공
	@RequestMapping(value="/insertPost", method=RequestMethod.GET)
	public ModelAndView controllerInsertPost_GET(HttpSession session) {
		System.out.println("게시글 작성 페이지로 이동");
		
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		
		if(session.getAttribute("authUser") == null) { // 게시글 적성은 로그인 상태에 가능하기에
			System.out.println("authUser가 null임");
			mv.setViewName("errorPage");
		}else {
			mv.setViewName("insertPost");
			System.out.println("성공");
		}
		return mv;
	}
	
	// 성공 - 하지만 controllerViewPost_GET가 완성이 되야정상 작동됨
	@RequestMapping(value="/insertPost", method=RequestMethod.POST)
	public ModelAndView controllerInsertPost_POST(HttpSession session,
													@RequestParam String postTitle,
													@RequestParam int writerId,
													@RequestParam int boardId,
													@RequestParam int categoryId,
													@RequestParam String content) {
		System.out.println("게시글 작성한 거 올리는 중");
		
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		PostRequest postReq;
		
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser가 null임");
			mv.setViewName("errorPage");
		}else {
			postReq = new PostRequest(postTitle, content, boardId, writerId, categoryId);
			// 적성한 게시글에 정보를 담음
			int postId = writeService.writePost(postReq);
			// insert함 그리고 해당 아이디를 가져옴
			mv = controllerViewPost_GET(postId);
			// 해당 아이디로 자신이 쓴 글로 이동하게 함
			System.out.println("성공");
		}
		return mv;
	}
	
	// 성공
	@RequestMapping(value="/deletePost", method=RequestMethod.POST)
	public ModelAndView controllerDeletePost_POST(HttpSession session, @RequestParam int postId, @RequestParam int contentId) {
		System.out.println("게시글 삭제 진행중");
		
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser가 null임");
			mv.setViewName("errorPage");
		}else {
			deleteService.deletePost(postId, contentId); // 삭제할 아이디를 받아와 삭제
			System.out.println("삭제 성공");
			mv.setViewName("deletePost"); // deletePost라는 페이지로 가서 postList로 이동하는 버튼 만들예정
		}
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
			mv.setViewName("errorPage");
		}else {
			PostVO post = readService.readPostById(postId);
			mv.addObject("post", post); // 게시글 정보를 jsp에 보내기 위해서 
			mv.setViewName("updatePost");
		}
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
			
		}
		return mv;	
	}
}
