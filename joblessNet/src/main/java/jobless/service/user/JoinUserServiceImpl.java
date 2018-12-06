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
	public void joinUser(UserRequest userRequest) {
		UserVO userVO = userdao.selectLoginId(userRequest.getLoginId());
		if(userVO.getLoginId().equals(userRequest.getLoginId())) {
//			throw new OverR
		}
		
		userdao.insert(new UserVO(userRequest.getLoginId(), userRequest.getNickName(), userRequest.getPassword(),
								  userRequest.getEmail(), userRequest.getPlatformId()));
		
		try {
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
