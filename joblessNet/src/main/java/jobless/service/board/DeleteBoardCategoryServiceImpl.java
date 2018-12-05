package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardCategoryDAO;

@Repository("deleteBoardCategoryService")
public class DeleteBoardCategoryServiceImpl implements DeleteBoardCategoryService {

	@Autowired
	BoardCategoryDAO boardCategoryDao;
	
	@Override
	public void deleteBoardCategory(int boardCategoryId) {
		boardCategoryDao.delete(boardCategoryId);
	}

}
