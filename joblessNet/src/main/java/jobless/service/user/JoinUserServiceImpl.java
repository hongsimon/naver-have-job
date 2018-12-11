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
	public void joinUser(UserRequest userRequest, String code, String securityCode) {
		
		try {
			if(userRequest == null) {
				throw new UserRequestNullException("userRequest에 빈값이 있습니다.");
			}
			if(!code.equals(securityCode)) {
				throw new DoesNotMatchSecurityCode("securityCode가 일치하지 않습니다.");
			}
			userDao.insert(new UserVO(userRequest.getLoginId(), userRequest.getNickName(), userRequest.getPassword(), userRequest.getEmail(), userRequest.getPlatformId()));
		}catch (RuntimeException e) {
			throw e;
		}
		
	}

}