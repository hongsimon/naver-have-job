package jobless.dao.condition;

import org.apache.ibatis.type.Alias;

@Alias("Conditions")
public class Conditions {
	private Id id;
	private Date date;
	private Limit limit;
	private Order order;

	public Conditions(Id id, Date date, Limit limit, Order order) {
		this.id = id;
		this.date = date;
		this.limit = limit;
		this.order = order;
	}

	public Id getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}
	
	public Limit getLimit() {
		return limit;
	}

	public Order getOrder() {
		return order;
	}
}
