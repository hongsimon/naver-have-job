package jobless.dao;

import java.util.List;

import jobless.model.BoardApplyVO;

public interface BoardApplyDAO {

	public void insert(BoardApplyVO baV);
	public void update(BoardApplyVO baV);
	public void delete(int id);
	public BoardApplyVO read(int id);
	public List<BoardApplyVO> readAll();
	public List<BoardApplyVO> readChoosedAll(int id);
}
