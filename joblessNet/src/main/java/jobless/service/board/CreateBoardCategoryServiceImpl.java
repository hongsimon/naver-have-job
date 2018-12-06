package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardCategoryDAO;
import jobless.model.BoardCategoryVO;

@Repository("createBoardCategoryService")
public class CreateBoardCategoryServiceImpl implements CreateBoardCategoryService {

	@Autowired
	BoardCategoryDAO boardCategoryDao;
	
	@Override
	public void createBoardCategory(BoardCategoryRequest boardCategoryRequest) {
		boardCategoryDao.insert(new BoardCategoryVO(boardCategoryRequest.getCategoryName(),
													boardCategoryRequest.getBoardId()));
	}

}
