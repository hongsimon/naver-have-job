package jobless.service.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ContentDAO;
import jobless.dao.PostDAO;
import jobless.exception.DeletePostException;

@Repository("deletePostService")
public class DeletePostServiceImpl implements DeletePostService {

	@Autowired
	PostDAO postdao;
	
	@Autowired
	ContentDAO contentdao;
	
	@Override
	public void deletePost(int postId, int contentId) {
		try {
			postdao.delete(postId);
			contentdao.delete(contentId);
		} catch (Exception e) {
			throw new DeletePostException("post 삭제 실패" + e);
		}
	}

}
