package joblass.service.authUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;
import jobless.model.AuthUserVO;

@Repository("authUserService")
public class AuthUserServiceImpl implements AuthUserService {

	@Autowired
	UserDAO userDao;
	
	@Override
	public AuthUserVO AuthUser(AuthUserRequest authUserRequest) {
		
		return null;
	}

}
