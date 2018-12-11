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
import jobless.service.authuser.LoginService;
import jobless.service.board.CreateBoardCategoryService;
import jobless.service.board.DeleteBoardCategoryService;
import jobless.service.board.ModifyBoardCategoryService;
import jobless.service.board.SelectBoardCategoryService;
import jobless.service.icon.CreateIconService;
import jobless.service.icon.DeleteIconService;
import jobless.service.icon.ModifyIconService;
import jobless.service.icon.SelectIconService;
import jobless.service.user.DeleteUserService;
import jobless.service.user.GetUserService;
import jobless.service.user.JoinCheckService;
import jobless.service.user.ModifyUserService;
import jobless.service.user.UserRequest;

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
	
	@Autowired
	CreateBoardCategoryService createBoardCategoryService;
	
	@Autowired
	ModifyBoardCategoryService modifyBoardCategoryService;
	
	@Autowired
	DeleteBoardCategoryService deleteBoardCategoryService;
	
	@Autowired
	SelectBoardCategoryService selectBoardCategoryService;
	
	//boardCategory기능 테스트
	@Test  @Ignore                    
	public void BoardCategoryTest() {
		//카테고리 조회 테스트(ByAll)
//		List<BoardCategoryVO> boardCategory = selectBoardCategoryService.selectBoardCategotyByAll();
//		for (BoardCategoryVO boardCategoryVO : boardCategory) {
//			System.out.println(boardCategoryVO);
//		}
		
		//카테고리 조회 테스트(ById)
//		System.out.println(selectBoardCategoryService.selectBoardCategotyById(5));
		
		//카테고리 삭제 테스트
//		deleteBoardCategoryService.deleteBoardCategory(4);
		
		//카테고리 수정 테스트
//		modifyBoardCategoryService.modifyBoardCategory(new BoardCategoryVO(5 ,"친구가없네", 1));
		
		//카테고리 생성 테스트
//		createBoardCategoryService.createBoardCategory(new BoardCategoryVO("나는 개똥벌레", 1));
		
//		boardCategoryDAO.insert(new BoardCategoryVO("test_board_name", 1));
//		System.out.println(boardCategoryDAO.select(1));
//		System.out.println(boardCategoryDAO.selectAll());
//		boardCategoryDAO.update(new BoardCategoryVO(1, "test_name", 1));
	}
	
	@Autowired
	CreateIconService createIconService;
	
	@Autowired
	ModifyIconService modifyIconService; 
	
	@Autowired
	DeleteIconService deleteIconService; 
	
	@Autowired
	SelectIconService selectIconService;
	
	//Icon기능 테스트
	@Test @Ignore
	public void IconTest() {
		//icon 조회 테스트(모두)
//		List<IconVO> icon = selectIconService.SelectIconByAll();
//		for (IconVO iconVO : icon) {
//			System.out.println(iconVO);
//		}
		
		//icon 조회 테스트(한개만)
//		System.out.println(selectIconService.SelectIconById(1));
		
		//icon 삭제 테스트
//		deleteIconService.DeleteIcon(3);
		
		//icon 수정 테스트
//		modifyIconService.ModifyIncon(new IconVO(3, "New 정신개조콘"));
		
		//icon 등록 테스트
//		createIconService.CreateIcon(new IconVO("정신개조콘"));
		
		
//		iconDao.insert(new IconVO("케장콘"));
//		iconDao.update(new IconVO(1, "멸시콘"));
//		System.out.println(iconDao.select(1));
//		System.out.println(iconDao.selectAll());
		
	}
	
	@Autowired
	DeleteUserService deleteUserService; 
	
	@Autowired
	ModifyUserService modifyUserService; 
	
	@Autowired
	JoinCheckService joinUserService;
	
	@Autowired
	GetUserService getUserService;
	
	@Autowired
	LoginService loginService;
	
	//User기능 테스트
	@Test
	public void UserTest() {
		
		//회원 검색 테스트(All)
//		List<UserVO> user = getUserService.getAllUser();
//		for (UserVO userVO : user) {
//			System.out.println(userVO);
//		}
		
		//회원 검색 테스트(loginId)
//		System.out.println(getUserService.getUserByLoginId("tjdalsdl1214"));
		
		//회원 검색 테스트(userId)
//		System.out.println(getUserService.getUserByUserId(1));
		
		//회원 가입 테스트
//		joinUserService.joinUser(new UserVO("나는야", "퉁퉁이", "골목", "대장이라네", 1));
		
		//회원 정보 수정 테스트
//		modifyUserService.modifyUser(new UserVO(8, "포킹닉네임", "포킹패스워드", "포킹이메일"));
		
		//회원 탈퇴 테스트
//		deleteUserService.deleteUser(19); 
	}
	
}
