package jobless.service.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PostDAO;
import jobless.model.PostVO;

@Repository("modifyPostService")
public class ModifyPostServiceImpl implements ModifyPostService {

	@Autowired
	PostDAO postdao;

	@Override
	public void modifyPost(PostRequest postReq) {
		// TODO Auto-generated method stub
		postdao.update(
				new PostVO(postReq.getTitle(), 
						postReq.getContentId(), 
						postReq.getWriterId(),
						postReq.getBoardId(), 
						postReq.getCategoryId()));
	}

}
