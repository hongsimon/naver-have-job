package jobless.dao;

import java.util.List;

import jobless.model.PostVO;

public interface PostDAO {

	public void insert(PostVO post);
	public void update(PostVO post);
	public void delete(String id);
	public PostVO read(String id);
	public List<PostVO> readAll();
}