package jobless.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jobless.dao.BoardApplyDAO;
import jobless.exception.ReadBoardApplyException;
import jobless.model.BoardApplyVO;

public class ReadBoardApplyServiceImpl implements ReadBoardApplyService {

	@Autowired
	BoardApplyDAO boardApplydao;
	
	@Override
	public BoardApplyVO readBoardApplyByBoardApplyId(int boardApplyId) {
		BoardApplyVO vo = boardApplydao.read(boardApplyId);
		if(vo == null) {
			throw new ReadBoardApplyException("boardApplyId에 해당하는 컬럼을 가져오는데에 실해하였습니다.");
		}
		return vo;
	}

	@Override
	public List<BoardApplyVO> readBoardApplyList() {
		List<BoardApplyVO> list = boardApplydao.readAll();
		if(list == null) {
			throw new ReadBoardApplyException("boardApply목록을 가져오는데에 실해하였습니다.");
		}
		return list;
	}

	@Override
	public List<BoardApplyVO> readBoardApplyOwnList(int ownerId) {
		List<BoardApplyVO> list = boardApplydao.readChoosedAll(ownerId);
		if(list == null) {
			throw new ReadBoardApplyException("userId로 boardApply에 해당하는 컬럼을 가져오는데에 실해하였습니다.");
		}
		return list;
	}

}
