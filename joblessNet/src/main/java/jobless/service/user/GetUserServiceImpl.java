package jobless.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;
import jobless.model.UserVO;

@Repository("getUserService")
public class GetUserServiceImpl implements GetUserService {
	
	@Autowired
	UserDAO userdao;

	@Override
	public UserVO getUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO getUserByLoginId(String loginId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserVO> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
