package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardCategoryDAO;
import jobless.model.BoardCategoryVO;

@Repository("modifyBoardService")
public class ModifyBoardCategoryServiceImpl implements ModifyBoardCategoryService {

	@Autowired
	BoardCategoryDAO boardCategoryDao;
	
	@Override
	public void modifyBoardCategory(BoardCategoryVO boardCategory) {
		boardCategoryDao.update(boardCategory);
	}

}
