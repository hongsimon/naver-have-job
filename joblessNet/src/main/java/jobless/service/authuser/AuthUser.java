package jobless.service.authuser;

public class AuthUser {

	private int userId;
	private String loginId;
	private String nickName;
	private String email;
	private int point;
	private boolean admin;
	private int platformId;
	private boolean streamer;
	private int iconId;
	
	public AuthUser(int userId, String loginId, String nickName, String email, int point, boolean admin,
			int platformId) {
		this.userId = userId;
		this.loginId = loginId;
		this.nickName = nickName;
		this.email = email;
		this.point = point;
		this.admin = admin;
		this.platformId = platformId;
	}
	
	public AuthUser(int userId, String loginId, String nickName, String email, int point, boolean admin,
			int platformId, boolean streamer, int iconId) {
		this.userId = userId;
		this.loginId = loginId;
		this.nickName = nickName;
		this.email = email;
		this.point = point;
		this.admin = admin;
		this.platformId = platformId;
		this.streamer = streamer;
		this.iconId = iconId;
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

	public int getPlatformId() {
		return platformId;
	}

	public void setPlatformId(int platformId) {
		this.platformId = platformId;
	}

	public boolean isStreamer() {
		return streamer;
	}

	public void setStreamer(boolean streamer) {
		this.streamer = streamer;
	}

	public int getIconId() {
		return iconId;
	}

	public void setIconId(int iconId) {
		this.iconId = iconId;
	}
	
}
