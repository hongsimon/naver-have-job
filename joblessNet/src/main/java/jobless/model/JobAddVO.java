package jobless.model;

import org.apache.ibatis.type.Alias;

@Alias("JobAdd")
public class JobAddVO {

	private int addId;
	private String addTitle;
	private String addLink;
	
	
	public JobAddVO(int addId, String addTitle, String addLink) {
		super();
		this.addId = addId;
		this.addTitle = addTitle;
		this.addLink = addLink;
	}


	public int getAddId() {
		return addId;
	}


	public void setAddId(int addId) {
		this.addId = addId;
	}


	public String getAddTitle() {
		return addTitle;
	}


	public void setAddTitle(String addTitle) {
		this.addTitle = addTitle;
	}


	public String getAddLink() {
		return addLink;
	}


	public void setAddLink(String addLink) {
		this.addLink = addLink;
	}


	@Override
	public String toString() {
		return "JobAddVO [addId=" + addId + ", addTitle=" + addTitle + ", addLink=" + addLink + "]";
	}
	
	
	
}
