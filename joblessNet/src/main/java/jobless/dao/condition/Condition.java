package jobless.dao.condition;

import org.apache.ibatis.type.Alias;

@Alias("Condition")
public class Condition {
	private Id id;
	private Period period;
	private Limit limit;
	private Order order;

	public Condition(Id id, Period period, Limit limit, Order order) {
		this.id = id;
		this.period = period;
		this.limit = limit;
		this.order = order;
	}

	public Id getId() {
		return id;
	}

	public Period getDate() {
		return period;
	}
	
	public Limit getLimit() {
		return limit;
	}

	public Order getOrder() {
		return order;
	}
}
