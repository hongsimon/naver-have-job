package jobless.service.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PostDAO;

@Repository("deletePostService")
public class DeletePostServiceImpl implements DeletePostService {

	@Autowired
	PostDAO postdao;
	
	@Override
	public void deletePost(int postId) {
		// TODO Auto-generated method stub

	}

}
