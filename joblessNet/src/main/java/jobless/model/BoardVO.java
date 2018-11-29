package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("Board")
public class BoardVO {
	private int boardId;
	private String boardName;
	private String CSSFileName;
	private int ownerId;

	public BoardVO() {
	}

	public BoardVO(int boardId, String boardName, String cSSFileName, int ownerId) {
		this.boardId = boardId;
		this.boardName = boardName;
		CSSFileName = cSSFileName;
		this.ownerId = ownerId;
	}

	public BoardVO(String boardName) {
		this.boardName = boardName;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getCSSFileName() {
		return CSSFileName;
	}

	public void setCSSFileName(String cSSFileName) {
		CSSFileName = cSSFileName;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
	
}
