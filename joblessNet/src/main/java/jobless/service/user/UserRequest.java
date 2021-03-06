package jobless.service.user;

import java.time.LocalDate;
import java.util.Map;

public class UserRequest {
	private int userId;
	private String loginId;
	private String nickName;
	private String password;
	private String passwordCheck;
	private String newPw;
	private String newPwCk;
	private String email;
	private int point;
	private LocalDate regDate;
	private boolean admin;
	private boolean ban;
	private int platformId;
	
	
	// 로그인용
		public UserRequest(String loginId, String password) {
			super();
			this.loginId = loginId;
			this.password = password;
		}

	// insert용
		public UserRequest(String loginId, String nickName, String password, String email, int platformId) {
			super();
			this.loginId = loginId;
			this.nickName = nickName;
			this.password = password;
			this.email = email;
			this.platformId = platformId;
		}

		// updateUser 용
		public UserRequest(int userId, String nickName, String email) {
			super();
			this.userId = userId;
			this.nickName = nickName;
			this.email = email;
		}
		
		// updatePasswordCheck 용
		public UserRequest(String password, String passwordCheck, String newPw, String newPwCk) {
			super();
			this.password = password;
			this.passwordCheck = passwordCheck;
			this.newPw = newPw;
			this.newPwCk = newPwCk;
		}
		// updatePassword 용
		public UserRequest(int userId, String newPw) {
			super();
			this.userId = userId;
			this.newPw = newPw;
		}
		
		// select용
		public UserRequest(int userId, String loginId, String nickName, String password, String email, int point,
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
	public String getPasswordCheck() {
		return passwordCheck;
	}
	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}
	public String getNewPw() {
		return newPw;
	}
	public void setNewPw(String newPw) {
		this.newPw = newPw;
	}
	public String getNewPwCk() {
		return newPwCk;
	}
	public void setNewPwCk(String newPwCk) {
		this.newPwCk = newPwCk;
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
	public int getPlatformId() {
		return platformId;
	}
	public void setPlatformId(int platformId) {
		this.platformId = platformId;
	}
	
	//패스워드가 같은지 확인하는 메소드
	public boolean isEqPassword() {
		return password != null && !password.equals(passwordCheck);
	}
	
	public boolean isEqNewPassword() {
		return newPw != null && !newPw.equals(newPwCk);
	}
	
	
	//입력받은 데이터가 빈값인지 확인하는 메소드
	private void checkEmptyStr(Map<String, Boolean> errors, String value, String fiedName) {
		if(value == null || value.isEmpty()) {
			//빈값이거나 문제가 있다면 그 결과를 다시 전송하기 위해
			//객체에 담아서 결과를 화면에 보내줌
			errors.put(fiedName, true);
		}
	}
	
	private void checkEmptyInt(Map<String, Boolean> errors, int value, String fiedName) {
		if(value < 1 || value > 4)  {
			//빈값이거나 문제가 있다면 그 결과를 다시 전송하기 위해
			//객체에 담아서 결과를 화면에 보내줌
			errors.put(fiedName, true);
		}
	}
	
	//입력받은 데이터가 제대로 들어왔는지 검사하는 메소드
	public void validate(Map<String, Boolean> errors) {
		//입력받은 값이 비어있는거 있는지 확인해서 있다면 errors true를 넣음
		checkEmptyStr(errors, loginId, "loginId");
		checkEmptyStr(errors, password, "password");
		checkEmptyStr(errors, passwordCheck, "passwordCheck");
		checkEmptyStr(errors, nickName, "nickName");
		checkEmptyStr(errors, email, "email");
		checkEmptyInt(errors, platformId, "platformId");
		//비번 재입력 부분이 입력되어있다면
		if(!errors.containsKey(passwordCheck)) {
			//두개의 비밀번호를 비교
			if(isEqPassword()) {
				errors.put("notMatchPassword", true);
			}
		}
	}
	
	public void validateLogin(Map<String, Boolean> errors) {
		checkEmptyStr(errors, loginId, "loginId");
		checkEmptyStr(errors, password, "password");
	}
	
	public void validateModify(Map<String, Boolean> errors) {
		checkEmptyStr(errors, nickName, "nickName");
		checkEmptyStr(errors, email, "email");
		
	}
	
	public void validateModifyPw(Map<String, Boolean> errors) {
		checkEmptyStr(errors, password, "password");
		checkEmptyStr(errors, newPw, "newPw");
		checkEmptyStr(errors, newPwCk, "newPwCk");
		if(password != null && !password.equals("")) {
			//두개의 비밀번호를 비교
			if(isEqPassword()) {
				errors.put("notMatchPassword", true);
			}
		}
		
		if(!errors.containsKey(newPwCk)) {
			//두개의 비밀번호를 비교
			if(isEqNewPassword()) {
				errors.put("notMatchNewPassword", true);
			}
		}
			
		if((password != null && !password.equals("")) && (newPw != null && !newPw.equals("")) && (newPwCk != null && !newPwCk.equals(""))) {
			if(newPw.equals(password)) {
				errors.put("matchNowPw", true);
			}
		}
		
		
	}
	
	
	
}
