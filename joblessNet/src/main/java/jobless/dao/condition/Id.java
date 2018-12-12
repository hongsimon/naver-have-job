package jobless.dao.condition;

import org.apache.ibatis.type.Alias;

@Alias("Id")
public class Id {
	private int writerId;
	private int broadcasterId;
	private int categoryId;

	public int getWriterId() {
		return writerId;
	}

	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}

	public int getBroadcasterId() {
		return broadcasterId;
	}

	public void setBroadcasterId(int broadcasterId) {
		this.broadcasterId = broadcasterId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
}
