package test.spring.bean.day4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aop/")
public class AopBean {
	
	@RequestMapping("before.do")
	public String before() {
		System.out.println("bean실행");
		return "/0609/before";
	}
	
	
	
	//afterthrowing() 타겟메서드 동작중 예외발생시 실행
	@RequestMapping("main.do")
	public String main(String id) {
		System.out.println("main실행");
		
     	throw new RuntimeException();
		
	}
	
	
	
}
