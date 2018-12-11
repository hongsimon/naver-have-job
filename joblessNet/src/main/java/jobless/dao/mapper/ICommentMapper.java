package jobless.dao.mapper;

import java.util.List;

import jobless.model.CommentVO;

@MyAnnotMapper
public interface ICommentMapper {
	void insertPostComment(CommentVO commentVO);
	void insertClipComment(CommentVO commentVO);
	List<CommentVO> selectCommentList();
	List<CommentVO> selectCommentByPostId(int postId);
	List<CommentVO> selectCommentByClipId(int clipId);
	List<CommentVO> selectCommentByUserId(int userId);
	CommentVO selectCommentById(int commentId);
	void deleteComment(int commentId);
	int readCountClipComment(int clipId);
	int readCountPostComment(int postId);
}
