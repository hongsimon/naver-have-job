package jobless.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IBoardMapper;

@Repository("Board")
class BoardDAOimplJDBC implements BoardDAO {
	@Autowired
	private IBoardMapper mapper;
}
