package jobless.service.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PlatformDAO;
import jobless.exception.WritePlatformException;
import jobless.model.PlatformVO;

@Repository("writePlatformService")
public class WritePlatformServiceImpl implements WritePlatformService{

	@Autowired
	PlatformDAO platformDao;
	
	@Override
	public void insert(PlatformRequest platformRequest) {
		// TODO Auto-generated method stub
		try {
		platformDao.insert(new PlatformVO(platformRequest.getPlatform()));
		}catch (Exception e) {
			// TODO: handle exception
			throw new WritePlatformException("플랫폼 추가를 실패했습니다." + e);
		}
	}

}
