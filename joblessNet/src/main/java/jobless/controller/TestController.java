package jobless.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

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

	@RequestMapping("/getFile")
	public void getFile(MultipartFile mulFile, HttpServletRequest request) {
		String fileName = mulFile.getOriginalFilename(); // 파일명
		
		String uploadPath = "/resources/images/";
		String sDownPath = request.getServletContext().getRealPath(uploadPath);
		int size = 10 * 1024 * 1024; // 업로드 사이즈 제한 10M 이하

		File file = new File(sDownPath + fileName);

		System.out.println(file.getPath());
		try {
			mulFile.transferTo(file);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
	}

}
