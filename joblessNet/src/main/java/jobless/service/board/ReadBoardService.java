package jobless.service.board;

import java.util.List;

import jobless.model.BoardVO;

public interface ReadBoardService {
public List<BoardVO> readAll();
	
	public BoardVO read(int boardId);
}
