package jobless.dao.mapper;

import java.util.List;

import jobless.model.IconVO;

@MyAnnotMapper
public interface IIconMapper {
	public void insertIcon(IconVO icon);
	
	public IconVO selectIconById(int iconId);
	
	public List<IconVO> selectAllIcon();
	
	public void deleteIcon(int iconId);
	
	public void updateIcon(IconVO icon);
}
