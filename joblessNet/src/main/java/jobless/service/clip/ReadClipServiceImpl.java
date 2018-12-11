package jobless.service.clip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ClipDAO;
import jobless.dao.condition.Condition;
import jobless.exception.ClipNotFoundException;
import jobless.model.ClipDetailVO;
import jobless.model.ClipVO;

@Repository("readClipService")
public class ReadClipServiceImpl implements ReadClipService{

	@Autowired
	ClipDAO clipdao;
	
	@Override
	public List<ClipVO> readAllClip() {
		List<ClipVO> clip = clipdao.readAll();
		if(clip == null) {
			throw new ClipNotFoundException("readAll 할 Clip이 없습니다.");
		}
		return clip;
	}

	@Override
	public List<ClipVO> readClipByUserId(int userId) {
		List<ClipVO> clipList = clipdao.readWriterAll(userId);
		if(clipList == null) {
			throw new ClipNotFoundException("readAll 할 Clip이 없습니다.");
		}
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
	public ClipVO readClip(int clipId) {
		// TODO Auto-generated method stub
		clipdao.readToIncreaseViews(clipId);
		ClipVO clip = clipdao.read(clipId);
		if(clip == null) {
			throw new ClipNotFoundException("readAll 할 Clip이 없습니다.");
		}
		return clip;
	}

	@Override
	public ClipDetailVO readClipDetail(int clipId) {
		clipdao.readToIncreaseViews(clipId);
		ClipDetailVO clip = clipdao.readDetail(clipId);
		if(clip == null) {
			throw new ClipNotFoundException("readAll 할 Clip이 없습니다.");
		}
		return clip;
	}

	@Override
	public List<ClipDetailVO> readClipDetailList(Condition condition) {
		List<ClipDetailVO> clipList = clipdao.readDetailList(condition);
		if(clipList == null) {
			throw new ClipNotFoundException("readAll 할 Clip이 없습니다.");
		}
		return clipList;
	}

}
