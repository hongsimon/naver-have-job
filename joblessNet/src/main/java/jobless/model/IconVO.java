package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("Icon")
public class IconVO {
	private int iconId;
	private String fileName;

	public IconVO() {
	}

	public IconVO(int iconId, String fileName) {
		this.iconId = iconId;
		this.fileName = fileName;
	}

	public int getIconId() {
		return iconId;
	}

	public void setIconId(int iconId) {
		this.iconId = iconId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
