package pl.mkorwel.spock.invoice.domain;

import java.util.Collection;
import java.util.Collections;

public class Order {
	private Collection<OrderProduct> products;

	public Order(Collection<OrderProduct> products) {
		this.products = products;
	}

	public double getOrderProce() {
		return products.stream()
				.map(OrderProduct::getPrice)
				.reduce(0., (sum, price) -> sum + price)
				.doubleValue();
	}

	public Collection<OrderProduct> getProducts() {
		return Collections.unmodifiableCollection(products);
	}
}
