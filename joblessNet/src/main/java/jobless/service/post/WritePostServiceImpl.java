package jobless.service.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ContentDAO;
import jobless.dao.PostDAO;

@Repository("writePostService")
public class WritePostServiceImpl implements WritePostService {
	@Autowired
	PostDAO postdao;
	
	@Autowired
	ContentDAO contentdao;
	
	@Override
	public void writePost(PostRequest postReq) {

		
		// TODO Auto-generated method stub
		/*try {
			postdao.insert(postReq.getPost());
			contentdao.insert(postReq.getContent());
		} catch (Exception e) {
			throw new RuntimeException();
		}*/
	}

}
