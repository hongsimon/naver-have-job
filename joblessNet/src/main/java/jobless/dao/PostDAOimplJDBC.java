package jobless.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IPostMapper;

@Repository("PostDAO")
public class PostDAOimplJDBC implements PostDAO {
	@Autowired
	private IPostMapper mapper;
}
