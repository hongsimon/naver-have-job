package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("MyIcon")
public class MyIconVO {

	private int userId;
	private int iconId;
	
	public MyIconVO(int userId, int iconId) {
		this.userId = userId;
		this.iconId = iconId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getIconId() {
		return iconId;
	}

	public void setIconId(int iconId) {
		this.iconId = iconId;
	}
	
}
