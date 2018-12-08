package jobless.service.user;

import java.util.List;

import jobless.model.UserVO;

public interface GetUserService {
	public UserVO getUserByUserId(int userId);

	public UserVO getUserByLoginId(String loginId);
	
	public List<UserVO> getAllUser();
}
