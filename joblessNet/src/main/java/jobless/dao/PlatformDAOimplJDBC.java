package jobless.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IPlatformMapper;

@Repository("PlatformDAO")
public class PlatformDAOimplJDBC implements PlatformDAO {
	@Autowired
	private IPlatformMapper mapper;
}
