package jobless.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PostDAO;
import jobless.model.PostVO;

@Repository("modifyPostService")
public class ModifyPostServiceImpl implements ModifyPostService{

	@Autowired
	PostDAO postdao;
	
	@Override
	public void modifyPost(PostVO post) {
		// TODO Auto-generated method stub
		
	}
	
}
