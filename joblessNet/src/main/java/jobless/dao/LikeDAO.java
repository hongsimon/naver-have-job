package jobless.dao;

import jobless.model.LikeVO;

public interface LikeDAO {
	public LikeVO selectClipLike(LikeVO like);
	
	public LikeVO selectPostLike(LikeVO like);
	
	public void LikeClip(LikeVO like);
	
	public void LikePost(LikeVO like);
}
