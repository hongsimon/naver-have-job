package jobless.dao.condition;

import org.apache.ibatis.type.Alias;

@Alias("Order")
public class Order {
	private int views;
	private int likes;

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
}
