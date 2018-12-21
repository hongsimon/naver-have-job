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
	PostDetailVO selectPostDetail(int id);
	List<PostVO> selectPostList();
	List<PostVO> selectPostOwnList(int id);
	List<PostVO> selectPostByBoardId(int id);
	List<PostVO> selectPostByCategoryId(int id);
	List<PostDetailVO> selectPostDetailAll();
	List<PostDetailVO> selectPostDetailByBoardId(int boardId);
	List<PostDetailVO> selectPostDetailByCategoryId(int categoryId);
	List<PostDetailVO> selectPostDetailCountLikeList(PostVO post);
	List<PostDetailVO> selectPostDetailByBoardIdAndCategoryId(PostDetailVO postDetail);
	List<PostDetailVO> selectDetailPostList(Map<String, Object> map);
	int selectLastInsertId();
	int selectPostCount(PostVO post);
}