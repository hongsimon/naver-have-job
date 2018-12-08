package jobless.service.board;

import java.util.List;

import jobless.model.BoardApplyVO;

public interface ReadBoardApplyService {
	
	public BoardApplyVO readBoardApplyByBoardApplyId(int boardApplyId);
	
	public List<BoardApplyVO> readBoardApplyList();
	
	public List<BoardApplyVO> readBoardApplyOwnList(int ownerId);
}
