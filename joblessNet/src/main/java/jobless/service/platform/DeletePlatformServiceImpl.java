package jobless.service.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PlatformDAO;

@Repository("deletePlatformService")
public class DeletePlatformServiceImpl implements DeletePlatformService{

	@Autowired
	PlatformDAO platformDao;
	
	@Override
	public void delete(int platformId) {
		// TODO Auto-generated method stub
		platformDao.delete(platformId);
	}

}
