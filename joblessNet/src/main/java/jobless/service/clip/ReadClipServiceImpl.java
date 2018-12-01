package jobless.service.clip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ClipDAO;
import jobless.model.ClipVO;

@Repository("readClipService")
public class ReadClipServiceImpl implements ReadClipService{

	@Autowired
	ClipDAO clipdao;
	
	@Override
	public List<ClipVO> readAllClip() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClipVO> readClipByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClipVO> readClipByBoardId(int boardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClipVO> readClipByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
