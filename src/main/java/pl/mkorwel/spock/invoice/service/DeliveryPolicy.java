package pl.mkorwel.spock.invoice.service;

import pl.mkorwel.spock.invoice.domain.Order;

public class DeliveryPolicy {
	public double getCost(Order order) {
		if(order.getOrderProce() > 100){
			return 0.;
		}

		return 10.;
	}
}
