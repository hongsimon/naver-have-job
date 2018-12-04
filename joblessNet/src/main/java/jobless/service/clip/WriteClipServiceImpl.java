package jobless.service.clip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import jobless.dao.ClipDAO;
import jobless.model.ClipVO;

@Repository("writeClipService")
public class WriteClipServiceImpl implements WriteClipService {
	@Autowired
	ClipDAO clipdao;
	
	@Override
	public void writeClip(ClipRequest clipReq) {
		// TODO Auto-generated method stub
		ClipVO clip = new ClipVO(clipReq.getTitle(), clipReq.getClipURL(), 
								 clipReq.getWriterId(), clipReq.getBroadcasterId()); 
		
		clipdao.insert(clip);
	}

}
