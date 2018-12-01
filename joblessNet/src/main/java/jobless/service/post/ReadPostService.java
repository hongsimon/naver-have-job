package jobless.service.post;

import java.util.List;

import jobless.model.PostVO;

public interface ReadPostService {
	List<PostVO> readAllPost();

	List<PostVO> readPostByUserId(int userId);

	List<PostVO> readPostByBoardId(int boardId);

	List<PostVO> readPostByCategoryId(int categoryId);
}
