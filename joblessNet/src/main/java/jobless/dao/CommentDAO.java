package jobless.dao;

import java.util.List;

import jobless.model.CommentVO;


public interface CommentDAO {
	public void insertIntoPost(CommentVO comment);
	
	public void insertIntoClip(CommentVO comment);
	
	public List<CommentVO> readAll();
	
	public List<CommentVO> readAllByClipId(int clipId);
	
	public List<CommentVO> readAllByPostId(int postId);
	
	public List<CommentVO> readAllByUserId(int userId);
	
	public void delete(int commentId);

	public CommentVO read(int commentId);
	
	
}
