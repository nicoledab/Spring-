package test.spring.bean.day5;

import java.util.List;
import test.spring.bean.day3.TestDTO;


/* DB: oracle 19c
 * url : jdbc:oracle:thin:@masternull.iptime.org.1521:orcl
 * user : java21   pass: java 
 * mypatis를 활용하세요 
 * 
 * */
public interface TestDAOInter {//day3에 있는 testDTO 쓰기 
	
	
	//입력받은 값을 TestDTO 받아 test테이블에 추가하시오
	public void testInsert(TestDTO dto)throws Exception;
	
	
	
	//test테이블의 전체내용 검색 
	public List TestAllList() throws Exception;
	
	
	
	//id에 맞는 요소를 검색 
	public TestDTO testId(String id)throws Exception;
	
	
	
	//값을 입력받아 age/ name 수정 
	public void testUpdate(TestDTO dto)throws Exception;
	
	
	// id 에 맞는 값을 삭제한다. 
	public void testDelete(String id)throws Exception;
	
	
	

}
