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
		return clipdao.readAll();
	}

	@Override
	public List<ClipVO> readClipByUserId(int userId) {
		List<ClipVO> clipList = clipdao.readWriterAll(userId);
		return clipList;
	}

	@Override
	public List<ClipVO> readClipByBoardId(int boardId) {
		// TODO Auto-generated method stub
		List<ClipVO> clipList = clipdao.readBroadCasterAll(boardId);
		return clipList;
	}

	@Override
	public List<ClipVO> readClipByCategoryId(int categoryId) {
		// TODO Auto-generated method sutb
		//킾
		return null;
	}

	@Override
	public ClipVO readClip(int boardId) {
		// TODO Auto-generated method stub
		ClipVO clip = clipdao.read(boardId);
		return clip;
	}

}
