package jobless.dao.mapper;

import java.util.List;

import jobless.model.AuthUserVO;
import jobless.model.UserVO;

@MyAnnotMapper
public interface IUserMapper {
	public void insertUser(UserVO user);
	
	public UserVO selectUserByUserId(int userId);
	
	public UserVO selectUserByLoginId(String LoginId);
	
	public UserVO selectUserByNickName(String nickName);
	
	public UserVO selectUserByEmail(String email);
	
	public List<UserVO> selectAllUser();
	
	public void deleteUser(int userId);
	
	public void updateUser(UserVO user);
}
