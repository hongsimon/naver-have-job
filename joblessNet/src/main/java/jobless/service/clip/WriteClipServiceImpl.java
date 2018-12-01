package jobless.service.clip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ClipDAO;

@Repository("writeClipService")
public class WriteClipServiceImpl implements WriteClipService {
	@Autowired
	ClipDAO clipdao;
	
	@Override
	public void writeClip(ClipRequest clipReq) {
		// TODO Auto-generated method stub

	}

}
