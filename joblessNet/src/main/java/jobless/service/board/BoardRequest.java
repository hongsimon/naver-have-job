package jobless.service.board;

import java.util.Map;

public class BoardRequest {
	private int boardId;
	private String boardName;
	private String CSSFileName;
	private int ownerId;
	
	public BoardRequest(int boardId, String boardName, String cSSFileName, int ownerId) {
		super();
		this.boardId = boardId;
		this.boardName = boardName;
		CSSFileName = cSSFileName;
		this.ownerId = ownerId;
	}
	
	public BoardRequest(String boardName, int ownerId) {
		this.boardName = boardName;
		this.ownerId = ownerId;
	}
	
	public int getBoardId() {
		return boardId;
	}
	public String getBoardName() {
		return boardName;
	}
	public String getCSSFileName() {
		return CSSFileName;
	}
	public int getOwnerId() {
		return ownerId;
	}
	
	public void validate(Map<String, Boolean> errors) {
		if(boardName == null || boardName.trim().isEmpty()) {
			errors.put("boardName", true);
		}
	}
	
}
