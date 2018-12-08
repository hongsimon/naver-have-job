package jobless.service.comment;

import java.util.Map;

public class CommentRequest {
	private int commentId;
	private String content;
	private int userId;
	private int postId;
	private int clipId;
	
	public CommentRequest(int commentId, String content, int userId, int postId, int clipId) {
		super();
		this.commentId = commentId;
		this.content = content;
		this.userId = userId;
		this.postId = postId;
		this.clipId = clipId;
	}
	
	public CommentRequest(String content, int userId, int postId, int clipId) {
		super();
		this.content = content;
		this.userId = userId;
		this.postId = postId;
		this.clipId = clipId;
	}

	public int getCommentId() {
		return commentId;
	}
	public String getContent() {
		return content;
	}
	public int getUserId() {
		return userId;
	}
	public int getPostId() {
		return postId;
	}
	public int getClipId() {
		return clipId;
	}
	
	public void validate(Map<String, Boolean> errors) {
		if(content == null || content.trim().isEmpty()) {
			errors.put("content", true);
		}
	}
	
}
