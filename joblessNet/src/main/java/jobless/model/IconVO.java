package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("Icon")
public class IconVO {
	private int iconId;
	private String fileName;
	private String iconName;
	
	public IconVO() {
	}
	
	//insert용
	public IconVO(String fileName, String iconName) {
		this.fileName = fileName;
		this.iconName = iconName;
	}
	
	//update, select용
	public IconVO(int iconId, String fileName, String iconName) {
		this.iconId = iconId;
		this.fileName = fileName;
		this.iconName = iconName;
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
	
	
	
	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

	@Override
	public String toString() {
		return "IconVO [iconId=" + iconId + ", fileName=" + fileName + ", iconName=" + iconName + "]";
	}

	
	
}
