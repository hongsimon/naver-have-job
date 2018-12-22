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
	
	@Override
	public UserVO selectNickName(String nickName) {
		UserVO user = mapper.selectUserByNickName(nickName);
		return user;
	}

	@Override
	public UserVO selectEmail(String email) {
		UserVO user = mapper.selectUserByEmail(email);
		return user;
 	} 

	public List<UserVO> selectAll() {
		List<UserVO> user = mapper.selectAllUser();
		return user;
	}

	public void delete(int userId) {
		mapper.deleteUser(userId);
	}

	public void updateUserData(UserVO user) {
		mapper.updateUserData(user);
		
	}
	
	public void updateUserPw(UserVO user) {
		mapper.updateUserPw(user);
		
	}

	@Override
	public List<UserVO> selectStreamerAll() {
		// TODO Auto-generated method stub
		return mapper.selectStreamerAll();
	}

	@Override
	public void updateIsStreamer(int userId) {
		// TODO Auto-generated method stub
		mapper.updateIsStreamer(userId);
	}

	@Override
	public void updateIconId(UserVO user) {
		// TODO Auto-generated method stub
		mapper.updateIconId(user);
	}

	@Override
	public void pointPay(int userId) {
		mapper.pointPay(userId);
		
	}

	@Override
	public void updatePoint(int userId) {
		// TODO Auto-generated method stub
		mapper.updatePoint(userId);
	}



}
