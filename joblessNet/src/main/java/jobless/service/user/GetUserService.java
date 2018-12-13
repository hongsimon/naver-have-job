package jobless.service.user;

import java.util.List;

import jobless.model.UserVO;

public interface GetUserService {
	public UserVO getUserByUserId(int userId);

	public UserVO getUserByLoginId(String loginId);
	
	public UserVO getUserByNickName(String nickName);
	
	public UserVO getUserByEmail(String email);
	
	public List<UserVO> getAllUser();
	
	public List<UserVO> getStreamerAll();
}
