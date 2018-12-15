package jobless.service.like;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.LikeDAO;
import jobless.model.LikeVO;

@Repository("insertLikeService")
public class InsertLikeServiceImpl implements InsertLikeService {

	@Autowired
	LikeDAO likeDao;
	
	@Override
	public void insertLikeClip(LikeVO like) {
		likeDao.LikeClip(like);

	}
	
	@Override
	public void insertPostClip(LikeVO like) {
		likeDao.LikePost(like);

	}

}
