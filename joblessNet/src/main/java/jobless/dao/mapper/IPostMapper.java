package jobless.dao.mapper;

import java.util.List;
import java.util.Map;

import jobless.model.PostDetailVO;
import jobless.model.PostVO;

@MyAnnotMapper
public interface IPostMapper {
	void insertPost(PostVO post);
	void updatePost(PostVO post);
	void updatePostView(PostVO post);
	void deletePost(int id);
	PostVO selectPostById(int id);
	List<PostVO> selectPostList();
	List<PostVO> selectPostOwnList(int id);
	PostDetailVO selectPostDetail(int id);
	List<PostDetailVO> selectPostDetailAll();
	List<PostDetailVO> selectDetailPostList(Map<String, Object> map);
	List<PostVO> selectPostByBoardId(int id);
	List<PostVO> selectPostByCategoryId(int id);
	List<PostDetailVO> selectPostDetailByCategoryId(int categoryId);
	int selectLastInsertId();
	int selectPostCount(int boardId);
}