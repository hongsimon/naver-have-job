package jobless.service.board;

import java.util.List;

import jobless.model.BoardCategoryVO;

public interface SelectBoardCategoryService {
	public BoardCategoryVO selectBoardCategotyById(int boardCategoryId);
	
	public List<BoardCategoryVO> selectBoardCategotyByAll();
}
