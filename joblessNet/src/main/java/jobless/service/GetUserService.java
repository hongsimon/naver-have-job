package jobless.service;

import java.util.List;

import jobless.model.UserVO;

public interface GetUserService {
	public UserVO getUserByUserId(int userId);

	public UserVO getUserByLoginId(int loginId);
	
	public List<UserVO> getAllUser();
}
