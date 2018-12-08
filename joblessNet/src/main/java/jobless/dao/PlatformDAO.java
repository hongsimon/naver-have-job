package jobless.dao;

import java.util.List;

import jobless.model.ClipVO;
import jobless.model.PlatformVO;

public interface PlatformDAO {
	public void insert(PlatformVO platform);

	public List<PlatformVO> readAll();
	
	public void update(PlatformVO platform);
	
	public void delete(int platformId);

}
