package jobless.dao;

import java.util.List;

import jobless.model.JobAddVO;

public interface JobAddDAO {
	public List<JobAddVO> selectAllAdd();
	
	public void modifyAdd(JobAddVO jobAdd);
}
