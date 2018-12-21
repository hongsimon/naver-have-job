package jobless.service.icon;

import java.util.List;

import jobless.model.IconVO;

public interface SelectIconService {
	public IconVO SelectIconById(int iconId);
	
	public List<IconVO> SelectMyIconByAll(int userId);
	
	public List<IconVO> SelectIconByAll();
}
