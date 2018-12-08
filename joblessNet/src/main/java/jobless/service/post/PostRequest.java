package jobless.service.post;

import java.time.LocalDateTime;

import jobless.model.PostVO;

public class PostRequest {
	private int postId;
	private int contentId;
	private String title;
	private String content;
	private LocalDateTime writeDate;
	private int boardId;
	private int views;
	private int writerId;
	private int categoryId;
	
	
	public PostRequest() {}
	
	public PostRequest(int contentId, String title, String content, int boardId, int writerId, int categoryId) {
		this.contentId = contentId;
		this.title = title;
		this.content = content;
		this.boardId = boardId;
		this.writerId = writerId;
		this.categoryId = categoryId;
	}

	public PostRequest(int postId, int contentId, String content, String title, LocalDateTime writeDate, int boardId,
			int views, int writerId, int categoryId) {
		this.postId = postId;
		this.contentId = contentId;
		this.content = content;
		this.title = title;
		this.writeDate = writeDate;
		this.boardId = boardId;
		this.views = views;
		this.writerId = writerId;
		this.categoryId = categoryId;
	}
	
	public PostVO getPostVO() {
		return new PostVO(postId, title, writeDate, contentId, boardId, views, writerId, categoryId);
	}


	public int getPostId() {
		return postId;
	}


	public void setPostId(int postId) {
		this.postId = postId;
	}


	public int getContentId() {
		return contentId;
	}


	public void setContentId(int contentId) {
		this.contentId = contentId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public LocalDateTime getWriteDate() {
		return writeDate;
	}


	public void setWriteDate(LocalDateTime writeDate) {
		this.writeDate = writeDate;
	}


	public int getBoardId() {
		return boardId;
	}


	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}


	public int getViews() {
		return views;
	}


	public void setViews(int views) {
		this.views = views;
	}


	public int getWriterId() {
		return writerId;
	}


	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public void validate() {
		
	}
}
