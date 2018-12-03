package jobless.dao;

import java.util.List;

import jobless.model.BoardCategoryVO;


public interface BoardCategoryDAO {
	public void insert(BoardCategoryVO boardCategory);
	
	public BoardCategoryVO select(int boardCategoryId);
	
	public List<BoardCategoryVO> selectAll();
	
	public void delete(int boardCategoryId);
	
	public void update(BoardCategoryVO boardCategory);
}
