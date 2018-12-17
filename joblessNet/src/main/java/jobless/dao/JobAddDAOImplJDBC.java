package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IJobAddMapper;
import jobless.model.JobAddVO;

@Repository("JobAddDAO")
public class JobAddDAOImplJDBC implements JobAddDAO {

	@Autowired
	IJobAddMapper mapper;
	
	@Override
	public List<JobAddVO> selectAllAdd() {
		List<JobAddVO> addVOs = mapper.selelctAllAdd();
		return addVOs;
	}

}
