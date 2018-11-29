package jobless.service;

import jobless.model.PostVO;

public interface PostService {
	public PostVO getPost(int postId);
	public void writePost(PostRequest postReq);
	public void modifyPost(PostRequest postReq);
	public void deletePost(int postId);
	public void getAllPost();
}
