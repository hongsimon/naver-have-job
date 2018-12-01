package jobless.service.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PostDAO;

@Repository("modifyPostService")
public class ModifyPostServiceImpl implements ModifyPostService{

	@Autowired
	PostDAO postdao;
	
	@Override
	public void modifyPost(PostRequest postReq) {
		// TODO Auto-generated method stub
		
	}
	
}
