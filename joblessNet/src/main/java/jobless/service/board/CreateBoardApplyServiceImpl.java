package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;

import jobless.dao.BoardApplyDAO;
import jobless.exception.CreateBoardApplyException;

public class CreateBoardApplyServiceImpl implements CreateBoardApplyService {

	@Autowired
	BoardApplyDAO boardApplyDao;
	
	@Override
	public void createBoardApply(BoardApplyRequest boardApplyReq) {
		try {
			boardApplyDao.insert(boardApplyReq.getInsertBoardApplyVO());
		} catch (Exception e) {
			throw new CreateBoardApplyException("BoardApply에 Insert를 실패하였습니다.");
		}
	}
}
