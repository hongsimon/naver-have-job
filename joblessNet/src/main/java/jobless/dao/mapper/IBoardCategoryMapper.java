package jobless.dao.mapper;

import java.util.List;

import jobless.model.BoardCategoryVO;

@MyAnnotMapper
public interface IBoardCategoryMapper {
	public void insertBoardCategory(BoardCategoryVO boardCategory);
	
	public BoardCategoryVO selectBoardCategoryById(int boardCategoryId);
	
	public List<BoardCategoryVO> selectAllBoardCategory();
	
	public void deleteBoardCategory(int boardCategoryId);
	
	public void updateBoardCategory(BoardCategoryVO boardCategory);
}
