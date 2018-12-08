package jobless.dao;

import java.util.List;

import jobless.model.BoardVO;

public interface BoardDAO {
	public void insert(BoardVO board);

	public List<BoardVO> readAll();
	
	public BoardVO read(int boardId);
	
	public void update(BoardVO board);
	
	public void delete(int boardId);

}
