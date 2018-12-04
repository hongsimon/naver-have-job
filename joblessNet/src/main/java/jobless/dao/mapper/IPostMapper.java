package jobless.dao.mapper;

import java.util.List;

import jobless.model.PostDetailVO;
import jobless.model.PostVO;

@MyAnnotMapper
public interface IPostMapper {
	void insertPost(PostVO post);
	void updatePost(PostVO post);
	void deletePost(int id);
	PostVO selectPostById(int id);
	PostDetailVO selectPostDetail(int id);
	List<PostVO> selectPostList();
	List<PostVO> selectPostOwnList(int id);
}