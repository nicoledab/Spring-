package test.spring.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
public class Advice {
  
	//타겟 메서드 동작 전 실행 메소드 
	/*
	public void before() {
		System.out.println("before");
	}
	
	public void after() {
		System.out.println("after");
	}
	
	public void add() {
		System.out.println("advice before -- add()");
	}
	
	*/
	
	
	/*
	public void afterreturn() {
		System.out.println("after-returning");
	}
	public void afterthrowing() {
		System.out.println("after-throwing");
	}
	*/
	
		
	public Object around(ProceedingJoinPoint jp) throws Throwable {
	//System.out.println("around");
		
		
		
		                       // 현재 실행중인 request 객체 
		RequestAttributes ra =  RequestContextHolder.currentRequestAttributes();
		// HttpServletRequest - 사용자 request  jsp  에서 사용하던 객체 
		// ServerRequest - 서버에서 내부적으로 사용되는 request 
		//LibraryRequest - 외부 lib 데이터를 사용하는 request 
		
		ServletRequestAttributes sra = (ServletRequestAttributes)ra;
		HttpServletRequest request = sra.getRequest();  // jsp 에서부터 사용하던 request
		
		
		//코드 줄인 ver. 위에는 정석 코드.
		//HttpServletRequest request2 = ((ServletRequestAttributes)(RequestContextHolder.currentRequestAttributes())).getRequest();
		
		
		HttpSession session = request.getSession(); // 세션 
		
		System.out.println("aop 실행=="+request.getRequestURI());
			
		if(session.getAttribute("memId")== null) {
			
			request.setAttribute("uri", request.getRequestURI());
			return "/0610/loginForm";
		}
		 return jp.proceed();  //돌아갈 경로를 리턴해준다. /0609/main
	}
	
}
