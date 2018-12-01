package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IClipMapper;
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
	public void delete(int clip_id) {
		// TODO Auto-generated method stub
		mapper.deleteClip(clip_id);
	}

	@Override
	public ClipVO read(int clip_id) {
		// TODO Auto-generated method stub
		ClipVO clip =  mapper.selectClipById(clip_id);
		return clip;
	}

}
