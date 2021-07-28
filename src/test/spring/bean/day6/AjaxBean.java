package test.spring.bean.day6;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax/")
public class AjaxBean {
   
	@RequestMapping("time.do")
	public String time(Model model,String name, int age) {
		model.addAttribute("day", new Date()+name+":"+age);
		return "0614/time";
	}
	
	@RequestMapping("main.do")
	public String main(Model model) {
		return "0614/main";
	}
	
	@RequestMapping("login.do")
	public String login() {
		return "0614/login";
	}
	
	@RequestMapping("check.do")
	public @ResponseBody String check(String id, String pw) {
		//dao = id/pw 확인 
		// @ResponseBody = 영문 / 숫자로 이루어진 String 값 하나 전달 
		
		return "ok"; //login.jsp 에 aa쪽으로 들어간다 
	}
	
}
