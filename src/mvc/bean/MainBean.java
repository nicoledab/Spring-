package mvc.bean;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import test.spring.bean.DTO;

@Controller
public class MainBean {

	@RequestMapping("form.do")
	public String main() {
		return "/WEB-INF/view/0603/form.jsp";
	}
	
	@RequestMapping("formPro.do")
	public String pro(String name, int age, DTO dto, HttpServletRequest request ) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("age"));
		
		request.setAttribute("name", name);
		
		return "/WEB-INF/view/0603/formPro.jsp";
	}
}
