package jobless.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IContentMapper;

@Repository("ContentDAO")
public class ContentDAOimplJDBC implements ContentDAO {
	@Autowired
	private IContentMapper mapper;
}
