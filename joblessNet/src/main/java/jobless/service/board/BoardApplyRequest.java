package jobless.service.board;

import jobless.model.BoardApplyVO;

public class BoardApplyRequest {

	private int applyId;
	private int ownerId;
	private String content;
	private String broadcasterURL;
	private boolean complete;
	
	public BoardApplyVO getInsertBoardApplyVO() {
		return new BoardApplyVO(ownerId, content, broadcasterURL);
	}
	
	public BoardApplyVO getModifyBoardApplyVO() {
		return new BoardApplyVO(ownerId, content, broadcasterURL, complete);
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
