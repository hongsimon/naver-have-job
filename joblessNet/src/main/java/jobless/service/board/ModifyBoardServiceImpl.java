package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardDAO;
import jobless.model.BoardVO;

@Repository("modifyBoardService")
public class ModifyBoardServiceImpl implements ModifyBoardService{
	
	@Autowired
	BoardDAO boardDao;
	
	@Override
	public void update(BoardRequest boardRequest) {
		// TODO Auto-generated method stub
		boardDao.update(new BoardVO(boardRequest.getBoardId(), 
				boardRequest.getBoardName(), boardRequest.getCSSFileName()));
	}

}
