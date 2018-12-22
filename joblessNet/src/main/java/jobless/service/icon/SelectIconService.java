package jobless.service.icon;

import java.util.List;

import jobless.model.IconVO;

public interface SelectIconService {
	public IconVO SelectIconById(int iconId);
	
	public List<IconVO> selectMyIconByAll(int userId);
	
	public List<IconVO> SelectIconByAll();
}
