package jobless.service.clip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ClipDAO;
import jobless.exception.DeleteClipException;

@Repository("deleteClipService")
public class DeleteClipServiceImpl implements DeleteClipService {

	@Autowired
	ClipDAO clipdao;

	@Override
	public void deleteClip(int clipId) {
		// TODO Auto-generated method stub
		try {
		clipdao.delete(clipId);
		}catch (Exception e) {
			// TODO: handle exception
			throw new DeleteClipException(clipId + "번 클립 삭제를 실패했습니다." + e);
		}
	}
	
}
