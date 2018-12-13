package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("Like")
public class LikeVO {
	
	private int userId;
	private int clip_or_postId;
	
	public LikeVO(int userId, int clip_or_postId) {
		super();
		this.userId = userId;
		this.clip_or_postId = clip_or_postId;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getClip_or_postId() {
		return clip_or_postId;
	}
	public void setClip_or_postId(int clip_or_postId) {
		this.clip_or_postId = clip_or_postId;
	}

	@Override
	public String toString() {
		return "LikeVO [userId=" + userId + ", clip_or_postId=" + clip_or_postId + "]";
	}

	
	
}
