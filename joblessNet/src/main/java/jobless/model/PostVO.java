package jobless.model;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

@Alias("Post")
public class PostVO {
	private int postId;
	private String title;
	private LocalDateTime writeDate;
	private int contentId;
	private int boardId;
	private int views;
	private int writerId;
	private int categoryId;

	public PostVO() {}

	public PostVO(String title, int contentId, int writerId, int boardId, int categoryId) {
		this.title = title;
		this.contentId = contentId;
		this.writerId = writerId;
		this.boardId = boardId;
		this.categoryId = categoryId;
	}	

	public PostVO(int postId, String title, LocalDateTime writeDate, int contentId, int boardId, int views,
			int writerId, int categoryId) {
		this.postId = postId;
		this.title = title;
		this.writeDate = writeDate;
		this.contentId = contentId;
		this.boardId = boardId;
		this.views = views;
		this.writerId = writerId;
		this.categoryId = categoryId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(LocalDateTime writeDate) {
		this.writeDate = writeDate;
	}

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
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

	@Override
	public String toString() {
		return "PostVO [postId=" + postId + ", title=" + title + ", writeDate=" + writeDate + ", contentId=" + contentId
				+ ", boardId=" + boardId + ", views=" + views + ", writerId=" + writerId + ", categoryId=" + categoryId
				+ "]";
	}

}
