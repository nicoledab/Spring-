package test.spring.bean.day6;

public interface SnsDAOInter {
	//���� ����� ���� ���Ϲ�ȣ�� �������� �̿��� ���� �޴´�. 
	public int imgSeq() throws Exception;
	
	
	//sns���̺� num, writer, content, reg  ������ �߰��Ѵ�.
	public void insert(SnsDTO dto) throws Exception;
	
	// sns ���̺� maxNum ���� ���� �޴´�. 
	public int maxNum() throws Exception;
	
	// ���� ���ε�� snsimg ���̺� �߰����ش�. 
	public void imgInsert(SnsImgDTO dto) throws Exception; 

}
