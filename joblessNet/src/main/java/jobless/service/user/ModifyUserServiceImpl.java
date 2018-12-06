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
	public void modifyUser(UserRequest userRequest) {
		userdao.update(new UserVO(userRequest.getUserId(), userRequest.getNickName(), 
				  				  userRequest.getPassword(), userRequest.getEmail()));

	}

}
