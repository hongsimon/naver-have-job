package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("BoardApply")
public class BoardApplyVO {
	private int applyId;
	private int ownerId;
	private String content;
	private String broadcasterURL;
	private boolean complete;

	public BoardApplyVO() {
	}

	public BoardApplyVO(int ownerId, String content, String broadcasterURL) {
		this.ownerId = ownerId;
		this.content = content;
		this.broadcasterURL = broadcasterURL;
	}

	public BoardApplyVO(int applyId, int ownerId, String content, String broadcasterURL, boolean complete) {
		this.applyId = applyId;
		this.ownerId = ownerId;
		this.content = content;
		this.broadcasterURL = broadcasterURL;
		this.complete = complete;
	}

	public int getApplyId() {
		return applyId;
	}

	public void setApplyId(int applyId) {
		this.applyId = applyId;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getBroadcasterURL() {
		return broadcasterURL;
	}

	public void setBroadcasterURL(String broadcasterURL) {
		this.broadcasterURL = broadcasterURL;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}
}
