package jobless.service.post;

import java.util.List;

import jobless.model.PostDetailVO;
import jobless.model.PostVO;

public interface ReadPostService {
	
	PostVO readPostById(int postId);
	
	PostDetailVO readPostByDetail();
	
	List<PostVO> readAllPost();

	List<PostVO> readPostByUserId(int userId);

	List<PostVO> readPostByBoardId(int boardId);

	List<PostVO> readPostByCategoryId(int categoryId);
}
