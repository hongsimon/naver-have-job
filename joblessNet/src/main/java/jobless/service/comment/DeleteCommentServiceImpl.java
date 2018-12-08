package jobless.service.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.CommentDAO;
import jobless.exception.DeleteCommentException;

@Repository("deleteCommentService")
public class DeleteCommentServiceImpl implements DeleteCommentService{
	
	@Autowired
	CommentDAO commentDao;
	
	@Override
	public void delete(int commentId) {
		// TODO Auto-generated method stub
		try {
		commentDao.delete(commentId);
		}catch (Exception e) {
			throw new DeleteCommentException(commentId+ "번 comment를 삭제하지 못했습니다." + e);
		}
	}

}
