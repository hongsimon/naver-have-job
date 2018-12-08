package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("AuthUser")
public class AuthUserVO {

	private int userId;
	private String loginId;
	private String nickName;
	private String email;
	private int point;
	private boolean admin;
	private boolean ban;
	private int platformId;
	
	public AuthUserVO() {}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isBan() {
		return ban;
	}

	public void setBan(boolean ban) {
		this.ban = ban;
	}

	public int getPlatformId() {
		return platformId;
	}

	public void setPlatformId(int platformId) {
		this.platformId = platformId;
	}

	public AuthUserVO(int userId, String loginId, String nickName, String email, int point, boolean admin, boolean ban,
			int platformId) {
		super();
		this.userId = userId;
		this.loginId = loginId;
		this.nickName = nickName;
		this.email = email;
		this.point = point;
		this.admin = admin;
		this.ban = ban;
		this.platformId = platformId;
	}

	
	@Override
	public String toString() {
		return "AuthUserVO [userId=" + userId + ", loginId=" + loginId + ", nickName=" + nickName + ", email=" + email
				+ ", point=" + point + ", admin=" + admin + ", ban=" + ban + ", platformId=" + platformId + "]";
	}
	
	

}
