package test.spring.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // control 설정. 나는 control과 모델 관계를 맺겠다는 뜻 
public class HelloBean {
	
	@Autowired
	private Date day= null;
	
	private DTO dto3 = null;
	
	@RequestMapping("hello.do")  //mapping 설정. 주소에 공백없이! 
	public String hello(){
		//System.out.println("bean-hello()--"+day);
		System.out.println(dto3.getName());
		System.out.println(dto3.getAge());
		System.out.println(dto3.getDay());
		
		return "/WEB-INF/view/0603/hello.jsp";
	}

	//  http://localhost:8080/spring/hello.do
	//   왜 안되지.. 
	
	
//      2.     http://localhost:8080/spring/test.do   이건 된다... 
	@RequestMapping("test.do")
	public String aaa() {
		System.out.println("aaa()");
		return "/WEB-INF/view/0603/hello.jsp";
	}
	
}
