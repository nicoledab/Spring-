package test.spring.bean;

public class DAO {

		public boolean loginCheck(String id, String pw) {
			boolean result=false;
			if(id.equals("admin")) {
				result = true;
			}
			return result;
		}
}
