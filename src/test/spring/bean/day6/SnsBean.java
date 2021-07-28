package test.spring.bean.day6;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/sns/")
public class SnsBean {
    
	@Autowired
	private SnsDAOInter snsDao = null;
	
	@RequestMapping("form.do")
	 public String form() {
		return "/0614/form";
	}
	
	//model model 사진 
	@RequestMapping("snsPro.do")
	 public String SnsPro(SnsDTO dto, Model model,  MultipartHttpServletRequest request) throws Exception{
		
		snsDao.insert(dto); //sns 테이블 정보 추가 
		int snsNum = snsDao.maxNum();
		
		String path = request.getRealPath("save");
		
		List<MultipartFile> list = request.getFiles("save");   //사진을 여러개 받는다 
		List imgList = new ArrayList(); //업로드된 사진 저장 목적 ! 
		
		
		for(MultipartFile mf: list) {
			String orgName = mf.getOriginalFilename();
			if(!orgName.equals("")) {
		    	
		   //-----중복처리하는 방법
		    	//1. 시퀀스를 이용한 방법. db에 가야한다는게 단점. file_1, file_2...
				
				String imgName ="file_"+snsDao.imgSeq();
				imgName += orgName.substring(orgName.lastIndexOf(".")); //.은 뭐지?> test.jpg 에서 점을 자른다! 파일 이름에서 확장자 획득 !! 
				System.out.println(imgName);
				
				mf.transferTo(new File(path+"//"+imgName));
		    	
				SnsImgDTO imgDTO = new SnsImgDTO();
				imgDTO.setNum(snsNum);
				imgDTO.setSnsnum(snsNum);
				imgDTO.setOrgname(orgName);
				imgDTO.setSysname(imgName);
				snsDao.imgInsert(imgDTO);
				imgList.add(imgName);
				
				//2. 파일이름으로 현재시간을 사용한다.System.currentTimeMillis();db에 안가도 됨 
		    	//     다중업로드에는 부적합
		     //  String img = path+"//"+System.currentTimeMillis()+mf.getOriginalFilename();
		    //   System.out.println(img);
//콘솔 결과> C:\Users\Nicole Jung\eclipse-workspace\.metadata\.plugins\org.eclipse.wst.server.core\
//tmp0\wtpwebapps\spring\save//1623635083587
				
		    }
		}
		model.addAttribute("imgList",imgList);
		
		return "/0614/snsPro";
	}
	
	
	
	
	
}
