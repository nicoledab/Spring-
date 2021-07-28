package test.spring.bean.day3;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dbBean {
	
	@Autowired
	private SqlSessionTemplate dao =null;
	
	
	// selectList 는 여러개 불러오기
	// selectone 은 하나만 불러오기 
	@RequestMapping("/mybatis/allId.do")
	public String allid(Model model) {
		
		List list = dao.selectList("test.allId");
		
		Object obj = dao.selectOne("test.idage","java");
		
	    List list2 = dao.selectList("test.all");
		
	    
	    TestDTO dto = new TestDTO();
	     dto.setId("java");
	    dto.setName("sun");
	    dto = dao.selectOne("test.idname",dto);
	    model.addAttribute("dto",dto);
	    
		model.addAttribute("obj",obj);
		model.addAttribute("list",list);
		model.addAttribute("list2",list2);
		
		return "/0607/allId";
	}
	
	
	@RequestMapping("/mybatis/testPro.do")
	public String formPro(TestDTO dto) {
		dao.insert("test.insert",dto);
		return "/0607/testPro";
	}
	
	@RequestMapping("/mybatis/testForm.do")
	public String form() {
		return "/0607/testForm";
	}
	
	
	
	@RequestMapping("/mybatis/conn.do")
	public String conn() {
		System.out.println(dao);
		return "/0607/conn";
	}
	
	
	//------0608
	@RequestMapping("/mybatis/iftest.do")
	public String iftest(Model model) {
		List list = dao.selectList("test.iftest");
		List list2 = dao.selectList("test.iftest","java");
		System.out.println(list);
		System.out.println(list2);
		return "/0608/ifTest";
	}
	
	@RequestMapping("/mybatis/whereif.do")
	public String whereif(Model model) {
		List list = dao.selectList("test.whereif");
		System.out.println(list);
		
		TestDTO dto = new TestDTO();
		dto.setAge(50);
		List list2 = dao.selectList("test.whereif",dto); 
		System.out.println(list2);
		
		TestDTO dto2 = new TestDTO();
		dto.setId("java");
		List list3 = dao.selectList("test.whereif",dto2); 
		System.out.println(list3);
		
		return "/0608/whereif";
	}
	
	
	@RequestMapping("/mybatis/testUpdate.do")
	public String update(Model model) {
		TestDTO dto = new TestDTO();
		dto.setName("korea");
		dto.setId("java");
		
		dao.update("test.testUpdate",dto);
		
		return "/0608/updatePro";
	}
	
	
	@RequestMapping("/mybatis/forin.do")
	public String forin(Model model) {
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list = dao.selectList("test.forin" , list);
		System.out.println(list);
		return "/0608/forin";
	}
	
	
	@RequestMapping("/mybatis/insertkey.do")
	public String insertkey(Model model) {
		
		TestDTO dto = new TestDTO();
		dto.setName("git");
		dto.setId("qwqw22");
		
		dao.insert("test.insertkey", dto);
		return "/0608/insertkey";
	}
	
	@RequestMapping("/mybatis/insertkey2.do")
	public String insertkey2(Model model) {
		
		TestDTO dto = new TestDTO();
		dto.setName("git");
		dto.setId("aabbb");
		
		dao.insert("test.insertkey2", dto);
		return "/0608/insertkey";
	}
	
}
