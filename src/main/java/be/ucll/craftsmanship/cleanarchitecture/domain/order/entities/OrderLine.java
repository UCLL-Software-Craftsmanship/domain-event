package be.ucll.craftsmanship.cleanarchitecture.domain.order.entities;

import java.util.UUID;

import be.ucll.craftsmanship.cleanarchitecture.domain.order.valueobjects.OrderLineId;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class OrderLine{
    private final OrderLineId orderLineId;
    private final int quantity;
    private final String name;
    private final double unitPrice;
    private final double totalPrice;

    public OrderLine(UUID orderLineId, int quantity, String name, double unitPrice){
        this.orderLineId = new OrderLineId(orderLineId);
        this.quantity = quantity;
        this.name = name;
        this.unitPrice = unitPrice;
        this.totalPrice = unitPrice * quantity;
    }
}
