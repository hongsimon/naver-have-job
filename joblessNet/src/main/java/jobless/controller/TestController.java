package jobless.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller("testController")
public class TestController {
	@RequestMapping(value = "/summer", method = RequestMethod.GET)
	public String controllerTest() {
		return "summer";
	}

	@RequestMapping("/imgUpload")
	public void getFile(MultipartFile uploadFile, HttpServletRequest request, HttpServletResponse response) {
		String fileName = uploadFile.getOriginalFilename(); // 파일명
		
		String uploadPath = "/resources/images/";
		String sDownPath = request.getServletContext().getRealPath(uploadPath);

		File file = new File(sDownPath + fileName);

		try {
			uploadFile.transferTo(file);

			String imgPath = request.getContextPath() + "/images/";
			JSONObject json = new JSONObject();
			
			json.put("url", imgPath + fileName);
			
			response.setContentType("application/json");
			response.getWriter().print(json);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
	}

}
