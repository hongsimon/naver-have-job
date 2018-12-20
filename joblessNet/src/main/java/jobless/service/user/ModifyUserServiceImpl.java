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
	public void modifyUserData(UserRequest userRequest) {
		userdao.updateUserData(new UserVO(userRequest.getUserId(), userRequest.getNickName(), userRequest.getEmail()));

	}
	
	@Override
	public void modifyUserPw(UserRequest userRequest) {
		userdao.updateUserPw(new UserVO(userRequest.getUserId(), userRequest.getNewPw()));

	}

	@Override
	public void updateIsStreamer(int userId) {
		// TODO Auto-generated method stub
		userdao.updateIsStreamer(userId);
	}

	@Override
	public void pointPay(int userId) {
		// TODO Auto-generated method stub
		
	}

}
