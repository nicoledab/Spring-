
/*
 * 2021.06.04
 * 
 */


package test.spring.bean.day2;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import test.spring.bean.DAO;
import test.spring.bean.DTO;


//주소 위치 고정 설정. root-control도 이런 설정이 있음
@Controller
@RequestMapping("/member/")  
public class LoginBean {
	
	@Autowired
	private DAO dao= null;
	
	@RequestMapping("loginForm.do")
	public String loginForm() {
		return "/0604/loginForm";
	}
	
	
	//@RequestParam(value="id", defaultValue="java") String id, String pw
	//@RequestBody Map<String , Object> obj    post요청시--- xml요청 , script 요청시 사용된다. 
	
	                 //아이디를 admin(특정)만 허락하게 하면,params={"id=admin"
	@RequestMapping(value="loginPro.do", method=RequestMethod.POST, params={"id","pw"}) 
	public String loginPro(String id, String pw, Model model, HttpSession session) {
		
	 boolean result = dao.loginCheck(id, pw);
		if(result) {
			session.setAttribute("memId", id);
		}
		model.addAttribute("result", result);
		return "/0604/loginPro";
	}
	 
	
	
	
	//ModelAndView 방식: 
	@RequestMapping(value={"main.do","index.do"})
	public ModelAndView main() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("id", "java");  
		mav.setViewName("/0604/main"); 
		
		return mav;
	}
	
	
	//실행방식 : {data}에 아무 주소가 들어와도 된다. 
	//  http://localhost:8080/spring/member/test/aaaa/bb/test.do
	@RequestMapping("/test/{data}/{data2}/test.do")
	public String ant(
			@PathVariable("data") String data,
			@PathVariable("data2") String data2) {
		System.out.println("ant()");
		System.out.println("data---"+data);
		System.out.println("data2---"+data2);
		
		
		if(data.equals("naver")) {}
		
		
		return "/0604/main";
	}  
	  
	  
	
}

