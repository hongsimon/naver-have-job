package jobless.service.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PlatformDAO;
import jobless.model.PlatformVO;

@Repository("modifyPlatformService")
public class ModifyPlatformServiceImpl implements ModifyPlatformService{

	@Autowired
	PlatformDAO platformDao;
	
	@Override
	public void update(PlatformRequest platformRequest) {
		// TODO Auto-generated method stub
		platformDao.update(new PlatformVO(platformRequest.getPlatformId(), platformRequest.getPlatform()));
	}

}
