package test;

import java.util.List;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.ClipDAO;
import jobless.dao.CommentDAO;
import jobless.dao.PlatformDAO;
import jobless.model.ClipVO;
import jobless.model.CommentVO;
import jobless.model.PlatformVO;

//clip, comment, content 
//test By YooDaeheon
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans.xml")
public class Test3 {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	ClipDAO clipDao;
	
	@Autowired
	CommentDAO commentDao;
	
	@Autowired
	PlatformDAO platformDao;
	
	//clip
	@org.junit.Test
	@Ignore
	public void clipTest() {
		//*insert Test*
		//clipDao.insert(new ClipVO("제목2", "링크2", 3, 2));
		
		//*readAll Test*
		/*List<ClipVO> clipList = clipDao.readAll();
		for (ClipVO clipVO : clipList) {
			System.out.println(clipVO);
		}*/
		
		//*readWriterAll Test*
		/*List<ClipVO> clipList = clipDao.readWriterAll(3);
		for (ClipVO clipVO : clipList) {
			System.out.println(clipVO);
		}*/
		
		//*readBroadCastAll Test*
		/*List<ClipVO> clipList = clipDao.readBroadCasterAll(1);
		for (ClipVO clipVO : clipList) {
			System.out.println(clipVO);
		}*/
		
		//*read Test*
		/*ClipVO clip = clipDao.read(2);
		System.out.println(clip);*/
		
		//*delete Test*
		/*clipDao.delete(3);
		List<ClipVO> clipList = clipDao.readAll();
		for (ClipVO clipVO : clipList) {
			System.out.println(clipVO);
		}*/
	}
	
	//comment
	@org.junit.Test
	@Ignore
	public void commentTest() {
		//*insert comment into Clip Test*
		//commentDao.insertIntoClip(new CommentVO("클립에 댓글", 1, 0, 2));
		
		//*insert comment into Post Test*
		//commentDao.insertIntoPost(new CommentVO("게시물에 댓글", 1, 1, 0));
		
		//*readAll Post Test*
		/*List<CommentVO> comment = commentDao.readAll();
		for (CommentVO commentVO : comment) {
			System.out.println(comment);
		}*/
		//*readAll Post Test*
		/*List<CommentVO> comment = commentDao.readAllByPostId(1);
		for (CommentVO commentVO : comment) {
			System.out.println(comment);
		}*/
		
		//*readAll Clip Test*
		/*List<CommentVO> comment = commentDao.readAllByClipId(2);
		for (CommentVO commentVO : comment) {
			System.out.println(comment);
		}*/
		
		//*readAll User Test*
		/*List<CommentVO> comment = commentDao.readAllByUserId(2);
		for (CommentVO commentVO : comment) {
			System.out.println(comment);
		}*/
		
		//*select Comment Test*
		/*CommentVO comment = commentDao.read(3);
		System.out.println(comment);*/
		
		//*delete Test*
		/*commentDao.delete(2);
		List<CommentVO> comment = commentDao.readAll();
		for (CommentVO commentVO : comment) {
			System.out.println(comment);
		}*/
	}
	
	//platform
	@org.junit.Test
	public void platformTest() {
		//*insert Test*
		//platformDao.insert(new PlatformVO("에러다"));
		
		//*readAll Test*
		/*List<PlatformVO> platform = platformDao.readAll();
		for (PlatformVO platformVO : platform) {
			System.out.println(platformVO);
		}*/
		
		//*update
		/*platformDao.update(new PlatformVO(5, "수정"));
		List<PlatformVO> platform = platformDao.readAll();
		for (PlatformVO platformVO : platform) {
			System.out.println(platformVO);
		}*/
		
		//*delete
		/*platformDao.delete(6);
		List<PlatformVO> platform = platformDao.readAll();
		for (PlatformVO platformVO : platform) {
			System.out.println(platformVO);
		}*/
	}
}
