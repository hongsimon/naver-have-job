package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardDAO;
import jobless.exception.ModifyBoardException;
import jobless.model.BoardVO;

@Repository("modifyBoardService")
public class ModifyBoardServiceImpl implements ModifyBoardService{
	
	@Autowired
	BoardDAO boardDao;
	
	@Override
	public void update(BoardRequest boardRequest) {
		try {
			boardDao.update(new BoardVO(boardRequest.getBoardId(), 
					boardRequest.getBoardName(), boardRequest.getCSSFileName()));
		} catch (Exception e) {
			throw new ModifyBoardException("board에 update를 실패하였습니다.");
		}
	}

}
