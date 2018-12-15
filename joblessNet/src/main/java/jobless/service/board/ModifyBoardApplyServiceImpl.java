package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardApplyDAO;
import jobless.exception.ModifyBoardApplyException;

@Repository("modifyBoardApplyService")
public class ModifyBoardApplyServiceImpl implements ModifyBoardApplyService {

	@Autowired
	BoardApplyDAO boardApplydao;
	
	@Override
	public void modifyBoardApply(int id) {
		try {
			boardApplydao.update(id);
		} catch (Exception e) {
			throw new ModifyBoardApplyException("BoardApply 수정 실패" + e);
		}
	}
}
