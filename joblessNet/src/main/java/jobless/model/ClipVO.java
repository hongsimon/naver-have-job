package jobless.model;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

@Alias("Clip")
public class ClipVO {
	private int clipId;
	private String title;
	private String clipURL;
	private String thumbURL;
	private LocalDateTime writeDate;
	private int views;
	private int writerId;
	private int broadcasterId;
	private int platformId;
	
	public ClipVO() {
	}

	public ClipVO(int clipId, String title, String clipURL, LocalDateTime writeDate, int views, int writerId,
			int broadcasterId) {
		this.clipId = clipId;
		this.title = title;
		this.clipURL = clipURL;
		this.writeDate = writeDate;
		this.views = views;
		this.writerId = writerId;
		this.broadcasterId = broadcasterId;
	}

	public ClipVO(int clipId, String title, String clipURL, String thumbURL, LocalDateTime writeDate, int views, int writerId,
			int broadcasterId) {
		this.clipId = clipId;
		this.title = title;
		this.clipURL = clipURL;
		this.thumbURL = thumbURL;
		this.writeDate = writeDate;
		this.views = views;
		this.writerId = writerId;
		this.broadcasterId = broadcasterId;
	}
	
	public ClipVO(String title, String clipURL) {
		this.title = title;
		this.clipURL = clipURL;
	}
	
	public ClipVO(String title, String clipURL, String thumbURL, int writerId, int broadcasterId) {
		this.title = title;
		this.clipURL = clipURL;
		this.thumbURL = thumbURL;
		this.writerId = writerId;
		this.broadcasterId = broadcasterId;
	}
	
	public int getPlatformId() {
		return platformId;
	}

	public void setPlatformId(int platformId) {
		this.platformId = platformId;
	}

	public int getClipId() {
		return clipId;
	}

	public void setClipId(int clipId) {
		this.clipId = clipId;
	}
	
	public String getThumbURL() {
		return thumbURL;
	}

	public void setThumbURL(String thumbURL) {
		this.thumbURL = thumbURL;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getClipURL() {
		return clipURL;
	}

	public void setClipURL(String clipURL) {
		this.clipURL = clipURL;
	}

	public LocalDateTime getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(LocalDateTime writeDate) {
		this.writeDate = writeDate;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getWriterId() {
		return writerId;
	}

	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}

	public int getBroadcasterId() {
		return broadcasterId;
	}

	public void setBroadcasterId(int broadcasterId) {
		this.broadcasterId = broadcasterId;
	}

	@Override
	public String toString() {
		return "ClipVO [clipId=" + clipId + ", title=" + title + ", clipURL=" + clipURL + ", thumbURL=" + thumbURL + ", writeDate=" + writeDate + ", views=" + views + ", writerId=" + writerId + ", broadcasterId=" + broadcasterId + "]";
	}

	
	
}
