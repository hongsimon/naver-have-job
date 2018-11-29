package test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.service.PostService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans.xml")
public class Test5 {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	PostService postService;
	
	@org.junit.Test
	public void test() {
		System.out.println(postService.getPost(1));
	}
}
