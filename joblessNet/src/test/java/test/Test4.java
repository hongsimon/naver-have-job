package test;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.UserDAO;
import jobless.model.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans.xml")
public class Test4 {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	UserDAO userDao;
	
	@org.junit.Test
	public void test() {
		userDao.insert(new UserVO("userId", "userNickName", "userPassword", "user@email.com", 1));
//		
//		List<UserVO> userList = userDao.select();
//		for (UserVO userVO : userList) {
//			System.out.println(userVO);
//		}
	}
}
