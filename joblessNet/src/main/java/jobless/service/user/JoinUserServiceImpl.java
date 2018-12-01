package jobless.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;
import jobless.model.UserVO;

@Repository("joinUserService")
public class JoinUserServiceImpl implements JoinUserService {

	@Autowired
	UserDAO userdao;
	
	@Override
	public void joinUser(UserVO user) {
		// TODO Auto-generated method stub

	}

}
