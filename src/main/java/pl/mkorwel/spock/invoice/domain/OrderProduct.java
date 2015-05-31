package pl.mkorwel.spock.invoice.domain;

public class OrderProduct {
	private String name;
	private double pricePerItem;
	private int quantity;

	public OrderProduct(String name, double pricePerItem, int quantity) {
		this.name = name;
		this.pricePerItem = pricePerItem;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice(){
		return quantity * pricePerItem;
	}
}
