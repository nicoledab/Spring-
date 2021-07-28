package test.spring.bean.day2;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/file/")
public class FileBean {
	
	@RequestMapping("uploadForm.do")
	public String form() {
	  return "/0604/uploadForm";
	}
	
	@RequestMapping("uploadPro.do")
	public String pro(String name , MultipartHttpServletRequest ms) {
		
		MultipartFile mf = ms.getFile("save");  //파일 원본
		String fileName = mf.getOriginalFilename(); // 파일 원본 이름 꺼냄 
		File f = new File("c://save//"+fileName); // 복사 위치 
		  try {
			  mf.transferTo(f); // 복사 
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		  ms.setAttribute("filename", fileName);
		  return "/0604/uploadPro";
	}
}
