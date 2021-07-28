package test.spring.bean.day5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import test.spring.bean.day3.TestDTO;

@Controller
@RequestMapping("/dao/")
public class TestDAOBean {
	
	@Autowired
	private TestDAOImpl testImpl = null; // TestDAOInter dao = new TestDAOImpl();
	
	
	@RequestMapping("form.do")
	public String form() throws Exception{
		
		return "/0611/form";
	}
	
	
	@RequestMapping("testInsert.do")
	public String insert(TestDTO dto) throws Exception{
		
		testImpl.testInsert(dto);
		
		return "/0611/test";
	}
	
	
}
