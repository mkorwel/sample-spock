package pl.mkorwel.spock.invoice.service;

import pl.mkorwel.spock.invoice.domain.Invoice;
import pl.mkorwel.spock.invoice.domain.Order;

public class InvoiceService {
	private DeliveryPolicy deliveryPolicy;

	public InvoiceService(DeliveryPolicy deliveryPolicy){
		this.deliveryPolicy = deliveryPolicy;
	}

	public Invoice issueInvoice(Order order){
		return new Invoice(order, deliveryPolicy.getCost(order));
	}
}
