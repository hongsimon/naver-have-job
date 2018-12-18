package jobless.service.post;

import java.util.List;

import jobless.dao.condition.Condition;
import jobless.model.ContentVO;
import jobless.model.PostDetailVO;
import jobless.model.PostVO;

public interface ReadPostService {
	
	PostVO readPostById(int postId);
	
	ContentVO readContentById(int contentId);
	
	PostDetailVO readPostByDetail(int postId);
	
	int readPostLastId();
	
	int readPostTotalCount(int boardId);
	
	List<PostVO> readAllPost();

	List<PostVO> readPostByUserId(int userId);

	List<PostVO> readPostByBoardId(int boardId);

	List<PostVO> readPostByCategoryId(int categoryId);
	
	List<PostDetailVO> readDetailPostAll();
	
	List<PostDetailVO> readdetailPostByBoardId(int boardId);
	
	List<PostDetailVO> readDetailPostByCategoryId(int categoryId);
	
	List<PostDetailVO> readDetailPostByBoardIdAndCategoryId(PostDetailVO postDetail);
	
	List<PostDetailVO> readDetailPostList(int boardId, Condition condition);
	
}
