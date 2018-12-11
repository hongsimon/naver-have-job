package jobless.service.clip;

import java.time.LocalDateTime;
import java.util.Map;

public class ClipRequest {
	private int clipId;
	private String title;
	private String clipURL;
	private String thumbURL;
	private LocalDateTime writeDate;
	private int views;
	private int writerId;
	private int broadcasterId;
	
	
	public ClipRequest(int clipId, String title, String clipURL, String thumbURL, LocalDateTime writeDate, int views, int writerId, int broadcasterId) {
		this.clipId = clipId;
		this.title = title;
		this.clipURL = clipURL;
		this.thumbURL = thumbURL;
		this.writeDate = writeDate;
		this.views = views;
		this.writerId = writerId;
		this.broadcasterId = broadcasterId;
	}
	
	public ClipRequest(String title, String clipURL, String thumbURL, int writerId, int broadcasterId) {
		this.title = title;
		this.clipURL = clipURL;
		this.thumbURL = thumbURL;
		this.writerId = writerId;
		this.broadcasterId = broadcasterId;
	}
	
	public int getClipId() {
		return clipId;
	}
	public String getTitle() {
		return title;
	}
	public String getClipURL() {
		return clipURL;
	}
	
	public String getThumbURL() {
		return thumbURL;
	}

	public LocalDateTime getWriteDate() {
		return writeDate;
	}
	public int getViews() {
		return views;
	}
	public int getWriterId() {
		return writerId;
	}
	public int getBroadcasterId() {
		return broadcasterId;
	}
	
	public void validate(Map<String, Boolean> errors) {
		if(title == null || title.trim().isEmpty()) {
			errors.put("title", true);
		}
	}
	
	
}
