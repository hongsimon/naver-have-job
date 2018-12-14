package jobless.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.ILikeMapper;
import jobless.model.LikeVO;

@Repository("Like")
public class LikeDAOImpl implements LikeDAO {
	
	@Autowired
	ILikeMapper mapper;

	@Override
	public LikeVO selectClipLike(LikeVO like) {
		LikeVO likeValue = mapper.selectClipLike(like);
		return likeValue;
	}
	
	@Override
	public LikeVO selectPostLike(LikeVO like) {
		LikeVO likeValue = mapper.selectPostLike(like);
		return likeValue;
	}
	
	@Override
	public void LikeClip(LikeVO like) {
		mapper.insertClipLike(like);

	}
	
	@Override
	public void LikePost(LikeVO like) {
		mapper.insertPostLike(like);

	}


}
