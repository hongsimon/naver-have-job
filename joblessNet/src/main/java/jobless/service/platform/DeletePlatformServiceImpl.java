package jobless.service.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PlatformDAO;
import jobless.exception.DeletePlatformException;

@Repository("deletePlatformService")
public class DeletePlatformServiceImpl implements DeletePlatformService{

	@Autowired
	PlatformDAO platformDao;
	
	@Override
	public void delete(int platformId) {
		// TODO Auto-generated method stub
		try {
			platformDao.delete(platformId);
		}catch (Exception e) {
			throw new DeletePlatformException(platformId + "번 플랫폼 삭제를 실패했습니다." + e);
		}
	}

}
