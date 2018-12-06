package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;

import jobless.dao.BoardApplyDAO;
import jobless.exception.DeleteBoardApplyException;

public class DeleteBoardApplyServiceImpl implements DeleteBoardApplyService {

	@Autowired
	BoardApplyDAO boardApplydao;
	
	@Override
	public void deleteBoardApply(int boardApplyId) {
		try {
			boardApplydao.delete(boardApplyId);
		} catch (Exception e) {
			throw new DeleteBoardApplyException(
					"boardApply목록에서 "
					+ boardApplyId 
					+ "에 해당하는 컬럼삭제에 실패 하였습니다.");
		}
	}
}
