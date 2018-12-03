package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IBoardMapper;
import jobless.model.BoardVO;

@Repository("Board")
class BoardDAOimplJDBC implements BoardDAO {
	@Autowired
	private IBoardMapper mapper;

	@Override
	public void insert(BoardVO board) {
		// TODO Auto-generated method stub
		mapper.insertBoard(board);
	}

	@Override
	public List<BoardVO> readAll() {
		// TODO Auto-generated method stub
		List<BoardVO> board = mapper.selectBoardList();
		return board;
	}

	@Override
	public BoardVO read(int boardId) {
		BoardVO board = mapper.selectBoard(boardId);
		return board;
	}

	@Override
	public void update(BoardVO board) {
		// TODO Auto-generated method stub
		mapper.updateBoard(board);
	}

	@Override
	public void delete(int boardId) {
		// TODO Auto-generated method stub
		mapper.deleteBoard(boardId);
	}
	
}
