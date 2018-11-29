package jobless.dao;

import java.util.List;

import jobless.model.UserVO;

public interface UserDAO {
	public void insert(UserVO user);
	
	public UserVO select(int userId);
	
	public List<UserVO> select();
	
	public void delete(int userId);
	
	public void update(UserVO user);
}
