package jobless.service.icon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.IconDAO;
import jobless.model.IconVO;

@Repository("modifyIconService")
public class ModifyIconImpl implements ModifyIconService {

	@Autowired
	IconDAO iconDao;
	
	@Override
	public void ModifyIncon(IconRequest iconRequest) {
		iconDao.update(new IconVO(iconRequest.getIconId(), iconRequest.getFileName()));

	}

}
