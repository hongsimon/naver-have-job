package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardCategoryDAO;
import jobless.model.BoardCategoryVO;

@Repository("createBoardService")
public class CreateBoardServiceImpl implements CreateBoardService {

	@Autowired
	BoardCategoryDAO boardCategoryDao;
	
	@Override
	public void createBoard(BoardCategoryVO boardCategory) {
		boardCategoryDao.insert(boardCategory);
	}

}
