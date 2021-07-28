package test.spring.bean.day4;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member2/")
public class MemberBean {
  
	@Autowired
	private SqlSessionTemplate dao = null;
	//mybatis 
	
	@RequestMapping("loginForm.do")
	public String LoingForm() {
		return "/0610/loginForm";
	}
	
	@RequestMapping("loginPro.do")
	public String LoingPro(MemberDTO dto, HttpSession session, Model model) {
		int count = (Integer)dao.selectOne("member.loginCheck",dto);
		if(count == 1) {
			 session.setAttribute("memId", dto.getId());
		}
		model.addAttribute("count", count);
		return "/0610/loginPro";
	}
	
	
	@RequestMapping("main.do")
	public String Main() {
		
		return "/0610/main";
	}
	
	
	@RequestMapping("logout.do")
	public String memberLogout(HttpSession session) {
		session.invalidate();
		return "/0610/main";
	}
	
	
	@RequestMapping("updateForm.do")
	public String memberUpdateForm() {
		
		return "/0610/updateForm";
	}
	
	
	@RequestMapping("deleteForm.do")
	public String memberDeleteForm(HttpSession session) {
		
		return "/0610/deleteForm";
	}
}
