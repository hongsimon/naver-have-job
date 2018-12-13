package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("ClipDetail")
public class ClipDetailVO {
	private ClipVO clip;
	private UserVO writer;
	private UserVO broadcaster;
	private int likes;
	private int comments;

	public ClipVO getClip() {
		return clip;
	}

	public void setClip(ClipVO clip) {
		this.clip = clip;
	}

	public UserVO getWriter() {
		return writer;
	}

	public void setWriter(UserVO writer) {
		this.writer = writer;
	}

	public UserVO getBroadcaster() {
		return broadcaster;
	}

	public void setBroadcaster(UserVO broadcaster) {
		this.broadcaster = broadcaster;
	}
	
	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "ClipDetailVO [clip=" + clip + ", writer=" + writer + ", broadcaster=" + broadcaster + ", likes=" + likes + ", comments=" + comments + "]";
	}


}
