package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardDAO;
import jobless.exception.InsertBoardException;
import jobless.model.BoardVO;

@Repository("insertBoardService")
public class InsertBoardServiceImpl implements InsertBoardService{
	
	@Autowired
	BoardDAO boardDao;
	
	@Override
	public void insert(BoardRequest boardRequest) {
		try {
			boardDao.insert(new BoardVO(boardRequest.getOwnerId(), boardRequest.getBoardName()));
		} catch (Exception e) {
			throw new InsertBoardException("board에 insert를 실패하였습니다.");
		}
	}
	
}
