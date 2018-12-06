package jobless.service.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ClipDAO;
import jobless.dao.CommentDAO;
import jobless.exception.WriteCommentException;
import jobless.model.CommentVO;

@Repository("writeCommentService")
public class WriteCommentServiceImpl implements WriteCommentService {

	@Autowired
	CommentDAO commentDao;

	@Override
	public void writeClipComment(CommentRequest commentReq) {
		// TODO Auto-generated method stub
		try {
			commentDao.insertIntoClip(new CommentVO(commentReq.getContent(), commentReq.getUserId(), 0, commentReq.getClipId()));
		} catch (Exception e) {
			throw new WriteCommentException(commentReq.getClipId() + "번 클립 게시물에 들어갈 comment 삽입 실패" + e);
		}
	}

	@Override
	public void writePostComment(CommentRequest commentReq) {
		// TODO Auto-generated method stub
		try {
		commentDao.insertIntoPost(new CommentVO(commentReq.getContent(), commentReq.getUserId(), commentReq.getPostId(), 0));
		}catch (Exception e) {
			throw new WriteCommentException(commentReq.getPostId() + "번 일반 게시물에 들어갈 comment 삽입 실패" + e);
		}
	}

}
