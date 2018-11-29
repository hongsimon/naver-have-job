package jobless.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IClipMapper;

@Repository("Clip")
public class ClipDAOimplJDBC implements ClipDAO {
	@Autowired
	private IClipMapper mapper;

}
