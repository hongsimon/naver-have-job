package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardDAO;

@Repository("deleteBoardService")
public class DeleteBoardServiceImpl implements DeleteBoardService{

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public void delete(int boardId) {
		// TODO Auto-generated method stub
		boardDao.delete(boardId);
	}

}
