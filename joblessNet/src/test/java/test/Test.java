package test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.ContentDAO;
import jobless.dao.PostDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans.xml")
public class Test {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	PostDAO postDao;
	
	@Autowired
	ContentDAO contentdao;
	
	@org.junit.Test
	public void test() {
		System.out.println(postDao.readDetail(3));
	}
}
