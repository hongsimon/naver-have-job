package jobless.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;

@Repository("deleteUser")
public class DeleteUserServiceImpl implements DeleteUserService {

	@Autowired
	UserDAO  userdao;
	
	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub

	}

}
