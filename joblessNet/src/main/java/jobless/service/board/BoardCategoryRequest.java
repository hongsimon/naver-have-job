package jobless.service.board;

public class BoardCategoryRequest {
	private int boardCategoryId;
	private String categoryName;
	private int boardId;
	
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
