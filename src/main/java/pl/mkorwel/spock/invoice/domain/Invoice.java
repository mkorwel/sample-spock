package pl.mkorwel.spock.invoice.domain;

import com.sun.istack.internal.NotNull;

public class Invoice {
	private Order order;
	private double deliveryPrice;

	public Invoice(@NotNull Order order, double deliveryPrice) {
		this.order = order;
		this.deliveryPrice = deliveryPrice;
	}

	public Order getOrder() {
		return order;
	}

	public double getDeliveryPrice() {
		return deliveryPrice;
	}

}