package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.condition.Condition;
import jobless.dao.mapper.IClipMapper;
import jobless.model.ClipDetailVO;
import jobless.model.ClipVO;

@Repository("Clip")
public class ClipDAOimplJDBC implements ClipDAO {

	@Autowired
	private IClipMapper mapper;

	@Override
	public void insert(ClipVO clip) {
		// TODO Auto-generated method stub
		mapper.insertClip(clip);
	}

	@Override
	public List<ClipVO> readAll() {
		// TODO Auto-generated method stub
		List<ClipVO> clipList = mapper.selectClipList();
		return clipList;
	}

	@Override
	public void delete(int clipId) {
		// TODO Auto-generated method stub
		mapper.deleteClip(clipId);
	}

	@Override
	public ClipVO read(int clipId) {
		// TODO Auto-generated method stub
		ClipVO clip = mapper.selectClipById(clipId);
		return clip;
	}

	@Override
	public List<ClipVO> readWriterAll(int writerId) {
		// TODO Auto-generated method stub
		List<ClipVO> clipList = mapper.selectClipByWriterId(writerId);
		return clipList;
	}

	@Override
	public List<ClipVO> readBroadCasterAll(int broadCasterId) {
		// TODO Auto-generated method stub
		List<ClipVO> clipList = mapper.selectClipByBroadcasterId(broadCasterId);
		return clipList;
	}

	@Override
	public List<ClipDetailVO> readDetailList(Condition condition) {
		List<ClipDetailVO> clipList = mapper.selectClipDetailList();
		return clipList;
	}

	@Override
	public void readToIncreaseViews(int clipId) {
		// TODO Auto-generated method stub
		mapper.readToIncreaseViews(clipId);
	}

	@Override
	public ClipDetailVO readDetail(int clipId) {
		ClipDetailVO clip = mapper.selectClipDetail(clipId);
		return clip;
	}

}
