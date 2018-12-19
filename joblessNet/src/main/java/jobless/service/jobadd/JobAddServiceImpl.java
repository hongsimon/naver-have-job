package jobless.service.jobadd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.JobAddDAO;
import jobless.dao.mapper.IJobAddMapper;
import jobless.model.JobAddVO;

@Repository("jobAddSerivce")
public class JobAddServiceImpl implements JobAddService {

	@Autowired
	JobAddDAO jonAddDAO;
	
	@Override
	public List<JobAddVO> selectAllAdd() {
		List<JobAddVO> addVOs = jonAddDAO.selectAllAdd();
		return addVOs;
	}

	@Override
	public void modifyAdd(JobAddVO jobAdd) {
		jonAddDAO.modifyAdd(jobAdd);
		
	}

}
