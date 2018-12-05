package jobless.service.platform;

import java.util.Map;

public class PlatformRequest {
	private int platformId;
	private String platform;
	
	public PlatformRequest(int platformId, String platform) {
		super();
		this.platformId = platformId;
		this.platform = platform;
	}
	
	public int getPlatformId() {
		return platformId;
	}
	
	public String getPlatform() {
		return platform;
	}
	
	public void validate(Map<String, Boolean> errors) {
		if(platform == null || platform.trim().isEmpty()) {
			errors.put("platform", true);
		}
	}
	
}
