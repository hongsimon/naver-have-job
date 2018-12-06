package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;

import jobless.dao.BoardApplyDAO;

public class CreateBoardApplyServiceImpl implements CreateBoardApplyService {

	@Autowired
	BoardApplyDAO boardApplyDao;
	
	@Override
	public void createBoardApply(BoardApplyRequest boardApplyReq) {
		boardApplyDao.insert(boardApplyReq.getInsertBoardApplyVO());
	}
}
