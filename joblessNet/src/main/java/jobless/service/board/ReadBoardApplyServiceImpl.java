package jobless.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jobless.dao.BoardApplyDAO;
import jobless.model.BoardApplyVO;

public class ReadBoardApplyServiceImpl implements ReadBoardApplyService {

	@Autowired
	BoardApplyDAO boardApplydao;
	
	@Override
	public BoardApplyVO readBoardApplyByBoardApplyId(int boardApplyId) {
		BoardApplyVO vo = boardApplydao.read(boardApplyId);
		return vo;
	}

	@Override
	public List<BoardApplyVO> readBoardApplyList() {
		List<BoardApplyVO> list = boardApplydao.readAll();
		return list;
	}

	@Override
	public List<BoardApplyVO> readBoardApplyOwnList(int ownerId) {
		List<BoardApplyVO> list = boardApplydao.readChoosedAll(ownerId);
		return list;
	}

}
