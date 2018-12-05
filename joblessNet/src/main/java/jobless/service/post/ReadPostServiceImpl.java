package jobless.service.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PostDAO;
import jobless.model.PostDetailVO;
import jobless.model.PostVO;

@Repository("readPostService")
public class ReadPostServiceImpl implements ReadPostService{

	@Autowired
	PostDAO postdao;
	
	@Override
	public PostVO readPostById(int postId) {
		// TODO Auto-generated method stub
		return postdao.read(postId);
	}
	
	@Override
	public PostDetailVO readPostByDetail() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<PostVO> readAllPost() {
		// TODO Auto-generated method stub
		return postdao.readAll();
	}

	@Override
	public List<PostVO> readPostByUserId(int userId) {
		// TODO Auto-generated method stub
		return postdao.readOwnList(userId);
	}

	@Override
	public List<PostVO> readPostByBoardId(int boardId) {
		// TODO Auto-generated method stub
		return postdao.readBoardIdList(boardId);
	}

	@Override
	public List<PostVO> readPostByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return postdao.readCategoryIdList(categoryId);
	}

}
