package jobless.dao.mapper;

import java.util.List;

import jobless.model.BoardApplyVO;

@MyAnnotMapper
public interface IBoardApplyMapper {
	void insertBoardApply(BoardApplyVO baV);
	void updateBoardApply(BoardApplyVO baV);
	void deleteBoardApply(int id);
	BoardApplyVO selectBoardApplyById(int id);
	List<BoardApplyVO> selectBoardApplyList();
	List<BoardApplyVO> selectBoardApplyOwnList(int id);
}
