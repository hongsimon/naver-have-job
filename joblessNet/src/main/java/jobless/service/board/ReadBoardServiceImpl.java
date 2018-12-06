package jobless.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardDAO;
import jobless.exception.ReadBoardException;
import jobless.model.BoardVO;

@Repository("readBoardService")
public class ReadBoardServiceImpl implements ReadBoardService{
	
	@Autowired
	BoardDAO boardDao;
	
	@Override
	public List<BoardVO> readAll() {
		List<BoardVO> board = boardDao.readAll();
		if(board == null) {
			throw new ReadBoardException("board에 모든 목록을 읽어오는데에 실패하였습니다.");
		}
		return board;
	}

	@Override
	public BoardVO read(int boardId) {
		BoardVO board = boardDao.read(boardId);
		if(board == null) {
			throw new ReadBoardException("boardId로 board목록을 읽어오는데에 실패하였습니다.");
		}
		return board;
	}

}
