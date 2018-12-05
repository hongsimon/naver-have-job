package jobless.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardCategoryDAO;
import jobless.model.BoardCategoryVO;

@Repository("selectBoardCategoryService")
public class SelectBoardCategoryServiceImpl implements SelectBoardCategoryService {

	@Autowired
	BoardCategoryDAO boardCategoryDao;
	
	@Override
	public BoardCategoryVO selectBoardCategotyById(int boardCategoryId) {
		BoardCategoryVO boardCategory = boardCategoryDao.select(boardCategoryId);
		return boardCategory;
	}

	@Override
	public List<BoardCategoryVO> selectBoardCategotyByAll() {
		List<BoardCategoryVO> boardCategory = boardCategoryDao.selectAll();
		return boardCategory;
	}

}
