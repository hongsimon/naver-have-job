package test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.BoardApplyDAO;
import jobless.dao.ContentDAO;
import jobless.dao.PostDAO;
import jobless.model.BoardApplyVO;
import jobless.model.ContentVO;
import jobless.model.PostVO;
import jobless.service.post.PostRequest;
import jobless.service.post.WritePostService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans.xml")
public class Test5 {
	@Autowired
	ApplicationContext context;

	@Autowired
	PostDAO postDao;

	@Autowired
	ContentDAO contentDao;
	
	@Autowired
	BoardApplyDAO boardApplyDao;
	
	@Autowired
	WritePostService writePostService;
	

	//-----------------------------------------------------------------------
	
	// Post dao ����
	
	@Test @Ignore // ����
	public void testInsertPost() {
		System.out.println("insert start");
		postDao.insert(new PostVO("youg girls", 1, 1, 1, 1));
		System.out.println("insert end");
	}

	@Test @Ignore // ����
	public void testUpdatePost() {
		int postId = 19;
		String title = "HiHi";
		int categoryId = 2;
		
		System.out.println("update start");
		PostVO post = postDao.read(postId);
		System.out.println(post.toString());
		post.setTitle(title);
		post.setCategoryId(categoryId);
		postDao.update(post);
		System.out.println(post.toString());
		System.out.println("update end");
	}

	@Test @Ignore // ����
	public void testDeletePost() {
		int postId = 19;
		
		System.out.println("delete start");
		postDao.delete(postId);
		System.out.println("delete end");
	}
	
	@Test @Ignore // ����
	public void testSelectPost() {
		System.out.println("read start");
		PostVO post = postDao.read(20);
		System.out.println(post.toString());
		System.out.println("read end");
	}
	
	@Test @Ignore // ����
	public void testSelecListPost() {
		System.out.println("readAll start");
		List<PostVO> list = postDao.readAll();
		
		for (PostVO unit : list) {System.out.println(unit.toString());}
		
		System.out.println("readAll end");
	}
	
	@Test @Ignore // ����
	public void testselectOwnListPost() {
		int userId = 1;
		
		System.out.println("selectOwnList start");
		List<PostVO> list = postDao.readOwnList(userId);
		
		for (PostVO unit : list) {System.out.println(unit.toString());}
		
		System.out.println("selectOwnList end");
	}
	
	
	
	
	
	
	
	
	
	
	//-----------------------------------------------------------------------
	
	// Content dao ����
	
	@Test @Ignore // ����
	public void testInsertContent() {
		String content = "hello mom";
		
		System.out.println("insert start");
		contentDao.insert(new ContentVO(content));
		System.out.println("insert end");
	}

	@Test @Ignore // ����
	public void testUpdateContent() {
		int id = 5;
		String title = "HiHi";
		
		System.out.println("update start");
		ContentVO content = contentDao.read(id);
		System.out.println(content.toString());
		content.setContent(title);
		contentDao.update(content);
		System.out.println(content.toString());
		System.out.println("update end");
	}

	@Test @Ignore // ����
	public void testDeleteContent() {
		int id = 6;
		
		System.out.println("delete start");
		contentDao.delete(id);
		System.out.println("delete end");
	}
	
	@Test @Ignore // ����
	public void testSelectContent() {
		int id = 5;
		
		System.out.println("read start");
		ContentVO content = contentDao.read(id);
		System.out.println(content.toString());
		System.out.println("read end");
	}
	
	
	
	
	
	
	
	//-----------------------------------------------------------------------
	
	// boardApply dao (�����ڶ� �� �ۼ��ڸ� ��)
	
	@Test @Ignore // ����
	public void testInsertBoardApply() {
		System.out.println("insert start");
		boardApplyDao.insert(new BoardApplyVO(1, "youg boys", "nate.net"));
		System.out.println("insert end");
	}

	@Test @Ignore // ����
	public void testUpdateBoardApply() {
		int applyId = 3;
		String content = "HiHi";
		String broadcasterURL = "google.co.kr";
		
		System.out.println("update start");
		BoardApplyVO boardApply = boardApplyDao.read(applyId);
		System.out.println(boardApply.toString());
		boardApply.setApplyId(applyId);
		boardApply.setContent(content);
		boardApply.setBroadcasterURL(broadcasterURL);
		boardApplyDao.update(boardApply);
		System.out.println(boardApply.toString());
		System.out.println("update end");
	}

	@Test @Ignore // ����
	public void testDeleteBoardApply() {
		int applyId = 3;
		
		System.out.println("delete start");
		boardApplyDao.delete(applyId);
		System.out.println("delete end");
	}
	
	@Test @Ignore // ����
	public void testSelectBoardApplyById() {
		int applyId = 3;
		
		System.out.println("read start");
		BoardApplyVO boardApply = boardApplyDao.read(applyId);
		System.out.println(boardApply.toString());
		System.out.println("read end");
	}
	
	@Test @Ignore // ����
	public void testSelecListBoardApply() {
		System.out.println("readAll start");
		List<BoardApplyVO> list = boardApplyDao.readAll();
		
		for (BoardApplyVO unit : list) {System.out.println(unit.toString());}
		
		System.out.println("readAll end");
	}
	
	@Test @Ignore // ����
	public void testselectOwnListBoardApply() {
		int userId = 2;
		
		System.out.println("selectOwnList start");
		List<BoardApplyVO> list = boardApplyDao.readChoosedAll(userId);
		
		for (BoardApplyVO unit : list) {System.out.println(unit.toString());}
		
		System.out.println("selectOwnList end");
	}

	//-----------------------------------------------------------------------
	
	
	@Test
	public void test() {
		System.out.println("wriePostService start");
		writePostService.writePost(new PostRequest(0, "KiKi", "하하", 1, 1, 1));
		System.out.println("wriePostService end");
	}
}
