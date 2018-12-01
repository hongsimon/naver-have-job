package jobless.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PostDAO;

@Repository("writePostService")
public class WritePostServiceImpl implements WritePostService {
	@Autowired
	PostDAO postdao;
	
	@Override
	public void writePost(PostRequest postReq) {
		// TODO Auto-generated method stub

	}

}
