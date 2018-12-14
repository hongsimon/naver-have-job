package jobless.dao.mapper;

import jobless.model.LikeVO;

@MyAnnotMapper
public interface ILikeMapper {
	public LikeVO selectClipLike(LikeVO like);
	
	public LikeVO selectPostLike(LikeVO like);
	
	public void insertClipLike(LikeVO like);
	
	public void insertPostLike(LikeVO like);
}
