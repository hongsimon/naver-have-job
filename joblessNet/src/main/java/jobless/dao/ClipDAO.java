package jobless.dao;

import java.util.List;

import jobless.model.ClipDetailVO;
import jobless.model.ClipVO;


public interface ClipDAO {
	// Clip를 디비에 넣는 메소드
	public void insert(ClipVO clip);

	// Clip리스트를 디비에서 받아오는 메소드
	public List<ClipVO> readAll();
	
	public List<ClipVO> readWriterAll(int writerId);
	
	public List<ClipVO> readBroadCasterAll(int broadCasterId);
	
	public List<ClipDetailVO> readDetailAll();

	// Clip 정보를 삭제하는 메소드
	public void delete(int clipId);

	// Clip 정보를 가져오는 메소드
	public ClipVO read(int clipId);
}
