package jobless.dao.condition;

public class Condition {
	private Id id;
	private Period period;
	private Limit limit;
	private Order order;
	private Text text;

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Limit getLimit() {
		return limit;
	}

	public void setLimit(Limit limit) {
		this.limit = limit;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

}
