package jobless.service.icon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.IconDAO;

@Repository("deleteIconService")
public class DeleteIconServiceImpl implements DeleteIconService {

	@Autowired
	IconDAO iconDao;
	
	@Override
	public void DeleteIcon(int iconId) {
		iconDao.delete(iconId);

	}

}
