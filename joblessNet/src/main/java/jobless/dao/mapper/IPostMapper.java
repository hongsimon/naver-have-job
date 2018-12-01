package jobless.dao.mapper;

import java.util.List;

import jobless.model.PostVO;

@MyAnnotMapper
public interface IPostMapper {
	void insertPost(PostVO post);
	void updatePost(PostVO post);
	void deletePost(String id);
	PostVO selectPostById(String id);
	List<PostVO> selectPostList();
}