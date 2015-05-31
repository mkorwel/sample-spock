package pl.mkorwel.spock.mock

import pl.mkorwel.spock.invoice.domain.Order
import pl.mkorwel.spock.invoice.domain.OrderProduct
import pl.mkorwel.spock.invoice.service.DeliveryPolicy
import pl.mkorwel.spock.invoice.service.InvoiceService
import spock.lang.Specification

class MockTest extends Specification {
    InvoiceService invoiceService
    DeliveryPolicy deliveryPolicy

    def setup() {
        deliveryPolicy = Mock(DeliveryPolicy)
        invoiceService = new InvoiceService(deliveryPolicy)
        deliveryPolicy.getCost(_) >> 0
    }

    def "should return free delivery price"() {
        given:
        def order = new Order(Arrays.asList(new OrderProduct("Orange", 1.0, 1)));

        when:
        def invoice = invoiceService.issueInvoice(order)

        then:
        invoice.getDeliveryPrice() == 0.0
        1 * deliveryPolicy.getCost(_)
    }
}
