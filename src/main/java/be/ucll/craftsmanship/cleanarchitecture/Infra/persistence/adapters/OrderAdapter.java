package be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.adapters;

import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.DbAdapter;
import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.dbEntities.OrderEntity;
import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.dbEntities.OrderLineEntity;
import be.ucll.craftsmanship.cleanarchitecture.domain.order.Order;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class OrderAdapter implements DbAdapter<OrderEntity, Order> {
    @Override
    public OrderEntity mapToDb(Order order) {
        var orderEntity = new OrderEntity();
        orderEntity.setId(order.getId().id());
        orderEntity.setCustomerName(order.getCustomerName());
        orderEntity.setTotalPrice(order.getTotalPrice());

        var itemset = new HashSet<OrderLineEntity>();
        order.getOrderlines().forEach(orderLine -> {
            itemset.add(new OrderLineEntity(
                    orderLine.getOrderLineId().id(),
                    orderLine.getQuantity(),
                    orderLine.getName(),
                    orderLine.getUnitPrice()));
        });
        orderEntity.setOrderLines(itemset);
        return orderEntity;
    }

    @Override
    public Order mapFromDb(OrderEntity orderEntity) {
        return null;
    }
}
