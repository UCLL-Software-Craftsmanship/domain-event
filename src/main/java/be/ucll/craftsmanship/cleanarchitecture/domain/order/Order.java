package be.ucll.craftsmanship.cleanarchitecture.domain.order;

import be.ucll.craftsmanship.cleanarchitecture.domain.order.entities.OrderLine;
import be.ucll.craftsmanship.cleanarchitecture.domain.order.valueobjects.OrderId;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Set;
import java.util.UUID;

@EqualsAndHashCode
@Getter
public class Order {
    private OrderId id;
    private String customerName;
    private Set<OrderLine> orderlines;

    private Order(UUID id, String customerName, Set<OrderLine> orderlines) {
        this.id = new OrderId(id);
        this.customerName = customerName;
        this.orderlines = orderlines;
    }

    public double getTotalPrice(){
    return orderlines.stream()
            .reduce(0.0, (partialRes, line) -> partialRes + line.getTotalPrice(), Double::sum);
    }

    public static Order of(UUID id, String name, Set<OrderLine> orderlines){
        // validations
        return new Order(id, name, orderlines);
    }
}
