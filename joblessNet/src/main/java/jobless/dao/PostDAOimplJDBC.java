package jobless.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.condition.Condition;
import jobless.dao.mapper.IPostMapper;
import jobless.model.PostDetailVO;
import jobless.model.PostVO;

@Repository("PostDAO")
public class PostDAOimplJDBC implements PostDAO {
	
	@Autowired
	private IPostMapper postMapper;
	
	@Override
	public void insert(PostVO post) {
		postMapper.insertPost(post);
	}
	
	@Override
	public void update(PostVO post) {
		postMapper.updatePost(post);
	}
	
	@Override
	public void updateViews(PostVO post) {
		postMapper.updatePostView(post);
	}
	
	@Override
	public void delete(int id) {
		postMapper.deletePost(id);
	}
	
	@Override
	public PostVO read(int id) {
		PostVO post = postMapper.selectPostById(id);
		return post;
	}

	@Override
	public PostDetailVO readDetail(int id) {
		return postMapper.selectPostDetail(id);
	}
	
	@Override
	public List<PostDetailVO> readDetailAll() {
		return postMapper.selectPostDetailAll();
	}
	
	@Override
	public List<PostVO> readAll() {
		List<PostVO> postList = postMapper.selectPostList();
		return postList;
	}
	
	@Override
	public List<PostVO> readOwnList(int id) {
		List<PostVO> postList = postMapper.selectPostOwnList(id);
		return postList;
	}
	
	@Override
	public List<PostVO> readBoardIdList(int id) {
		return postMapper.selectPostByBoardId(id);
	}

	@Override
	public List<PostDetailVO> readDetailList(int boardId, Condition condition) {
		Map<String, Object> map = new HashMap<>();
		map.put("boardId", boardId);
		map.put("condition", condition);
		return postMapper.selectDetailPostList(map);
	}
	
	@Override
	public List<PostVO> readCategoryIdList(int id) {
		return postMapper.selectPostByCategoryId(id);
	}

	@Override
	public int readLastInsertId() {
		return postMapper.selectLastInsertId();
	}
	
	
}