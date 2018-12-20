package jobless.service.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ContentDAO;
import jobless.dao.PostDAO;
import jobless.exception.ModifyPostException;
import jobless.model.ContentVO;
import jobless.model.PostVO;

@Repository("modifyPostService")
public class ModifyPostServiceImpl implements ModifyPostService {

	@Autowired
	PostDAO postdao;

	@Autowired
	ContentDAO contentdao;

	@Override
	public void modifyPost(PostRequest postReq) {
		try {
			postdao.update(new PostVO(postReq.getTitle(),postReq.getCategoryId(), postReq.getPostId()));
			contentdao.update(new ContentVO(postReq.getContentId(), postReq.getContent()));
		} catch (Exception e) {
			throw new ModifyPostException("post 수정 실패" + e);
		}
		
	}

}
