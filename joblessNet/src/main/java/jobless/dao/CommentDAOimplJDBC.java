package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.ICommentMapper;
import jobless.model.CommentVO;

@Repository("CommentDAO")
public class CommentDAOimplJDBC implements CommentDAO {
	@Autowired
	private ICommentMapper mapper;

	@Override
	public void insertIntoPost(CommentVO comment) {
		// TODO Auto-generated method stub
		mapper.insertPostComment(comment);
	}

	@Override
	public void insertIntoClip(CommentVO comment) {
		// TODO Auto-generated method stub
		mapper.insertClipComment(comment);
	}

	@Override
	public List<CommentVO> readAllByClipId(int clipId) {
		// TODO Auto-generated method stub
		List<CommentVO> commentList =  mapper.selectCommentByClipId(clipId);
		return commentList;
	}

	@Override
	public List<CommentVO> readAllByPostId(int postId) {
		// TODO Auto-generated method stub
		List<CommentVO> commentList =  mapper.selectCommentByPostId(postId);
		return commentList;
	}

	@Override
	public List<CommentVO> readAllByUserId(int userId) {
		// TODO Auto-generated method stub
		List<CommentVO> commentList = mapper.selectCommentByUserId(userId);
		return commentList;
	}

	@Override
	public void delete(int commentId) {
		// TODO Auto-generated method stub
		mapper.deleteComment(commentId);
	}

	@Override
	public CommentVO read(int commentId) {
		// TODO Auto-generated method stub
		CommentVO comment = mapper.selectCommentById(commentId);
		return comment;
	}

	@Override
	public List<CommentVO> readAll() {
		// TODO Auto-generated method stub
		List<CommentVO> commentList = mapper.selectCommentList();
		return commentList;
	}

	@Override
	public int readCountClipComment(int clipId) {
		// TODO Auto-generated method stub
		int countClip = mapper.readCountClipComment(clipId);
		return countClip;
	}

	@Override
	public int readCountPostComment(int postId) {
		// TODO Auto-generated method stub
		int countClip = mapper.readCountPostComment(postId);
		return countClip;
	}

	
}
