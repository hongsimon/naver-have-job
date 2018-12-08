package jobless.dao.mapper;

import java.util.List;

import jobless.model.PlatformVO;


@MyAnnotMapper
public interface IPlatformMapper {
	void insertPlatform(PlatformVO platformVO);
	List<PlatformVO> selectPlatformList();
	void updatePlatform(PlatformVO platformVO);
	void deletePlatform(int platformId);
}
