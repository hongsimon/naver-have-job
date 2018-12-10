package jobless.dao.condition;

import org.apache.ibatis.type.Alias;

@Alias("Id")
public class Id {
	private int userId;
	private int categoryId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
}
