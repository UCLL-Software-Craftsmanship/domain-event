package be.ucll.craftsmanship.cleanarchitecture.application.services;

import be.ucll.craftsmanship.cleanarchitecture.application.OrderPersistence;
import be.ucll.craftsmanship.cleanarchitecture.controllers.OrderCommandService;
import be.ucll.craftsmanship.cleanarchitecture.domain.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderCommandServiceImpl implements OrderCommandService {
    private final OrderPersistence orderPersistence;

    public OrderCommandServiceImpl(OrderPersistence orderPersistence) {
        this.orderPersistence = orderPersistence;
    }

    @Override
    public void createOrder(Order order) {
        orderPersistence.save(order);
    }
}
