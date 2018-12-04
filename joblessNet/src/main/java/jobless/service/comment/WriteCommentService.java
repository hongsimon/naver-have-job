package jobless.service.comment;

import jobless.service.clip.ClipRequest;

public interface WriteCommentService {
	public void writeClipComment(CommentRequest commentReq);
	public void writePostComment(CommentRequest commentReq);
}
