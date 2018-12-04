package jobless.service.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.CommentDAO;

@Repository("deleteCommentService")
public class DeleteCommentServiceImpl implements DeleteCommentService{
	
	@Autowired
	CommentDAO commentDao;
	
	@Override
	public void delete(int commentId) {
		// TODO Auto-generated method stub
		commentDao.delete(commentId);;
	}

}
