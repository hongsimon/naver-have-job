package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IPlatformMapper;
import jobless.model.PlatformVO;

@Repository("PlatformDAO")
public class PlatformDAOimplJDBC implements PlatformDAO {
	@Autowired
	private IPlatformMapper mapper;

	@Override
	public void insert(PlatformVO platform) {
		// TODO Auto-generated method stub
		mapper.insertPlatform(platform);
	}

	@Override
	public List<PlatformVO> readAll() {
		// TODO Auto-generated method stub
		List<PlatformVO> platformList = mapper.selectPlatformList();
		return platformList;
	}

	@Override
	public void update(PlatformVO platform) {
		// TODO Auto-generated method stub
		mapper.updatePlatform(platform);
	}

	@Override
	public void delete(int platformId) {
		// TODO Auto-generated method stub
		mapper.deletePlatform(platformId);
	}
	
}
