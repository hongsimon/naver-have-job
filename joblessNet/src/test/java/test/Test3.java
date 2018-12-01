package test;

import java.util.List;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.ClipDAO;
import jobless.model.ClipVO;

//clip, comment, content //test~~~By Daeheon//
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans.xml")
public class Test3 {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	ClipDAO clipDao;
	
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
	
	@org.junit.Test
	public void commentTest() {
		
	}
}
