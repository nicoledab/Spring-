package test.spring.bean.day4;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import test.spring.bean.day3.TestDTO;

@Controller
@RequestMapping("/board/")
public class BoardDBBean {
	
	@Autowired
	private SqlSessionTemplate dao =null;
	
	
	/*  // 01. 게시글 목록*/
	@RequestMapping("list.do")
	public String list(Model model) {
		
		/**/
		BoardDataBean article = new BoardDataBean();
		List list = dao.selectList("list");
	    model.addAttribute("article",article);
		model.addAttribute("list",list);
		System.out.println(list);
		
		
		return "/board/list";
	}
	
	
	
	/*
	
	//01. 게시글 목록
	@RequestMapping("list.do")
	public ModelAndView list() throws Exception {
		List<BoardDataBean> list =List board;
		
		BoardDataBean article = new BoardDataBean();
		List list = dao.selectList("test.list");
		
	 
	    model.addAttribute("article",article);
	    
		model.addAttribute("list",list);
		
		System.out.println(list);
		return "/0608/list";
	}*/
	
	
	@RequestMapping("writeForm.do")
	public String writeForm(HttpSession session) {
		
		return "/board/writeForm";
	}
	
	@RequestMapping("updateForm.do")
	public String memberUpdateForm() {
		
		return "/board/updateForm";
	}
	
	
	@RequestMapping("deleteForm.do")
	public String memberDeleteForm(HttpSession session) {
		
		return "/board/deleteForm";
	}
	
}
