package test.spring.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // control ����. ���� control�� �� ���踦 �ΰڴٴ� �� 
public class HelloBean {
	
	@Autowired
	private Date day= null;
	
	private DTO dto3 = null;
	
	@RequestMapping("hello.do")  //mapping ����. �ּҿ� �������! 
	public String hello(){
		//System.out.println("bean-hello()--"+day);
		System.out.println(dto3.getName());
		System.out.println(dto3.getAge());
		System.out.println(dto3.getDay());
		
		return "/WEB-INF/view/0603/hello.jsp";
	}

	//  http://localhost:8080/spring/hello.do
	//   �� �ȵ���.. 
	
	
//      2.     http://localhost:8080/spring/test.do   �̰� �ȴ�... 
	@RequestMapping("test.do")
	public String aaa() {
		System.out.println("aaa()");
		return "/WEB-INF/view/0603/hello.jsp";
	}
	
}
