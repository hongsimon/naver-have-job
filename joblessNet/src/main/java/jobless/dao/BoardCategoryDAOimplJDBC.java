package jobless.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IBoardCategoryMapper;

@Repository("BoardCategory")
public class BoardCategoryDAOimplJDBC implements BoardCategoryDAO {
	@Autowired
	private IBoardCategoryMapper mapper;
}
