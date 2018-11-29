package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("BoardCategory")
public class BoardCategoryVO {
	private int boardCategoryId;
	private String categoryName;
	private int boardId;

	public BoardCategoryVO() {
	}

	public BoardCategoryVO(String categoryName, int boardId) {
		this.categoryName = categoryName;
		this.boardId = boardId;
	}

	public BoardCategoryVO(int boardCategoryId, String categoryName, int boardId) {
		this.boardCategoryId = boardCategoryId;
		this.categoryName = categoryName;
		this.boardId = boardId;
	}

	public int getBoardCategoryId() {
		return boardCategoryId;
	}

	public void setBoardCategoryId(int boardCategoryId) {
		this.boardCategoryId = boardCategoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
}
