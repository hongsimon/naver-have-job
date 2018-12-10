package test;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.ContentDAO;
import jobless.dao.PostDAO;
import jobless.dao.condition.Condition;
import jobless.dao.condition.Id;
import jobless.dao.condition.Limit;
import jobless.dao.condition.Order;
import jobless.dao.condition.Period;
import jobless.dao.condition.Text;
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
		Condition condition = new Condition();

		Id id = new Id();
		id.setUserId(1);
		id.setCategoryId(1);

		Order order = new Order();
		order.setLikes(true);
		order.setViews(true);

		Limit limit = new Limit(0, 5);

		Text text = new Text();
		text.setTitle("b");
		text.setContent("a");

		Period period = new Period(LocalDateTime.now().minusDays(10), LocalDateTime.now());
		condition.setId(id);
		condition.setOrder(order);
		condition.setLimit(limit);
		condition.setPeriod(period);
		condition.setText(text);

		List<PostDetailVO> postList = postDao.readDetailAll(1, condition);

		if (!postList.isEmpty()) {
			for (PostDetailVO post : postList) {
				System.out.println(post);
			}
		} else {
			System.out.println("결과가 음슴");
		}
	}
}
