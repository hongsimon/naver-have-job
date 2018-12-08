package jobless.dao;

import java.util.List;

import jobless.model.UserVO;

public interface UserDAO {
	public void insert(UserVO user);
	
	public UserVO selectUserId(int userId);
	
	public UserVO selectLoginId(String loginId);

	public UserVO selectNickName(String nickName);
	
	public UserVO selectEmail(String email);
	
	public List<UserVO> selectAll();
	
	public void delete(int userId);
	
	public void update(UserVO user);
}
