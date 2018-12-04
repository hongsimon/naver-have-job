package jobless.service.post;

import jobless.model.ContentVO;
import jobless.model.PostVO;
import jobless.model.UserVO;

public class PostRequest {
/*	private int postId;
	private String title;
	private int boardId;
	private int writerId;
	private int categoryId;
	private int contentId;
	private String content;
	*/
	PostVO post;
	UserVO user;
	
	public void validate() {
		
	}
/*	
	public PostVO getPost() {
		return new PostVO(title, contentId, boardId, writerId);
	}
	
	public ContentVO getContent() {
		return new ContentVO(contentId, content);
	}*/
}
