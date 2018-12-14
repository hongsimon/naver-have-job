package jobless.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jobless.model.UserVO;
import jobless.service.user.GetUserService;

@Controller("broadcasterController")
public class BroadcasterController {
	
	@Autowired
	GetUserService getUser;
	
	@RequestMapping(value="/streamerList", method = RequestMethod.GET)
	public ModelAndView streamerList_GET() {
		System.out.println("메인 페이지");
		ModelAndView mv = new ModelAndView();
		
		List<UserVO> streamerList = getUser.getStreamerAll();
		
		mv.addObject("streamerList", streamerList);
		mv.setViewName("view/border/border-broadcasterCommunity");
		return mv;
	}
	
}
