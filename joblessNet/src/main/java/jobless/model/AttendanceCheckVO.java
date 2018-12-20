package jobless.model;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

@Alias("AttendanceCheck")
public class AttendanceCheckVO {
	
	private int userId;
	private String nickName;
	private String comment;
	private String dateAttendance;

	//select용
	public AttendanceCheckVO(int userId, String dateAttendance) {
		super();
		this.userId = userId;
		this.dateAttendance = dateAttendance;
	}

	//insert 용
	public AttendanceCheckVO(int userId, String nickName, String comment) {
		super();
		this.userId = userId;
		this.nickName = nickName;
		this.comment = comment;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDateAttendance() {
		return dateAttendance;
	}
	public void setDateAttendance(String dateAttendance) {
		this.dateAttendance = dateAttendance;
	}

	@Override
	public String toString() {
		return "AttendanceCheckVO [userId=" + userId + ", comment=" + comment + ", dateAttendance=" + dateAttendance
				+ "]";
	}
	
	
	
	
	
}
