package jobless.service.platform;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PlatformDAO;
import jobless.exception.PlatformNotFoundException;
import jobless.model.PlatformVO;

@Repository("readPlatformService")
public class ReadPlatformServiceImpl implements ReadPlatformService{

	@Autowired
	PlatformDAO platformDao;
	
	@Override
	public List<PlatformVO> readAll() {
		// TODO Auto-generated method stub
		List<PlatformVO> platform = platformDao.readAll();
		if(platform == null) {
			throw new PlatformNotFoundException("불러올 플랫폼 데이터가 없습니다.");
		}
		return platform;
	}

}
