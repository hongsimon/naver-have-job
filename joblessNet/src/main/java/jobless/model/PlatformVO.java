package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("Platform")
public class PlatformVO {
	private int platformId;
	private String platform;

	public PlatformVO() {
	}

	public PlatformVO(int platformId, String platform) {
		this.platformId = platformId;
		this.platform = platform;
	}

	public int getPlatformId() {
		return platformId;
	}

	public void setPlatformId(int platformId) {
		this.platformId = platformId;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}
