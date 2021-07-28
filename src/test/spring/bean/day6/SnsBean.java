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
	
	//model model ���� 
	@RequestMapping("snsPro.do")
	 public String SnsPro(SnsDTO dto, Model model,  MultipartHttpServletRequest request) throws Exception{
		
		snsDao.insert(dto); //sns ���̺� ���� �߰� 
		int snsNum = snsDao.maxNum();
		
		String path = request.getRealPath("save");
		
		List<MultipartFile> list = request.getFiles("save");   //������ ������ �޴´� 
		List imgList = new ArrayList(); //���ε�� ���� ���� ���� ! 
		
		
		for(MultipartFile mf: list) {
			String orgName = mf.getOriginalFilename();
			if(!orgName.equals("")) {
		    	
		   //-----�ߺ�ó���ϴ� ���
		    	//1. �������� �̿��� ���. db�� �����Ѵٴ°� ����. file_1, file_2...
				
				String imgName ="file_"+snsDao.imgSeq();
				imgName += orgName.substring(orgName.lastIndexOf(".")); //.�� ����?> test.jpg ���� ���� �ڸ���! ���� �̸����� Ȯ���� ȹ�� !! 
				System.out.println(imgName);
				
				mf.transferTo(new File(path+"//"+imgName));
		    	
				SnsImgDTO imgDTO = new SnsImgDTO();
				imgDTO.setNum(snsNum);
				imgDTO.setSnsnum(snsNum);
				imgDTO.setOrgname(orgName);
				imgDTO.setSysname(imgName);
				snsDao.imgInsert(imgDTO);
				imgList.add(imgName);
				
				//2. �����̸����� ����ð��� ����Ѵ�.System.currentTimeMillis();db�� �Ȱ��� �� 
		    	//     ���߾��ε忡�� ������
		     //  String img = path+"//"+System.currentTimeMillis()+mf.getOriginalFilename();
		    //   System.out.println(img);
//�ܼ� ���> C:\Users\Nicole Jung\eclipse-workspace\.metadata\.plugins\org.eclipse.wst.server.core\
//tmp0\wtpwebapps\spring\save//1623635083587
				
		    }
		}
		model.addAttribute("imgList",imgList);
		
		return "/0614/snsPro";
	}
	
	
	
	
	
}
