package jobless.service.clip;

import java.time.LocalDateTime;
import java.util.Map;

public class ClipRequest {
	private int clipId;
	private String title;
	private String clipURL;
	private LocalDateTime writeDate;
	private int views;
	private int writerId;
	private int broadcasterId;
	
	
	public ClipRequest(int clipId, String title, String clipURL, LocalDateTime writeDate, int views, int writerId, int broadcasterId) {
		this.clipId = clipId;
		this.title = title;
		this.clipURL = clipURL;
		this.writeDate = writeDate;
		this.views = views;
		this.writerId = writerId;
		this.broadcasterId = broadcasterId;
	}
	
	public ClipRequest(String title, String clipURL, int writerId, int broadcasterId) {
		this.title = title;
		this.clipURL = clipURL;
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
