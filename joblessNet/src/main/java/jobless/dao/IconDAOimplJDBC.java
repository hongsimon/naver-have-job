package jobless.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IIconMapper;

@Repository("IconDAO")
public class IconDAOimplJDBC implements IconDAO {
	@Autowired
	private IIconMapper mapper;
}
