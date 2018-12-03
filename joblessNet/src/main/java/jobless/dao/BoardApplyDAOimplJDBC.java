package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IBoardApplyMapper;
import jobless.model.BoardApplyVO;

@Repository("BoardApply")
public class BoardApplyDAOimplJDBC implements BoardApplyDAO {
	@Autowired
	private IBoardApplyMapper mapper;
	
	@Override
	public void insert(BoardApplyVO baV) {
		mapper.insertBoardApply(baV);
	}
	
	@Override
	public void update(BoardApplyVO baV) {
		mapper.updateBoardApply(baV);
	}
	
	@Override
	public void delete(int id) {
		mapper.deleteBoardApply(id);
	}
	
	@Override
	public BoardApplyVO read(int id) {
		return mapper.selectBoardApplyById(id);
	}
	
	@Override
	public List<BoardApplyVO> readAll() {
		return mapper.selectBoardApplyList();
	}
	
	@Override
	public List<BoardApplyVO> readChoosedAll(int id) {
		return mapper.selectBoardApplyOwnList(id);
	}
	
}
