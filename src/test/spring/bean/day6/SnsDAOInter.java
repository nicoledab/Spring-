package test.spring.bean.day6;

public interface SnsDAOInter {
	//사진 등록을 위해 파일번호를 시퀀스를 이용해 리턴 받는다. 
	public int imgSeq() throws Exception;
	
	
	//sns테이블에 num, writer, content, reg  정보를 추가한다.
	public void insert(SnsDTO dto) throws Exception;
	
	// sns 테이블에 maxNum 값을 리턴 받는다. 
	public int maxNum() throws Exception;
	
	// 사진 업로드시 snsimg 테이블에 추가해준다. 
	public void imgInsert(SnsImgDTO dto) throws Exception; 

}
