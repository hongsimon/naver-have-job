package jobless.dao.mapper;

import java.util.List;

import jobless.model.UserVO;

@MyAnnotMapper
public interface IUserMapper {
	public void insert(UserVO user);
	
	public UserVO select(int userId);
	
	public List<UserVO> select();
	
	public void delete(int userId);
	
	public void update(UserVO user);
}
