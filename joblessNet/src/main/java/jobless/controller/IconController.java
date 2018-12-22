package jobless.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jobless.dao.condition.Condition;
import jobless.model.ClipDetailVO;
import jobless.model.CommentVO;
import jobless.model.IconVO;
import jobless.model.JobAddVO;
import jobless.model.MyIconVO;
import jobless.model.UserVO;
import jobless.service.authuser.AuthUser;
import jobless.service.icon.CreateIconService;
import jobless.service.icon.IconRequest;
import jobless.service.icon.SelectIconService;
import jobless.service.user.GetUserService;
import jobless.service.user.ModifyUserService;

@Controller("iconController")
public class IconController {
	
	@Autowired
	GetUserService getUserService;
	
	@Autowired
	SelectIconService selectIcon;
	
	@Autowired
	CreateIconService createIcon;
	
	@Autowired
	ModifyUserService modifyUser;
	
	@RequestMapping(value = "/selectIconList", method = RequestMethod.GET)
	public ModelAndView selectIconList_GET() {
		
		List<IconVO> iconList = selectIcon.SelectIconByAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("iconList", iconList);
		mv.setViewName("view/service/icon_shop");
		
		return mv;
	}
	
	@RequestMapping(value = "/selectIconInfo", method = RequestMethod.GET)
	public ModelAndView selectIconInfo_GET(@RequestParam("iconId") int iconId) {
		
		IconVO icon = selectIcon.SelectIconById(iconId);
		ModelAndView mv = new ModelAndView();
		mv.addObject("icon", icon);
		mv.setViewName("view/service/icon_buy");
		
		return mv;
	}
	
	@RequestMapping(value = "/selectIconBuy", method = RequestMethod.POST)
	public ModelAndView selectIconBuy_POST(@RequestParam("iconId") int iconId, @RequestParam("userId") int userId, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		
		AuthUser user = (AuthUser) session.getAttribute("authUser");
		
		int havePoint = user.getPoint();
		
		int updatePoint;
		
		if(havePoint >= 500) {
			System.out.println(havePoint);
			createIcon.insertMyIcon(iconId, userId);
			modifyUser.updatePoint(userId);
			//modifyUser.updateIconId(iconId, userId);
			mv.setViewName("view/main/main");
		}else {
			mv.setViewName("view/main/main");
		}
		
		return mv;
	}
	@RequestMapping(value = "/selectMyIconList", method = RequestMethod.GET)
	public ModelAndView selectMyIconList_GET(@RequestParam("userId") int userId) {
		ModelAndView mv = new ModelAndView();
		List<IconVO> iconList = selectIcon.selectMyIconByAll(userId);
		System.out.println(iconList.isEmpty());
		mv.addObject("iconList", iconList);
		mv.setViewName("view/service/icon_change");
		return mv;
	}
	
	@RequestMapping(value = "/selectMyIconChange", method = RequestMethod.POST)
	public ModelAndView selectMyIconChange_POST(@RequestParam("iconId") int iconId, @RequestParam("userId") int userId, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		
		UserVO user = getUserService.getUserByUserId(userId);
		AuthUser authUser = new AuthUser(user.getUserId(), user.getLoginId(), user.getNickName(), user.getEmail(),
				user.getPoint(), user.getAdmin(), user.getPlatformId(),user.isStreamer(), user.getIconId(), user.getFileName());
		System.out.println(user.getFileName());
		System.out.println(user.getIconId());
		session.setAttribute("authUser", authUser);
		
		modifyUser.updateIconId(iconId, userId);
		mv.setViewName("redirect:/main");
		return mv;
	}
}
