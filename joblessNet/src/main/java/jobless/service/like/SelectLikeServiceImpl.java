package jobless.service.like;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.LikeDAO;
import jobless.exception.NotMoreLikeException;
import jobless.model.LikeVO;

@Repository("selectLikeService")
public class SelectLikeServiceImpl implements SelectLikeService {

	@Autowired
	LikeDAO likeDao;
	
	@Override
	public void selectLikeClip(LikeVO like) {
		LikeVO likeValue = likeDao.selectClipLike(like);
		
		boolean Schrodinger = likeValue != null;
		if(Schrodinger) {
			System.out.println(Schrodinger);
			throw new NotMoreLikeException("더 이상 추천할수 없음니다");
		}
	}

//	@Override
//	public void selectLikePost(LikeVO like) {
//		LikeVO likeValue = likeDao.selectPostLike(like);
//	boolean Schrodinger = likeValue != null;
//	if(Schrodinger) {
//		throw new NotMoreLikeException("더 이상 추천할수 없음니다");
//	}
//	}

}
