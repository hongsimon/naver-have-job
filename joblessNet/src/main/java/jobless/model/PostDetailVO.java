package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("PostDetail")
public class PostDetailVO {
	private PostVO post;
	private UserVO user;
	private ContentVO content;

	public PostVO getPost() {
		return post;
	}

	public void setPost(PostVO post) {
		this.post = post;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	public ContentVO getContent() {
		return content;
	}

	public void setContent(ContentVO content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "PostDetailVO [post=" + post + ", user=" + user + ", content=" + content + "]";
	}
	
	
}
