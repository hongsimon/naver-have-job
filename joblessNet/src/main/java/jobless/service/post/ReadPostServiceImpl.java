package jobless.service.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.PostDAO;
import jobless.dao.condition.Condition;
import jobless.exception.ReadPostException;
import jobless.model.PostDetailVO;
import jobless.model.PostVO;

@Repository("readPostService")
public class ReadPostServiceImpl implements ReadPostService{

	@Autowired
	PostDAO postdao;
	
	@Override
	public PostVO readPostById(int postId) {
		
		PostVO post = postdao.read(postId);
		if(post == null) {
			throw new ReadPostException("post를 읽어오는데 실패하였습니다.");
		}
		return post;
	}
	
	@Override
	public PostDetailVO readPostByDetail(int postId) {
		PostDetailVO post = postdao.readDetail(postId);
		if(post == null) {
			throw new ReadPostException("post를 읽어오는데 실패하였습니다.");
		}
		return post;
	}
	
	@Override
	public List<PostVO> readAllPost() {
		
		List<PostVO> postList = postdao.readAll();
		if(postList == null) {
			throw new ReadPostException("post목록을 읽어오는데 실패하였습니다.");
		}
		return postList;
	}

	@Override
	public List<PostVO> readPostByUserId(int userId) {
		
		List<PostVO> postList = postdao.readOwnList(userId);
		if(postList == null) {
			throw new ReadPostException("유저의 아이디로 post목록을 읽어오는데 실패하였습니다.");
		}
		return postList;
	}

	@Override
	public List<PostVO> readPostByBoardId(int boardId) {
		
		List<PostVO> postList = postdao.readBoardIdList(boardId);
		if(postList == null) {
			throw new ReadPostException("boardId로 post목록을 읽어오는 것을 실패하였습니다.");
		}
		return postList;
	}

	@Override
	public List<PostVO> readPostByCategoryId(int categoryId) {
		List<PostVO> postList = postdao.readCategoryIdList(categoryId);
		if(postList == null) {
			throw new ReadPostException("CategoryId로 post목록을 읽어오는데 실패하였습니다.");
		}
		return postList;
	}

	//특정 게시판에 쓰여진 게시글 검색
	//Condition 객체를 이용하여 검색 조건 바꿈
	@Override
	public List<PostDetailVO> readAllDetailPost(int boardId, Condition condition) {
		List<PostDetailVO> postList = postdao.readDetailAll(boardId, condition);
		return postList;
	}

}
