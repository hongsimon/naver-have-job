package jobless.service.platform;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PlatformDAO;
import jobless.model.PlatformVO;

@Repository("readPlatformService")
public class ReadPlatformServiceImpl implements ReadPlatformService{

	@Autowired
	PlatformDAO platformDao;
	
	@Override
	public List<PlatformVO> readAll() {
		// TODO Auto-generated method stub
		List<PlatformVO> platform = platformDao.readAll();
		return platform;
	}

}
