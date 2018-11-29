package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("Comment")
public class CommentVO {
	private int commentId;
	private String content;
	private int userId;
	private int postId;
	private int clipId;

	public CommentVO() {
	}

	public CommentVO(String content, int userId, int postId, int clipId) {
		this.content = content;
		this.userId = userId;
		this.postId = postId;
		this.clipId = clipId;
	}

	public CommentVO(int commentId, String content, int userId, int postId, int clipId) {
		this.commentId = commentId;
		this.content = content;
		this.userId = userId;
		this.postId = postId;
		this.clipId = clipId;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getClipId() {
		return clipId;
	}

	public void setClipId(int clipId) {
		this.clipId = clipId;
	}

}
