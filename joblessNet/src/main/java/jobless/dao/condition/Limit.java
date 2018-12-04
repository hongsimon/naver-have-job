package jobless.dao.condition;

import org.apache.ibatis.type.Alias;

@Alias("Limit")
public class Limit {
	private int startIndex;
	private int offset;

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
}
