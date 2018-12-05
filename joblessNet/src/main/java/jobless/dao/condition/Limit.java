package jobless.dao.condition;

import org.apache.ibatis.type.Alias;

@Alias("Limit")
public class Limit {
	private int startIndex;
	private int offset;

	public Limit(int startIndex, int offset) {
		this.startIndex = startIndex;
		this.offset = offset;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public int getOffset() {
		return offset;
	}
}
