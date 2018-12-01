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

	public PostVO() {
	}

	public PostVO(String title, int contentId, int boardId, int writerId) {
		this.title = title;
		this.contentId = contentId;
		this.boardId = boardId;
		this.writerId = writerId;
	}	

	public PostVO(int postId, String title, LocalDateTime writeDate, int contentId, int boardId, int views,
			int writerId) {
		this.postId = postId;
		this.title = title;
		this.writeDate = writeDate;
		this.contentId = contentId;
		this.boardId = boardId;
		this.views = views;
		this.writerId = writerId;
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

	@Override
	public String toString() {
		return "PostVO [postId=" + postId + ", title=" + title + ", writeDate=" + writeDate + ", contentId=" + contentId
				+ ", boardId=" + boardId + ", views=" + views + ", writerId=" + writerId + "]";
	}
	
}
