package test.spring.bean.day6;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnsDAOImpl implements SnsDAOInter{
   
	@Autowired
    private SqlSessionTemplate dao = null;
	
	@Override
	public int imgSeq() throws Exception {
		return dao.selectOne("sns.imgSeq");
	}

	@Override
	public void insert(SnsDTO dto) throws Exception {

		dao.insert("sns.insert",dto);
	}

	
	@Override
	public int maxNum() throws Exception {
		
		return dao.selectOne("sns.maxNum");
	}

	@Override
	public void imgInsert(SnsImgDTO dto) throws Exception {
		dao.insert("sns.imgInsert",dto);		
	}

}
