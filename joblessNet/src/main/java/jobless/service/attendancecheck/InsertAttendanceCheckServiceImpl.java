package jobless.service.attendancecheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.AttendanceCheckDAO;
import jobless.model.AttendanceCheckVO;

@Repository("insertAttendanceCheckService")
public class InsertAttendanceCheckServiceImpl implements InsertAttendanceCheckService {

	@Autowired
	AttendanceCheckDAO attendanceCheckDao;
	
	@Override
	public void insertAttendceCheck(AttendanceCheckVO attendanceCheck) {
		attendanceCheckDao.insert(attendanceCheck);
	}

}
