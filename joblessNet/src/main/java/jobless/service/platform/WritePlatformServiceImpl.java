package jobless.service.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PlatformDAO;
import jobless.model.PlatformVO;

@Repository("writePlatformService")
public class WritePlatformServiceImpl implements WritePlatformService{

	@Autowired
	PlatformDAO platformDao;
	
	@Override
	public void insert(PlatformRequest platformRequest) {
		// TODO Auto-generated method stub
		platformDao.insert(new PlatformVO(platformRequest.getPlatform()));
	}

}
