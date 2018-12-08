package test;

import java.time.LocalDateTime;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.ContentDAO;
import jobless.dao.PostDAO;
import jobless.dao.condition.Condition;
import jobless.dao.condition.Limit;
import jobless.dao.condition.Order;
import jobless.dao.condition.Period;
import jobless.model.PostDetailVO;

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
		Order order = new Order();
		order.setLikes(true);
		order.setViews(true);
		
		Limit limit = new Limit(0, 5);
		
		Period period = new Period(LocalDateTime.now().minusDays(2), LocalDateTime.now());
		
		Condition condition = new Condition(null, period, limit, order);
		for(PostDetailVO post : postDao.readDetailAll(condition)) {
			System.out.println(post);
		}
	}
}
