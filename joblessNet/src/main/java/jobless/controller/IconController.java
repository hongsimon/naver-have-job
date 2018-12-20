package jobless.controller;

import java.util.List;

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
import jobless.service.icon.SelectIconService;

@Controller("iconController")
public class IconController {

	@Autowired
	SelectIconService selectIcon;
	
	@RequestMapping(value = "/selectIconList", method = RequestMethod.GET)
	public ModelAndView selectIconList_GET() {
		
		List<IconVO> iconList = selectIcon.SelectIconByAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("iconList", iconList);
		mv.setViewName("view/service/icon_shop");
		
		return mv;
	}

}
