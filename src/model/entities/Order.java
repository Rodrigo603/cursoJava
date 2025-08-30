package model.entities;

import java.util.Date;

import model.enums.OrderLevel;

public class Order {
	
	private Integer id;
	private Date moment;
	private OrderLevel status;
	
	public  Order() {
	}


	public Order(Integer id, Date moment, OrderLevel status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
}


	public Integer getId() {
		return id;
}

	public void setId(Integer id) {
		this.id = id;
}

	public Date getMoment() {
		return moment;
}

	public void setMoment(Date moment) {
		this.moment = moment;
}

	public OrderLevel getStatus() {
		return status;
}

	public void setStatus(OrderLevel status) {
		this.status = status;
 }

	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
}
