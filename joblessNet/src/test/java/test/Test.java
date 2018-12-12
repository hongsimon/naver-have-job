package test;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.ClipDAO;
import jobless.dao.ContentDAO;
import jobless.dao.PostDAO;
import jobless.dao.condition.Condition;
import jobless.dao.condition.Id;
import jobless.dao.condition.Limit;
import jobless.dao.condition.Order;
import jobless.dao.condition.Period;
import jobless.dao.condition.Text;
import jobless.model.ClipDetailVO;
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

	@Autowired
	ClipDAO clipdao;
	
	@org.junit.Test @Ignore
	public void test() {
		Condition condition = new Condition();

		Id id = new Id();
		id.setWriterId(1);
		id.setBroadcasterId(1);
		id.setCategoryId(1);

		Order order = new Order();
		order.setLikes(true);

		Limit limit = new Limit(0, 5);

		Text text = new Text();

		Period period = new Period(LocalDateTime.now().minusDays(10), LocalDateTime.now());
		condition.setId(id);
		condition.setOrder(order);
		condition.setLimit(limit);
		condition.setPeriod(period);
		condition.setText(text);

		PostDetailVO post = postDao.readDetail(2);
		System.out.println(post);
		List<PostDetailVO> postList = postDao.readDetailAll(1, condition);

		if (!postList.isEmpty()) {
			for (PostDetailVO postn : postList) {
				System.out.println(postn);
			}
		} else {
			System.out.println("결과가 음슴");
		}
		
	}
	
	@org.junit.Test
	public void clipTest() {
		/*
		ClipDetailVO clip = clipdao.readDetail(5);
		
		System.out.println(clip);
		*/
		Condition condition = new Condition();
		
		Order order = new Order();
		order.setLikes(true);
		
		Period period = new Period(LocalDateTime.now().minusWeeks(1), LocalDateTime.now()); 
		
		condition.setOrder(order);
		condition.setPeriod(period);
		
		List<ClipDetailVO> list = clipdao.readDetailList(condition);
		for(ClipDetailVO clipDetail : list) {
			System.out.println(clipDetail);
		}
	}
}
