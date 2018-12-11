package jobless.service.post;

import java.util.List;

import jobless.dao.condition.Condition;
import jobless.model.PostDetailVO;
import jobless.model.PostVO;

public interface ReadPostService {
	
	PostVO readPostById(int postId);
	
	PostDetailVO readPostByDetail(int postId);
	
	int readPostLastId();
	
	List<PostVO> readAllPost();

	List<PostVO> readPostByUserId(int userId);

	List<PostVO> readPostByBoardId(int boardId);

	List<PostVO> readPostByCategoryId(int categoryId);
	
	List<PostDetailVO> readAllDetailPost(int boardId, Condition condition);
}
