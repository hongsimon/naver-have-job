package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IUserMapper;
import jobless.model.UserVO;

@Repository("UserDAO")
public class UserDAOImplJDBC implements UserDAO {
	@Autowired
	private IUserMapper mapper;

	public void insert(UserVO user) {
		// TODO Auto-generated method stub
		
	}

	public UserVO select(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserVO> select() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int userId) {
		// TODO Auto-generated method stub
		
	}

	public void update(UserVO user) {
		// TODO Auto-generated method stub
		
	}

}
