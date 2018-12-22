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
	
	public List<UserVO> selectStreamerAll();
	
	public void delete(int userId);
	
	public void updateUserData(UserVO user);
	
	public void updateUserPw(UserVO user);
	
	public void updateIsStreamer(int userId);
	
	public void updateIconId(UserVO user);
	
	public void updatePoint(int userId);
	
	public void pointPay(int userId);
}
