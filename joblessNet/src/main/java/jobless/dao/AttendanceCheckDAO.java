package jobless.dao;

import java.util.List;

import jobless.model.AttendanceCheckVO;

public interface AttendanceCheckDAO {
	public int selectById (AttendanceCheckVO attendanceCheck);
	
	public List<AttendanceCheckVO> selectByAll (String date);
	
	public void insert(AttendanceCheckVO attendanceCheck);
}
