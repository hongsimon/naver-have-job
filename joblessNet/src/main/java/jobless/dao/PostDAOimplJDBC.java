package jobless.dao;

import java.util.List;

import jobless.dao.condition.Condition;
import jobless.model.PostDetailVO;
import jobless.model.PostVO;

public interface PostDAO {

	public void insert(PostVO post);
	public void update(PostVO post);
	public void updateViews(PostVO post);
	public void delete(int id);
	public PostVO read(int id);
	public int readPostTotalCount();
	public PostDetailVO readDetail(int id);
	public List<PostDetailVO> readDetailAll();
	public List<PostDetailVO> readDetailCategory(int categoryId);
	public List<PostDetailVO> readDetailList(int boardId, Condition condition);
	public List<PostVO> readAll();
	public List<PostVO> readOwnList(int id);
	public List<PostVO> readBoardIdList(int id);
	public List<PostVO> readCategoryIdList(int id);
	public int readLastInsertId();
}