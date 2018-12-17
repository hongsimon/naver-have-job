package jobless.dao.mapper;

import java.util.List;

import jobless.model.JobAddVO;

@MyAnnotMapper
public interface IJobAddMapper {
	public List<JobAddVO> selelctAllAdd();
}
