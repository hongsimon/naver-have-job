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
	
	public ClipRequest(String title, String clipURL, String thumbURL) {
		this.title = title;
		this.clipURL = clipURL;
		this.thumbURL = thumbURL;
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
	
	
	//입력받은 데이터가 빈값인지 확인하는 메소드
	private void checkEmptyStr(Map<String, Boolean> errors, String value, String fiedName) {
		if(value == null || value.isEmpty()) {
			//빈값이거나 문제가 있다면 그 결과를 다시 전송하기 위해
			//객체에 담아서 결과를 화면에 보내줌
			errors.put(fiedName, true);
		}
	}
	
	public void validate(Map<String, Boolean> errors) {
		checkEmptyStr(errors, title, "title");
		checkEmptyStr(errors, clipURL, "clipURL");
		checkEmptyStr(errors, thumbURL, "thumbURL");
	}
	
	
}
