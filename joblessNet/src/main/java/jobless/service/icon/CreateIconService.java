package jobless.service.icon;

import jobless.model.IconVO;

public interface CreateIconService {
	public void CreateIcon(IconRequest IconRequest);
	
	public void insertMyIcon(int iconId, int userId);
}
