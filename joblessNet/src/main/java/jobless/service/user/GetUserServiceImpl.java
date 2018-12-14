package jobless.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;
import jobless.exception.UserNotFoundException;
import jobless.model.UserVO;

@Repository("getUserService")
public class GetUserServiceImpl implements GetUserService {
	
	@Autowired
	UserDAO userdao;

	@Override
	public UserVO getUserByUserId(int userId) {
		UserVO user = userdao.selectUserId(userId);
		try {
			
			if(user == null) {
				throw new UserNotFoundException("사용자를 찾지 못했습니다.");
			}
			
		}catch (RuntimeException e) {
			throw e;
		}
		
		return user;
	}

	@Override
	public UserVO getUserByLoginId(String loginId) {
		UserVO user = userdao.selectLoginId(loginId);
		try {
			
			if(user == null) {
				throw new UserNotFoundException("사용자를 찾지 못했습니다.");
			}
			
		}catch (RuntimeException e) {
			throw e;
		}
		
		return user;
	}
	
	@Override
	public UserVO getUserByNickName(String nickName) {
		UserVO user = userdao.selectNickName(nickName);
		
		return user;
	}

	@Override
	public UserVO getUserByEmail(String email) {
		UserVO user = userdao.selectEmail(email);
		
		return user;
	}
	
	@Override
	public List<UserVO> getAllUser() {
		List<UserVO> user = userdao.selectAll();
		try {
			
			if(user == null) {
				throw new UserNotFoundException("사용자를 찾지 못했습니다.");
			}
			
		}catch (RuntimeException e) {
			throw e;
		}
		
		return user;
	}

	@Override
	public List<UserVO> getStreamerAll() {
		// TODO Auto-generated method stub
		return userdao.selectStreamerAll();
	}



}
