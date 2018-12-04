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
		mapper.insertUser(user);
	}

	public UserVO selectUserId(int userId) {
		UserVO user = mapper.selectUserByUserId(userId);
		return user;
	}
	
	public UserVO selectLoginId(String loginId) {
		UserVO user = mapper.selectUserByLoginId(loginId);
		return user;
	}

	public List<UserVO> selectAll() {
		List<UserVO> user = mapper.selectAllUser();
		return user;
	}

	public void delete(int userId) {
		mapper.deleteUser(userId);
	}

	public void update(UserVO user) {
		mapper.updateUser(user);
		
	}

}
