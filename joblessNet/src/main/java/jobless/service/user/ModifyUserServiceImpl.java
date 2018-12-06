package jobless.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;
import jobless.model.UserVO;

@Repository("modifyUserService")
public class ModifyUserServiceImpl implements ModifyUserService {

	@Autowired
	UserDAO userdao;
	
	@Override
	public void modifyUser(UserRequest user) {
		userdao.update(new UserVO(user.getUserId(), user.getNickName(), user.getPassword(), user.getEmail()));

	}

}
