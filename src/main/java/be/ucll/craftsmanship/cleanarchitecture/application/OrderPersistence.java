package be.ucll.craftsmanship.cleanarchitecture.application;

import be.ucll.craftsmanship.cleanarchitecture.domain.order.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderPersistence {
    void save(Order order);
}
