package jobless.dao;

import java.util.List;

import jobless.model.PostDetailVO;
import jobless.model.PostVO;

public interface PostDAO {

	public void insert(PostVO post);
	public void update(PostVO post);
	public void delete(int id);
	public PostVO read(int id);
	public PostDetailVO readDetail(int id);
	public List<PostVO> readAll();
	public List<PostVO> readChoosedAll(int id);
}