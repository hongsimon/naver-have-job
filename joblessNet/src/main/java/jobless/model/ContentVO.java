package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("Content")
public class ContentVO {
	private int contentId;
	private String content;

	public ContentVO() {
	}
	
	public ContentVO(String content) {
		super();
		this.content = content;
	}

	public ContentVO(int contentId, String content) {
		super();
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

	@Override
	public String toString() {
		return "ContentVO [contentId=" + contentId + ", content=" + content + "]";
	}

}
