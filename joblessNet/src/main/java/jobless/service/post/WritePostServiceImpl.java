package jobless.service.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ContentDAO;
import jobless.dao.PostDAO;
import jobless.exception.WritePostException;
import jobless.model.ContentVO;
import jobless.model.PostVO;

@Repository("writePostService")
public class WritePostServiceImpl implements WritePostService {
	
	@Autowired
	PostDAO postdao;
	
	@Autowired
	ContentDAO contentdao;
	
	@Override
	public int writePost(PostRequest postReq) {
		int postId;
		try {
			contentdao.insert(new ContentVO(postReq.getContent()));
			int contentId = contentdao.readLastInsertId();
			postReq.setContentId(contentId);
			postdao.insert(new PostVO(postReq.getTitle(), postReq.getContentId(), postReq.getWriterId(), postReq.getBoardId(), postReq.getCategoryId()));
			postId = postdao.readLastInsertId();	
		} catch (Exception e) {
			throw new WritePostException("post 작성 실패" + e);
		}
		return postId;
	}

}
