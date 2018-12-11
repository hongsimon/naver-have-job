package jobless.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jobless.dao.condition.Condition;
import jobless.model.ClipDetailVO;
import jobless.model.CommentVO;
import jobless.model.UserVO;
import jobless.service.authuser.AuthUser;
import jobless.service.clip.ClipRequest;
import jobless.service.clip.DeleteClipService;
import jobless.service.clip.ModifyClipService;
import jobless.service.clip.ReadClipService;
import jobless.service.clip.WriteClipService;
import jobless.service.comment.ReadCommentService;
import jobless.service.user.GetUserService;


/*
 *  viewPost / GET
	insertPost / GET
	insertPost / POST
	deletePost / GET
	updatePost / GET
	updatePost / POST
 * */
@Controller("clipController")
public class ClipController {
	
	@Autowired
	WriteClipService writeClip;
	
	@Autowired
	ReadClipService readClip;
	
	@Autowired
	DeleteClipService deleteClip;
	
	@Autowired
	ModifyClipService modifyClip;
		
	@Autowired
	ReadCommentService readComment;
	
	@Autowired
	GetUserService getUser;
	
	@RequestMapping(value="/viewClip", method=RequestMethod.GET)
	public ModelAndView viewClip_GET() {
		System.out.println("viewClip_GET");
		
		/* clip 메인페이지 읽어오기 (조건없이 clip 전부 읽어옴)*/
//		List<ClipVO> clipList = readClip.readAllClip();
		Condition condition = new Condition();
		List<ClipDetailVO> clipList = readClip.readClipDetailList(condition);
		ModelAndView mv = new ModelAndView();
		System.out.println(clipList);
		
		if(clipList == null) {
			System.out.println("clip List 불러오기 실패");
			mv.setViewName("errorPage");
		}else {
			mv.addObject("clipDetailList", clipList);
			mv.setViewName("view/border/border-hotClip");
		}
		
		return mv;
	}
	
	@RequestMapping(value="/selectClip", method=RequestMethod.GET)
	public ModelAndView selectClip_GET(@RequestParam int clipId) {
		System.out.println("selectClip_GET");
		
		List<CommentVO> commentList = readComment.readAllByClipId(clipId);
		
		/* clip 하나 읽어오기 */
//		ClipVO clip = readClip.readClip(clipId);
		ClipDetailVO clipDetail = readClip.readClipDetail(clipId);
		ModelAndView mv = new ModelAndView();

//		if(clip == null) {
		if(clipDetail == null) {
			System.out.println("clip 불러오기 실패");
			mv.setViewName("errorPage");
		}else {
//			mv.addObject("clip", clip);
			mv.addObject("clipDetail", clipDetail);
			mv.addObject("commentList", commentList);
			mv.setViewName("view/view/border-hotClip-view");
		}
		return mv;
	}
	
	@RequestMapping(value="/insertClip", method=RequestMethod.GET)
	public ModelAndView insertClip_GET(HttpSession session) {
		System.out.println("insertClip_GET");
		
		ModelAndView mv = new ModelAndView();
		
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser 객체가 없습니다. 로그인해주세요");
			mv.setViewName("errorpage");
		}else {
			mv.setViewName("view/write/border-hotClip-write");
		}
		return mv;
		
	}
	
	@RequestMapping(value="/insertClip", method=RequestMethod.POST)
	public ModelAndView insertPost_POST(HttpSession session,
												  @RequestParam("title") String title, 
												  @RequestParam("clip") String originURL,
												  @RequestParam("clip_url") String clipURL,
												  @RequestParam("clip_Thumbnail") String thumbURL,
												  @RequestParam("writerId") int writerId,
												  @RequestParam("broadcasterNick") String broadcasterNick){
		System.out.println("insertClip_POST");
		UserVO broadcaster = getUser.getUserByNickName(broadcasterNick);
		int broadcasterId = broadcaster.getUserId();
		
		ModelAndView mv = new ModelAndView();

		if(originURL.contains("kakao") || originURL.contains("afree.ca"))
		{
			try {
				if(clipURL.contains("kakao")) {
					System.out.println("카카오다");
				}else if(clipURL.contains("afreeca")){
					System.out.println("아프리카다");
				}
				Document doc = Jsoup.connect(originURL).get();
				String saveURL = doc.select("meta[property=og:video]").attr("content");
				String thumb = doc.select("meta[property=og:image]").attr("content");
				//thumb.substring(0, thumb.indexOf("?ts="));
				System.out.println(thumb);
				System.out.println(saveURL);
				
				if(!saveURL.isEmpty()) {
					clipURL = saveURL;
				}
				thumbURL = thumb;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser 객체가 없습니다. 로그인해주세요");
			mv.setViewName("errorpage");
		}else {
			ClipRequest clipRequest = new ClipRequest(title, clipURL, thumbURL, writerId, broadcasterId);
			writeClip.writeClip(clipRequest);
			mv.setViewName("redirect:viewClip");
		}
		return mv;
	}
	
	@RequestMapping(value="/deleteClip", method=RequestMethod.POST)
	public ModelAndView deleteClip_POST(HttpSession session,
										@RequestParam int clipId){
		System.out.println("deleteClip_POST");
		
		ModelAndView mv = new ModelAndView();
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser 객체가 없습니다. 로그인해주세요");
			mv.setViewName("errorpage");
		}else {
			AuthUser authUser = (AuthUser) session.getAttribute("authUser");
			deleteClip.deleteClip(clipId);
			mv.setViewName("view/view/border-hotClip-view");
		}
		return mv;
	}
	
	/*clip 수정은 킾*/
	
	/*@RequestMapping(value="/modifyClip", method=RequestMethod.GET)
	public ModelAndView modifyClip_GET(HttpSession session) {
		System.out.println("modifyClip_GET");
		
		ModelAndView mv = new ModelAndView();
		
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser 객체가 없습니다. 로그인해주세요");
			mv.setViewName("errorpage");
		}else {
			mv.setViewName("insertClip");
		}
		return mv;
		
	}
	
	@RequestMapping(value="/modifyClip", method=RequestMethod.POST)
	public ModelAndView modifyClip_POST(HttpSession session,
												  @RequestParam("title") String title, 
												  @RequestParam("url") String clipURL, 
												  @RequestParam int broadcasterId){
		System.out.println("insertClip_POST");
		
		ModelAndView mv = new ModelAndView();
		if(session.getAttribute("authUser") == null) {
			System.out.println("authUser 객체가 없습니다. 로그인해주세요");
			mv.setViewName("errorpage");
		}else {
			AuthUser authUser = (AuthUser) session.getAttribute("authUser");
			int writerId = authUser.getUserId();
			ClipRequest clipRequest = new ClipRequest(title, clipURL, writerId, broadcasterId);
			writeClip.writeClip(clipRequest);
			mv.setViewName("viewClip");
		}
		return mv;
	}*/
}