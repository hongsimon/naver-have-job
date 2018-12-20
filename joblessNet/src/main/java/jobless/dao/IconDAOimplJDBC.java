package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IIconMapper;
import jobless.model.IconVO;
import jobless.model.MyIconVO;

@Repository("IconDAO")
public class IconDAOimplJDBC implements IconDAO {
	@Autowired
	private IIconMapper mapper;

	@Override
	public void insert(IconVO icon) {
		mapper.insertIcon(icon);
		
	}

	@Override
	public IconVO select(int iconId) {
		IconVO icon = mapper.selectIconById(iconId);
		return icon;
	}

	@Override
	public List<IconVO> selectAll() {
		List<IconVO> icon = mapper.selectAllIcon();
		return icon;
	}

	@Override
	public void delete(int iconId) {
		mapper.deleteIcon(iconId);
		
	}

	@Override
	public void update(IconVO icon) {
		mapper.updateIcon(icon);
		
	}

	@Override
	public void insertMyIcon(MyIconVO myIcon) {
		// TODO Auto-generated method stub
	
	}
}
