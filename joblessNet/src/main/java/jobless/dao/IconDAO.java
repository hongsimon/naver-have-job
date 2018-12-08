package jobless.dao;

import java.util.List;

import jobless.model.IconVO;

public interface IconDAO {
	public void insert(IconVO icon);
	
	public IconVO select(int iconId);
	
	public List<IconVO> selectAll();
	
	public void delete(int iconId);
	
	public void update(IconVO icon);
}
