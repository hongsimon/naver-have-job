package jobless.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;

@Repository("deleteUserService")
public class DeleteUserServiceImpl implements DeleteUserService {

	@Autowired
	UserDAO  userdao;
	
	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub

	}

}
