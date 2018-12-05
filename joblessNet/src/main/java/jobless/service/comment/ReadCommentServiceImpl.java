package jobless.service.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ClipDAO;
import jobless.dao.CommentDAO;
import jobless.model.CommentVO;

@Repository("readCommentService")
public class ReadCommentServiceImpl implements ReadCommentService{
	@Autowired
	CommentDAO commentDao;
	
	@Override
	public List<CommentVO> readAll() {
		// TODO Auto-generated method stub
		List<CommentVO> comment = commentDao.readAll();
		return comment;
	}

	@Override
	public List<CommentVO> readAllByClipId(int clipId) {
		// TODO Auto-generated method stub
		List<CommentVO> comment = commentDao.readAllByClipId(clipId);
		return comment;
	}

	@Override
	public List<CommentVO> readAllByPostId(int postId) {
		// TODO Auto-generated method stub
		List<CommentVO> comment = commentDao.readAllByPostId(postId);
		return comment;
	}

	@Override
	public List<CommentVO> readAllByUserId(int userId) {
		// TODO Auto-generated method stub
		List<CommentVO> comment = commentDao.readAllByUserId(userId);
		return comment;
	}

	@Override
	public CommentVO read(int commentId) {
		// TODO Auto-generated method stub
		CommentVO comment = commentDao.read(commentId);
		return comment;
	}

}
