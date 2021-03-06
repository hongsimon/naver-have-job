package jobless.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import jobless.dao.condition.Condition;
import jobless.model.ClipDetailVO;
import jobless.model.UserVO;
import jobless.service.user.GetUserService;

@Controller("testController")
public class TestController {
	@Autowired
	GetUserService getUser;
	
	@RequestMapping(value="/testGetStreamer")
	public ModelAndView controllerMain() {
		System.out.println("메인 페이지");
		ModelAndView mv = new ModelAndView();
		
		List<UserVO> userList = getUser.getStreamerAll();
		
		mv.addObject("userList", userList);
		mv.setViewName("view/test/testGetStreamer");
		return mv;
	}
	
	@RequestMapping(value = "/summer", method = RequestMethod.GET)
	public String controllerTest() {
		return "summer";
	}
	
	@RequestMapping("/imgUpload")
	public void getFile(MultipartFile uploadFile, HttpServletRequest request, HttpServletResponse response) {
		UUID uid = UUID.randomUUID();
		String fileName = uid + "_" +uploadFile.getOriginalFilename(); // 파일명
		
		String uploadPath = "/resources/images/";
		String sDownPath = request.getServletContext().getRealPath(uploadPath);

		File file = new File(sDownPath + fileName);

		try {
			uploadFile.transferTo(file);

			String imgPath = request.getContextPath() + "/images/";
			JSONObject json = new JSONObject();
			
			json.put("url", imgPath + fileName);
			
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json");
			response.getWriter().print(json);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test(@RequestParam String url) {
		return "test2";
	}

}
