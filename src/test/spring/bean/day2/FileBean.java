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
		
		MultipartFile mf = ms.getFile("save");  //���� ����
		String fileName = mf.getOriginalFilename(); // ���� ���� �̸� ���� 
		File f = new File("c://save//"+fileName); // ���� ��ġ 
		  try {
			  mf.transferTo(f); // ���� 
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		  ms.setAttribute("filename", fileName);
		  return "/0604/uploadPro";
	}
}
