package jobless.service.icon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.IconDAO;
import jobless.model.IconVO;
import jobless.model.MyIconVO;

@Repository("createIconService")
public class CreateIconServiceImpl implements CreateIconService {

	@Autowired
	IconDAO iconDao;
	
	@Override
	public void CreateIcon(IconRequest IconRequest) {
		iconDao.insert(new IconVO(IconRequest.getFileName(), IconRequest.getIconName()));
	}

	@Override
	public void insertMyIcon(int iconId, int userId) {
		// TODO Auto-generated method stub
		iconDao.insertMyIcon(new MyIconVO(userId, iconId));
	}

}
