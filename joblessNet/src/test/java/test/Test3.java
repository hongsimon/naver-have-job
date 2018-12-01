package test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.ClipDAO;
import jobless.model.ClipVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans.xml")
public class Test3 {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	ClipDAO clipDao;
	
	@org.junit.Test
	public void test() {
		clipDao.insert(new ClipVO("제목", "링크", 1, 2));
	}
}
