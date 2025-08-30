package application;

import java.util.Date;

import model.entities.Order;
import model.enums.OrderLevel;

public class ExericicioEnum {

	public static void main(String[] args) {
		Order order = new Order(1000,new Date(),OrderLevel.PENDING_PAYMENT);
		System.out.println(order);
		OrderLevel os1 = OrderLevel.DELIVERED;
		OrderLevel os2 = OrderLevel.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
	}

}
