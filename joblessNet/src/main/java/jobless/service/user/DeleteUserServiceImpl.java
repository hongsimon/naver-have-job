package jobless.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.UserDAO;
import jobless.exception.UserNotDeleteException;
import jobless.exception.UserNotFoundException;
import jobless.model.UserVO;

@Repository("deleteUserService")
public class DeleteUserServiceImpl implements DeleteUserService {

	@Autowired
	UserDAO userDao;
	
	@Override
	public void deleteUser(int userId) {
		try {
			UserVO user = userDao.selectUserId(userId);
			if(user == null) {
				throw new UserNotFoundException("사용자를 찾지 못했습니다.");
			}
			
			userDao.delete(userId);
			user = userDao.selectUserId(userId);
			if(user != null) {
				throw new UserNotDeleteException("사용자를 삭제하지 못했습니다");
			}
		} catch (RuntimeException e) {
			throw e;
		}

	}

}
