package jobless.dao.condition;

import org.apache.ibatis.type.Alias;

@Alias("Order")
public class Order {
	private boolean primaryKey;
	private boolean views;
	private boolean likes;

	public boolean isPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	public boolean getViews() {
		return views;
	}

	public void setViews(boolean views) {
		this.views = views;
	}

	public boolean getLikes() {
		return likes;
	}

	public void setLikes(boolean likes) {
		this.likes = likes;
	}

}
