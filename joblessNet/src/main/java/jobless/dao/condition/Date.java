package jobless.dao.condition;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

@Alias("Date")
public class Date {
	private LocalDateTime startDate;
	private LocalDateTime endDate;

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
}
