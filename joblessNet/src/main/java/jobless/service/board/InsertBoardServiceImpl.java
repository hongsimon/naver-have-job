package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardDAO;
import jobless.model.BoardVO;

@Repository("insertBoardService")
public class InsertBoardServiceImpl implements InsertBoardService{
	
	@Autowired
	BoardDAO boardDao;
	
	@Override
	public void insert(BoardRequest boardRequest) {
		// TODO Auto-generated method stub
		boardDao.insert(new BoardVO(boardRequest.getOwnerId(), boardRequest.getBoardName()));
	}
	
}
