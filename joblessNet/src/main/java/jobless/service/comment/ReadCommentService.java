package jobless.service.comment;

import java.util.List;

import jobless.model.CommentVO;

public interface ReadCommentService {
	public CommentVO read(int commentId);
	
	public List<CommentVO> readAll();
	
	public List<CommentVO> readAllByClipId(int clipId);
	
	public List<CommentVO> readAllByPostId(int postId);
	
	public List<CommentVO> readAllByUserId(int userId);
}
