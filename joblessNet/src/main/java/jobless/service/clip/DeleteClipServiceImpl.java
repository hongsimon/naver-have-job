package jobless.service.clip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ClipDAO;

@Repository("deleteClipService")
public class DeleteClipServiceImpl implements DeleteClipService {

	@Autowired
	ClipDAO clipdao;

	@Override
	public void deleteClip(int clipId) {
		// TODO Auto-generated method stub
		clipdao.delete(clipId);
	}
	
}
