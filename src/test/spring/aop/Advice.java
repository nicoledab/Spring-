package test.spring.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
public class Advice {
  
	//Ÿ�� �޼��� ���� �� ���� �޼ҵ� 
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
		
		
		
		                       // ���� �������� request ��ü 
		RequestAttributes ra =  RequestContextHolder.currentRequestAttributes();
		// HttpServletRequest - ����� request  jsp  ���� ����ϴ� ��ü 
		// ServerRequest - �������� ���������� ���Ǵ� request 
		//LibraryRequest - �ܺ� lib �����͸� ����ϴ� request 
		
		ServletRequestAttributes sra = (ServletRequestAttributes)ra;
		HttpServletRequest request = sra.getRequest();  // jsp �������� ����ϴ� request
		
		
		//�ڵ� ���� ver. ������ ���� �ڵ�.
		//HttpServletRequest request2 = ((ServletRequestAttributes)(RequestContextHolder.currentRequestAttributes())).getRequest();
		
		
		HttpSession session = request.getSession(); // ���� 
		
		System.out.println("aop ����=="+request.getRequestURI());
			
		if(session.getAttribute("memId")== null) {
			
			request.setAttribute("uri", request.getRequestURI());
			return "/0610/loginForm";
		}
		 return jp.proceed();  //���ư� ��θ� �������ش�. /0609/main
	}
	
}
