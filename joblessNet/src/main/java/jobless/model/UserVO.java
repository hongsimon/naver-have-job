package jobless.model;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;

@Alias("User")
public class UserVO {
	private int userId;
	private String loginId;
	private String nickName;
	private String password;
	private String email;
	private int point;
	private LocalDate regDate;
	private boolean admin;
	private boolean ban;
	private int platformId;

	public UserVO() {
	}

	public UserVO(String loginId, String nickName, String password, String email, int platformId) {
		this.loginId = loginId;
		this.nickName = nickName;
		this.password = password;
		this.email = email;
		this.platformId = platformId;
	}

	public UserVO(int userId, String loginId, String nickName, String password, String email, int point,
			LocalDate regDate, boolean admin, boolean ban, int platformId) {
		this.userId = userId;
		this.loginId = loginId;
		this.nickName = nickName;
		this.password = password;
		this.email = email;
		this.point = point;
		this.regDate = regDate;
		this.admin = admin;
		this.ban = ban;
		this.platformId = platformId;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
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

	public int getPlatform() {
		return platformId;
	}

	public void setPlatform(int platformId) {
		this.platformId = platformId;
	}

}
