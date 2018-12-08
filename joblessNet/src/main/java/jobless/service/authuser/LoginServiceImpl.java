package jobless.service.authuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;

@Repository("authUserService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserDAO userDao;

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

}
