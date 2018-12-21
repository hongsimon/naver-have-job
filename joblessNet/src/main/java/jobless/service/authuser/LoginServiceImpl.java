package jobless.service.authuser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;
import jobless.exception.SignInFailException;
import jobless.exception.UserNotFoundException;
import jobless.model.UserVO;

@Repository("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserDAO userDao;

	@Override
	public AuthUser login(String loginId, String password) {
		
		UserVO user = userDao.selectLoginId(loginId);
		if(user == null) {
			throw new SignInFailException("존재하지 않은 사용자입니다.");
		}
		
		if(!user.matchPassword(password)) {
			throw new SignInFailException("비밀번호가 일치하지않습니다.");
		}
		
		return new AuthUser(user.getUserId(), user.getLoginId(), user.getNickName(), user.getEmail(), user.getPoint(), user.getAdmin(), user.getPlatformId() ,user.isStreamer(), user.getIconId(), user.getFileName());
	}

}
