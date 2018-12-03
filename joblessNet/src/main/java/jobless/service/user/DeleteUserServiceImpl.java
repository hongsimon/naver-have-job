package jobless.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;
import jobless.exception.UserNotFoundException;
import jobless.model.UserVO;

@Repository("deleteUserService")
public class DeleteUserServiceImpl implements DeleteUserService {

	@Autowired
	UserDAO  userdao;
	
	@Override
	public void deleteUser(int userId) {
		try {
			UserVO user = userdao.select(userId);
			if(user == null) {
				throw new UserNotFoundException(userId + "번 사용자를 찾지 못했습니다.");
			}
			userdao.delete(userId);
		} catch (RuntimeException e) {
			throw e;
		}

	}

}
