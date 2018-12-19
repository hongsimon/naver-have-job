package jobless.service.jobadd;

import java.util.List;

import org.springframework.stereotype.Repository;

import jobless.model.JobAddVO;

public interface JobAddService {
	public List<JobAddVO> selectAllAdd();
	
	public void modifyAdd(JobAddVO jobAdd);
}
