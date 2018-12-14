package jobless.service.like;

import jobless.model.LikeVO;

public interface SelectLikeService {
	public void selectLikeClip(LikeVO like);
	
	public void selectLikePost(LikeVO like);
}
