package jobless.dao.condition;

public class Text {
	private String title;
	private String content;
	private String nickname;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = "%" + title + "%";
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = "%" + content + "%";
	}
}
