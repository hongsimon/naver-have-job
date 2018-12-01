package jobless.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PostDAO;
import jobless.model.PostVO;

@Repository("getPostService")
public class GetPostServiceImpl implements GetPostService{

	@Autowired
	PostDAO postdao;
	
	@Override
	public List<PostVO> getAllPost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostVO> getPostByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostVO> getPostByBoardId(int boardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostVO> getPostByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
