package jobless.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IPostMapper;
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
	public void delete(int id) {
		postMapper.deletePost(id);
	}
	
	@Override
	public PostVO read(int id) {
		PostVO post = postMapper.selectPostById(id);
		return post;
	}
	
	@Override
	public List<PostVO> readAll() {
		List<PostVO> postList = postMapper.selectPostList();
		return postList;
	}
	
	@Override
	public List<PostVO> readChoosedAll(int id) {
		List<PostVO> postList = postMapper.selectPostOwnList(id);
		return postList;
	}
}