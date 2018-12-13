package jobless.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;
import jobless.exception.DoesNotMatchSecurityCode;
import jobless.exception.UserRequestNullException;
import jobless.model.UserVO;

@Repository("joinUserService")
public class JoinUserServiceImpl implements JoinUserService {

	@Autowired
	UserDAO userDao;
	
	@Override
	public void joinUser(UserRequest userRequest) {
		
		try {
			if(userRequest == null || userRequest.getLoginId().equals("") || userRequest.getNickName().equals("") || userRequest.getPassword().equals("") || userRequest.getEmail().equals("")) {
				throw new UserRequestNullException("userRequest에 빈값이 있습니다.");
			}
			userDao.insert(new UserVO(userRequest.getLoginId(), userRequest.getNickName(), userRequest.getPassword(), userRequest.getEmail(), userRequest.getPlatformId()));
		}catch (RuntimeException e) {
			throw e;
		}
		
	}

}