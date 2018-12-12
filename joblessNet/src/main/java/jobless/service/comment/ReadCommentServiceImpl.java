package jobless.service.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ClipDAO;
import jobless.dao.CommentDAO;
import jobless.exception.CommentNotFoundException;
import jobless.model.CommentVO;

@Repository("readCommentService")
public class ReadCommentServiceImpl implements ReadCommentService{
	@Autowired
	CommentDAO commentDao;
	
	@Override
	public List<CommentVO> readAll() {
		// TODO Auto-generated method stub
		List<CommentVO> comment = commentDao.readAll();
		if(comment == null) {
			throw new CommentNotFoundException("readAll 할 comment 객체들을 불러오지 못했습니다.");
		}
		return comment;
	}

	@Override
	public List<CommentVO> readAllByClipId(int clipId) {
		// TODO Auto-generated method stub
		List<CommentVO> comment = commentDao.readAllByClipId(clipId);
		if(comment == null) {
			throw new CommentNotFoundException(clipId + "번 클립 /readAllByClipId 할 comment 객체들을 불러오지 못했습니다.");
		}
		return comment;
	}

	@Override
	public List<CommentVO> readAllByPostId(int postId) {
		// TODO Auto-generated method stub
		List<CommentVO> comment = commentDao.readAllByPostId(postId);
		if(comment == null) {
			throw new CommentNotFoundException(postId + "번 일반게시물 / readAllByPostId 할 comment 객체들을 불러오지 못했습니다.");
		}
		return comment;
	}

	@Override
	public List<CommentVO> readAllByUserId(int userId) {
		// TODO Auto-generated method stub
		List<CommentVO> comment = commentDao.readAllByUserId(userId);
		if(comment == null) {
			throw new CommentNotFoundException(userId + "번의 유저 / readAllByUserId 할 comment 객체들을 불러오지 못했습니다.");
		}
		return comment;
	}

	@Override
	public CommentVO read(int commentId) {
		// TODO Auto-generated method stub
		CommentVO comment = commentDao.read(commentId);
		if(comment == null) {
			throw new CommentNotFoundException(commentId+"번 comment 객체들을 불러오지 못했습니다.");
		}
		return comment;
	}

	@Override
	public int readCountClipComment(int clipId) {
		// TODO Auto-generated method stub
		int countComment = commentDao.readCountClipComment(clipId);
		return countComment;
	}

	@Override
	public int readCountPostComment(int postId) {
		// TODO Auto-generated method stub
		int countComment = commentDao.readCountPostComment(postId);
		return countComment;
	}

}
