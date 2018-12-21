package jobless.dao;

import java.util.List;

import jobless.model.IconVO;
import jobless.model.MyIconVO;

public interface IconDAO {
	public void insert(IconVO icon);
	
	public void insertMyIcon(MyIconVO myIcon);
	
	public IconVO select(int iconId);
	
	public List<IconVO> selectAll();
	
	public void delete(int iconId);
	
	public void update(IconVO icon);
	
	public List<IconVO> SelectMyIconByAll(int userId);
}
