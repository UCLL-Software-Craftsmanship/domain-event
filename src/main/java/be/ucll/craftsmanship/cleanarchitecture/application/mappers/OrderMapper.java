package be.ucll.craftsmanship.cleanarchitecture.application.mappers;

import be.ucll.craftsmanship.cleanarchitecture.controllers.Mapper;
import be.ucll.craftsmanship.cleanarchitecture.controllers.request.OrderRequest;
import be.ucll.craftsmanship.cleanarchitecture.domain.order.Order;
import be.ucll.craftsmanship.cleanarchitecture.domain.order.entities.OrderLine;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;

@Service
public class OrderMapper implements Mapper<OrderRequest, Order> {
    @Override
    public Order map(OrderRequest orderRequest) {
        var orderLineHashSet = new HashSet<OrderLine>();
        orderRequest.getOrderlines().forEach(orderRequestLine -> {
            var orderItem = new OrderLine(null,
                    orderRequestLine.quantity(),
                    orderRequestLine.name(),
                    orderRequestLine.price());
            orderLineHashSet.add(orderItem);
        });
        return Order.of(null, orderRequest.getCustomerName(), orderLineHashSet);
    }
}
