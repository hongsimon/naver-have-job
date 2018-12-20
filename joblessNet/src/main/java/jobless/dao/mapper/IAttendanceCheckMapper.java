package jobless.dao.mapper;

import java.util.List;

import jobless.model.AttendanceCheckVO;

@MyAnnotMapper
public interface IAttendanceCheckMapper {
	public int selectById(AttendanceCheckVO attendanceCheck);
	
	public List<AttendanceCheckVO> selectByAll(String date);
	
	public void insert(AttendanceCheckVO attendanceCheck);
}
