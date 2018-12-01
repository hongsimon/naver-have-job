package jobless.service;

import java.util.List;

import jobless.model.PostVO;

public interface GetPostService {
	List<PostVO> getAllPost();

	List<PostVO> getPostByUserId(int userId);

	List<PostVO> getPostByBoardId(int boardId);

	List<PostVO> getPostByCategoryId(int categoryId);
}
