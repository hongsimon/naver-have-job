package test;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.BoardCategoryDAO;
import jobless.dao.IconDAO;
import jobless.dao.UserDAO;
import jobless.exception.UserNotFoundException;
import jobless.model.BoardCategoryVO;
import jobless.model.IconVO;
import jobless.model.UserVO;
import jobless.service.user.DeleteUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans.xml")
public class Test4 {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	UserDAO userDao;
	
	@Autowired
	IconDAO iconDao;
	
	@Autowired
	BoardCategoryDAO boardCategoryDAO;
	
	//DB 연결 테스트
	@Test @Ignore
	public void testDbConn() {
		DataSource ds = (DataSource)context.getBean("dataSource");
		try {
			System.out.println(ds.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//boardCategory기능 테스트
	@Test
	public void BoardCategoryTest() {
//		boardCategoryDAO.insert(new BoardCategoryVO("test_board_name", 1));
//		System.out.println(boardCategoryDAO.select(1));
//		System.out.println(boardCategoryDAO.selectAll());
		boardCategoryDAO.update(new BoardCategoryVO(1, "test_name", 1));
	}
	
	
	//Icon기능 테스트
	@Test @Ignore
	public void IconTest() {
//		iconDao.insert(new IconVO("케장콘"));
//		iconDao.update(new IconVO(1, "멸시콘"));
//		System.out.println(iconDao.select(1));
//		System.out.println(iconDao.selectAll());
		
	}
	
	@Autowired
	DeleteUserService deleteUserService; 
	
	//User기능 테스트
	@Test
	public void UserTest() {
		//수정 테스트
		
		
		//삭제 테스트
		//deleteUserService.deleteUser(9); 
	}
	
}
