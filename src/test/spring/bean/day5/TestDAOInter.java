package test.spring.bean.day5;

import java.util.List;
import test.spring.bean.day3.TestDTO;


/* DB: oracle 19c
 * url : jdbc:oracle:thin:@masternull.iptime.org.1521:orcl
 * user : java21   pass: java 
 * mypatis�� Ȱ���ϼ��� 
 * 
 * */
public interface TestDAOInter {//day3�� �ִ� testDTO ���� 
	
	
	//�Է¹��� ���� TestDTO �޾� test���̺� �߰��Ͻÿ�
	public void testInsert(TestDTO dto)throws Exception;
	
	
	
	//test���̺��� ��ü���� �˻� 
	public List TestAllList() throws Exception;
	
	
	
	//id�� �´� ��Ҹ� �˻� 
	public TestDTO testId(String id)throws Exception;
	
	
	
	//���� �Է¹޾� age/ name ���� 
	public void testUpdate(TestDTO dto)throws Exception;
	
	
	// id �� �´� ���� �����Ѵ�. 
	public void testDelete(String id)throws Exception;
	
	
	

}
