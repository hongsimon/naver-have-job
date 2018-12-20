package jobless.service.attendancecheck;

import java.time.LocalDateTime;
import java.util.List;

import jobless.model.AttendanceCheckVO;

public interface SelectAttendanceCheckService {
	
	public int selectByIdAttendce(AttendanceCheckVO attendanceCheck);
	
	public List<AttendanceCheckVO> selectByAllAttendce(String date);
}
