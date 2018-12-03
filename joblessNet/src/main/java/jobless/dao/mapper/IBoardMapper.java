package jobless.dao.mapper;

import java.util.List;

import jobless.model.BoardVO;

@MyAnnotMapper
public interface IBoardMapper {
	void insertBoard(BoardVO boardVO);
	BoardVO selectBoard(int boardId);
	List<BoardVO> selectBoardList();
	void updateBoard(BoardVO boardVO);
	void deleteBoard(int boardId);
}
