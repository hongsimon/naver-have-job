package jobless.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardDAO;
import jobless.model.BoardVO;

@Repository("readBoardService")
public class ReadBoardServiceImpl implements ReadBoardService{
	
	@Autowired
	BoardDAO boardDao;
	
	@Override
	public List<BoardVO> readAll() {
		// TODO Auto-generated method stub
		List<BoardVO> board = boardDao.readAll();
		return board;
	}

	@Override
	public BoardVO read(int boardId) {
		// TODO Auto-generated method stub
		BoardVO board = boardDao.read(boardId);
		return board;
	}

}
