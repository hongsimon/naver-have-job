package jobless.service.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ContentDAO;
import jobless.dao.PostDAO;
import jobless.dao.condition.Condition;
import jobless.exception.ReadPostException;
import jobless.model.ContentVO;
import jobless.model.PostDetailVO;
import jobless.model.PostVO;

@Repository("readPostService")
public class ReadPostServiceImpl implements ReadPostService{

	@Autowired
	PostDAO postdao;
	
	@Autowired
	ContentDAO contentdao;
	
	@Override
	public PostVO readPostById(int postId) {
		
		PostVO post = postdao.read(postId);
		int views = post.getViews();
		views += 1;
		post.setViews(views);
		postdao.updateViews(post);
		post = postdao.read(postId);
		if(post == null) {
			throw new ReadPostException("post를 읽어오는데 실패하였습니다.");
		}
		return post;
	}
	
	@Override
	public int readPostTotalCount(PostVO post) {
		return postdao.readPostTotalCount(post);
	}
	
	@Override
	public ContentVO readContentById(int contentId) {
		
		ContentVO content = contentdao.read(contentId);
		if(content == null) {
			throw new ReadPostException("content를 읽어오는데 실패하였습니다.");
		}
		return content;
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
	public int readPostLastId() {
		int postId = postdao.readLastInsertId();
		return postId;
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

	@Override
	public List<PostDetailVO> readDetailPostAll() {
		List<PostDetailVO> postDetailAll = postdao.readDetailAll();
		System.out.println(postDetailAll);
		if(postDetailAll == null) {
			throw new ReadPostException("readDetailPostAll 실패");
		}
		return postDetailAll;
	}
	
	@Override
	public List<PostDetailVO> readdetailPostByBoardId(int boardId) {
		List<PostDetailVO> postDetailList = postdao.readDetailBoard(boardId);
		return postDetailList;
	}
	
	@Override
	public List<PostDetailVO> readDetailPostByCategoryId(int categoryId) {
		return postdao.readDetailCategory(categoryId);
	}
	
	@Override
	public List<PostDetailVO> readPostDetailCountLikeList(PostVO post) {
		return postdao.readPostDetailCountLikeList(post);
	}
	
	@Override
	public List<PostDetailVO> readDetailPostByBoardIdAndCategoryId(PostDetailVO postDetail) {
		List<PostDetailVO> postDetailList = postdao.readDetailBoardAndCategory(postDetail);
		return postDetailList;
	}
	
	//특정 게시판에 쓰여진 게시글 검색
	//Condition 객체를 이용하여 검색 조건 바꿈
	@Override
	public List<PostDetailVO> readDetailPostList(int boardId, Condition condition) {
		List<PostDetailVO> postList = postdao.readDetailList(boardId, condition);
		return postList;
	}

}
