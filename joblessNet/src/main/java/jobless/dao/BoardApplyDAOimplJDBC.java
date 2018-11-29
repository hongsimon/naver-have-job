package jobless.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IBoardApplyMapper;

@Repository("BoardApply")
public class BoardApplyDAOimplJDBC implements BoardApplyDAO {
	@Autowired
	private IBoardApplyMapper mapper;
}
