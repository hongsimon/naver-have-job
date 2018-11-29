package jobless.service;

import org.springframework.stereotype.Repository;

import jobless.model.PostVO;

@Repository("postService")
public class PostServiceImpl implements PostService {

	@Override
	public PostVO getPost(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writePost(PostRequest postReq) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyPost(PostRequest postReq) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePost(int postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllPost() {
		// TODO Auto-generated method stub
		
	}

}
