package jobless.service.attendancecheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.AttendanceCheckDAO;
import jobless.model.AttendanceCheckVO;

@Repository("selectAttendanceCheckService")
public class SelectAttendanceCheckServiceImpl implements SelectAttendanceCheckService {

	@Autowired
	AttendanceCheckDAO attendanceCheckDao;
	
	@Override
	public int selectByIdAttendce(AttendanceCheckVO attendanceCheck) {
		int sameCheck = attendanceCheckDao.selectById(attendanceCheck);
		return sameCheck;
	}

	@Override
	public List<AttendanceCheckVO> selectByAllAttendce(String date) {
		List<AttendanceCheckVO> attendanceCheckVO = attendanceCheckDao.selectByAll(date);
		return attendanceCheckVO;
	}

}
