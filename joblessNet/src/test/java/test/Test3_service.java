package test;

import java.util.List;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.model.ClipVO;
import jobless.service.clip.ClipRequest;
import jobless.service.clip.ReadClipService;
import jobless.service.clip.WriteClipService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans.xml")
public class Test3_service {

	@Autowired
	ApplicationContext context;
	
	@Autowired
	WriteClipService writeClip;
	
	@Autowired
	ReadClipService readClip;
	
	@org.junit.Test
	//clip to service
	public void clipTest() {
		//insert
		/*writeClip.writeClip(new ClipRequest("제목", "url", 1, 2));
		List<ClipVO> clip = readClip.readAllClip();
		for (ClipVO clipVO : clip) {
			System.out.println(clipVO);
		}*/
		
		//readAll
		/*List<ClipVO> clip = readClip.readAllClip();
		for (ClipVO clipVO : clip) {
			System.out.println(clipVO);
		}*/
		
		//readAll BroadCast
		/*List<ClipVO> clip = readClip.readClipByBoardId(2);
		for (ClipVO clipVO : clip) {
			System.out.println(clipVO);
		}*/
	
		//readAll userId
		/*List<ClipVO> clip = readClip.readClipByUserId(1);
		for (ClipVO clipVO : clip) {
			System.out.println(clipVO);
		}*/
		
		//read
		/*ClipVO clip = readClip.readClip(5);
		System.out.println(clip);*/	
	}
	
}
