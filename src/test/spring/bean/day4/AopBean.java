package test.spring.bean.day4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aop/")
public class AopBean {
	
	@RequestMapping("before.do")
	public String before() {
		System.out.println("bean����");
		return "/0609/before";
	}
	
	
	
	//afterthrowing() Ÿ�ٸ޼��� ������ ���ܹ߻��� ����
	@RequestMapping("main.do")
	public String main(String id) {
		System.out.println("main����");
		
     	throw new RuntimeException();
		
	}
	
	
	
}
