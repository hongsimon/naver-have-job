package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("Content")
public class ContentVO {
	private int contentId;
	private String content;

	public ContentVO() {
	}

	public ContentVO(int contentId, String content) {
		this.contentId = contentId;
		this.content = content;
	}

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
