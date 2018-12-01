package test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.PostDAO;
import jobless.model.PostVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans.xml")
public class Test5 {
	@Autowired
	ApplicationContext context;

	@Autowired
	PostDAO postDao;



	@Test @Ignore // 己傍
	public void testInsert() {
		System.out.println("insert start");
		postDao.insert(new PostVO("youg boys", 1, 1, 1));
		System.out.println("insert end");
	}

	@Test @Ignore // 己傍
	public void testUpdate() {
		String postId = "12";
		String title = "HiHi";
		
		System.out.println("update start");
		PostVO post = postDao.read(postId);
		System.out.println(post.toString());
		post.setTitle(title);
		postDao.update(post);
		System.out.println("update end");
	}

	@Test @Ignore // 己傍
	public void testDelete() {
		String postId = "5";
		
		System.out.println("delete start");
		postDao.delete(postId);
		System.out.println("delete end");
	}
	
	
	
	
	
	@Test @Ignore // 己傍
	public void testSelect() {
		System.out.println("read start");
		PostVO post = postDao.read("12");
		System.out.println("read end");
		System.out.println(post.toString());
	}
	@Test @Ignore // 己傍
	public void testSelecList() {
		System.out.println("readAll start");
		List<PostVO> list = postDao.readAll();
		
		for (PostVO unit : list) {System.out.println(unit.toString());}
		
		System.out.println("readAll end");
	}
}
