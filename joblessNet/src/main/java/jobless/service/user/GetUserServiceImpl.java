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
		UserVO user = userdao.selectUserId(userId);
		return user;
	}

	@Override
	public UserVO getUserByLoginId(String loginId) {
		UserVO user = userdao.selectLoginId(loginId);
		return user;
	}

	@Override
	public List<UserVO> getAllUser() {
		List<UserVO> user = userdao.selectAll();
		return user;
	}

}
