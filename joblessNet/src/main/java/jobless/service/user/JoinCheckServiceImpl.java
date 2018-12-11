package jobless.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;
import jobless.exception.OverlapEmailException;
import jobless.exception.OverlapLoginIdException;
import jobless.exception.OverlapNickNameException;
import jobless.model.UserVO;

@Repository("joinCheckService")
public class JoinCheckServiceImpl implements JoinCheckService {

	@Autowired
	UserDAO userdao;
	
	@Override
	public void joinCheck(UserRequest userRequest) {
		try {
		UserVO userLoginId = userdao.selectLoginId(userRequest.getLoginId());
		
		UserVO userNickName = userdao.selectNickName(userRequest.getNickName());
		
		UserVO userEmail = userdao.selectEmail(userRequest.getEmail());
		
		if(userLoginId == null) {
			System.out.println("사용가능한 아이디");
		}else if(userLoginId.getLoginId().equals(userRequest.getLoginId())) {
			throw new OverlapLoginIdException("중복된 아이디입니다.");
		}
		
		if(userNickName == null) {
			System.out.println("사용가능한 닉네임");
		}else if(userNickName.getNickName().equals(userRequest.getNickName())) {
			throw new OverlapNickNameException("중복된 닉네임입니다.");
		}
		
		if(userEmail == null) {
			System.out.println("사용가능한 이메일");
		}else if(userEmail.getEmail().equals(userRequest.getEmail())) {
			throw new OverlapEmailException("중복된 이메일입니다.");
		}
		
//		userdao.insert(new UserVO(userRequest.getLoginId(), userRequest.getNickName(), userRequest.getPassword(),
//								  userRequest.getEmail(), userRequest.getPlatformId()));
		
		
		}catch (RuntimeException e) {
			throw e;
		}
	}

}
