package jobless.dao.mapper;

import java.util.List;

import jobless.model.IconVO;
import jobless.model.MyIconVO;

@MyAnnotMapper
public interface IIconMapper {
	public void insertIcon(IconVO icon);
	
	public void insertMyIcon(MyIconVO myIcon);
	
	public IconVO selectIconById(int iconId);
	
	public List<IconVO> selectAllIcon();
	
	public List<IconVO> selectMyIconByAll(int userId);
	
	public void deleteIcon(int iconId);
	
	public void updateIcon(IconVO icon);
}
