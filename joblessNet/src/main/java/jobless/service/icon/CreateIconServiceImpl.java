package jobless.service.icon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.IconDAO;
import jobless.model.IconVO;

@Repository("createIconService")
public class CreateIconServiceImpl implements CreateIconService {

	@Autowired
	IconDAO iconDao;
	
	@Override
	public void CreateIcon(IconVO icon) {
		iconDao.insert(icon);

	}

}
