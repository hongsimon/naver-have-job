package jobless.service.clip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ClipDAO;

@Repository("modifyClipService")
public class ModifyClipServiceImpl implements ModifyClipService{

	@Autowired
	ClipDAO clipdao;
	
	@Override
	public void modifyClip(ClipRequest clipReq) {
		// TODO Auto-generated method stub
		
	}
	
}
