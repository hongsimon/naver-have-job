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
	private boolean streamer;
	private int iconId;
	private int boardId;
	private String fileName;
	
	public UserVO() {
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

	public boolean getAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		
		this.admin = admin;
	}

	public boolean getBan() {
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

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	
	
	// insert용
	public UserVO(String loginId, String nickName, String password, String email, int platformId) {
		super();
		this.loginId = loginId;
		this.nickName = nickName;
		this.password = password;
		this.email = email;
		this.platformId = platformId;
	}

	// update 용
		public UserVO(int userId, String nickName, String email) {
			super();
			this.userId = userId;
			this.nickName = nickName;
			this.email = email;
		}
		
		// update 용
		public UserVO(int userId, String password) {
			super();
			this.userId = userId;
			this.password = password;
		}
	
	// update 용
	public UserVO(int userId, String nickName, String password, String email, boolean streamer, int iconId) {
		super();
		this.userId = userId;
		this.nickName = nickName;
		this.password = password;
		this.email = email;
		this.streamer = streamer;
		this.iconId = iconId;
	}

	// select용
	public UserVO(int userId, String loginId, String nickName, String password, String email, int point,
			LocalDate regDate, boolean admin, boolean ban, int platformId, boolean streamer, int iconId, int boardId) {
		super();
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
		this.streamer = streamer;
		this.iconId = iconId;
		this.boardId = boardId;
	}
	
	public UserVO(int userId, String loginId, String nickName, String password, String email, int point,
			LocalDate regDate, boolean admin, boolean ban, int platformId, boolean streamer, int iconId, int boardId, String fileName) {
		super();
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
		this.streamer = streamer;
		this.iconId = iconId;
		this.boardId = boardId;
		this.fileName = fileName;
	}
	
	public UserVO(int userId, String loginId, String nickName, String password, String email, int point,
			LocalDate regDate, boolean admin, boolean ban, int platformId) {
		super();
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
	
	

	public UserVO(int userId, int iconId) {
		this.userId = userId;
		this.iconId = iconId;
	}

	public boolean matchPassword(String pwd) {
		return password.equals(pwd);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", loginId=" + loginId + ", nickName=" + nickName + ", password=" + password + ", email=" + email + ", point=" + point + ", regDate=" + regDate + ", admin=" + admin + ", ban=" + ban + ", platformId=" + platformId + ", streamer=" + streamer + ", iconId=" + iconId + ", boardId=" + boardId + ", fileName=" + fileName + "]";
	}



}