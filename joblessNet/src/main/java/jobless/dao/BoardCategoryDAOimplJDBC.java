package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IBoardCategoryMapper;
import jobless.model.BoardCategoryVO;

@Repository("BoardCategory")
public class BoardCategoryDAOimplJDBC implements BoardCategoryDAO {
	@Autowired
	private IBoardCategoryMapper mapper;

	@Override
	public void insert(BoardCategoryVO boardCategory) {
		mapper.insertBoardCategory(boardCategory);
	}

	@Override
	public BoardCategoryVO select(int boardCategoryId) {
		BoardCategoryVO boardCategory = mapper.selectBoardCategoryById(boardCategoryId);
		return boardCategory;
	}
	
	@Override
	public List<BoardCategoryVO> selectAllByBoardId(int boardId) {
		List<BoardCategoryVO> boardCategoryList = mapper.selectBoardCategoryByBoardId(boardId);
		return boardCategoryList;
	}

	@Override
	public List<BoardCategoryVO> selectAll() {
		List<BoardCategoryVO> boardCategory = mapper.selectAllBoardCategory();
		return boardCategory;
	}

	@Override
	public void delete(int boardCategoryId) {
		mapper.deleteBoardCategory(boardCategoryId);
	}

	@Override
	public void update(BoardCategoryVO boardCategory) {
		mapper.updateBoardCategory(boardCategory);
	}
}
