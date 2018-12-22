package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("PostDetail")
public class PostDetailVO {
	private PostVO post;
	private UserVO user;
	private BoardCategoryVO boardCategory;
	private ContentVO content;
	private int likes;
	private int comments;
	private String boardName;
	
	public BoardCategoryVO getBoardCategory() {
		return boardCategory;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public void setBoardCategory(BoardCategoryVO boardCategory) {
		this.boardCategory = boardCategory;
	}

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

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return "PostDetailVO [post=" + post + ", user=" + user + ", boardCategory=" + boardCategory + ", content="
				+ content + ", likes=" + likes + ", comments=" + comments + "]";
	}

	
}
