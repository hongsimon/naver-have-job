package jobless.service.icon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.IconDAO;
import jobless.model.IconVO;

@Repository("selectIcnoService")
public class SelectIcnoServiceImpl implements SelectIconService {

	@Autowired
	IconDAO iconDao;
	
	@Override
	public IconVO SelectIconById(int iconId) {
		IconVO icon = iconDao.select(iconId); 
		return icon;
	}

	@Override
	public List<IconVO> SelectIconAll() {
		List<IconVO> icon = iconDao.selectAll();
		return icon;
	}

}
