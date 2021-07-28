package test.spring.bean.day5;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.spring.bean.day3.TestDTO;

@Service
public class TestDAOImpl implements TestDAOInter {

	@Autowired
	private SqlSessionTemplate mybatis = null; 
	
	@Override  // testSQL 에서 가져오기 
	public void testInsert(TestDTO dto) throws Exception {
		mybatis.insert("test.insert",dto);
	}

	
	@Override
	public List TestAllList() throws Exception {
		return mybatis.selectList("test.all");
	}

	
	
	@Override
	public TestDTO testId(String id) throws Exception {
		return mybatis.selectOne("test.testId", id);
	}

	
	@Override
	public void testUpdate(TestDTO dto) throws Exception {
		mybatis.update("test.testUpdate",dto);
	}

	@Override
	public void testDelete(String id) throws Exception {
		mybatis.update("test.testDelete",id);
	}

}
