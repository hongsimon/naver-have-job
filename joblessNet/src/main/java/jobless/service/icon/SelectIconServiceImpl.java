package jobless.service.icon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.IconDAO;
import jobless.model.IconVO;

@Repository("selectIconService")
public class SelectIconServiceImpl implements SelectIconService {

	@Autowired
	IconDAO iconDao;
	
	@Override
	public IconVO SelectIconById(int iconId) {
		IconVO icon = iconDao.select(iconId); 
		return icon;
	}

	@Override
	public List<IconVO> SelectIconByAll() {
		List<IconVO> icon = iconDao.selectAll();
		return icon;
	}

	@Override
	public List<IconVO> selectMyIconByAll(int userId) {
		// TODO Auto-generated method stub
		return iconDao.selectMyIconByAll(userId);
	}

}
