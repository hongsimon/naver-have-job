package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IAttendanceCheckMapper;
import jobless.model.AttendanceCheckVO;

@Repository("AttendanceCheck")
public class AttendanceCheckDAOImplJDBC implements AttendanceCheckDAO {

	@Autowired
	IAttendanceCheckMapper mapper;
	
	@Override
	public int selectById(AttendanceCheckVO attendanceCheck) {
		int sameCheck = mapper.selectById(attendanceCheck);
		return sameCheck;
	}

	@Override
	public List<AttendanceCheckVO> selectByAll(String date) {
		List<AttendanceCheckVO> attendanceCheckVO = mapper.selectByAll(date);
		return attendanceCheckVO;
	}

	@Override
	public void insert(AttendanceCheckVO attendanceCheck) {
		mapper.insert(attendanceCheck);

	}

}
