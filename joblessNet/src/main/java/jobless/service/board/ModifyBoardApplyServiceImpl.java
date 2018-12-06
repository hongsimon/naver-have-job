package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;

import jobless.dao.BoardApplyDAO;
import jobless.exception.ModifyBoardApplyException;

public class ModifyBoardApplyServiceImpl implements ModifyBoardApplyService {

	@Autowired
	BoardApplyDAO boardApplydao;
	
	@Override
	public void modifyBoardApply(BoardApplyRequest boardApplyReq) {
		try {
			boardApplydao.update(boardApplyReq.getModifyBoardApplyVO());
		} catch (Exception e) {
			throw new ModifyBoardApplyException("BoardApply 수정 실패" + e);
		}
	}
}
