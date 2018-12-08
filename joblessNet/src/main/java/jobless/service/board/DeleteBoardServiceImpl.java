package jobless.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.BoardDAO;
import jobless.exception.DeleteBoardExcepttion;

@Repository("deleteBoardService")
public class DeleteBoardServiceImpl implements DeleteBoardService{

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public void delete(int boardId) {
		try {
			boardDao.delete(boardId);
		} catch (Exception e) {
			throw new DeleteBoardExcepttion("boardId에 해당하는 board를 삭제에 실패하였습니다.");
		}
	}

}
