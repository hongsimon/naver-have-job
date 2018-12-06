package jobless.service.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PlatformDAO;
import jobless.exception.ModifyPlatformException;
import jobless.model.PlatformVO;

@Repository("modifyPlatformService")
public class ModifyPlatformServiceImpl implements ModifyPlatformService{

	@Autowired
	PlatformDAO platformDao;
	
	@Override
	public void update(PlatformRequest platformRequest) {
		// TODO Auto-generated method stub
		try {
		platformDao.update(new PlatformVO(platformRequest.getPlatformId(), platformRequest.getPlatform()));
		}catch (Exception e) {
			throw new ModifyPlatformException(platformRequest.getPlatformId()+"번 플랫폼 수정을 실패했습니다." + e);
		} 
	}

}
