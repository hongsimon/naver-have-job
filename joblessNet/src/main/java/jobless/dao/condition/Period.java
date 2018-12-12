package jobless.dao.condition;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

@Alias("Period")
public class Period {
	private LocalDateTime startDate;
	private LocalDateTime endDate;

	public Period(LocalDateTime startDate, LocalDateTime endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}
}
