package jobless.service.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.ClipDAO;
import jobless.dao.CommentDAO;
import jobless.model.CommentVO;

@Repository("writeCommentService")
public class WriteCommentServiceImpl implements WriteCommentService{
	
	@Autowired
	CommentDAO commentDao;

	@Override
	public void writeClipComment(CommentRequest commentReq) {
		// TODO Auto-generated method stub
		commentDao.insertIntoClip(new CommentVO(commentReq.getContent(),commentReq.getUserId(),
												0, commentReq.getClipId()));
	}

	@Override
	public void writePostComment(CommentRequest commentReq) {
		// TODO Auto-generated method stub
		commentDao.insertIntoPost(new CommentVO(commentReq.getContent(),commentReq.getUserId(),
												commentReq.getPostId(), 0));
	}
	
}
