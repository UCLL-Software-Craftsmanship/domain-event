package be.ucll.craftsmanship.cleanarchitecture.Infra.persistence;

import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.dbEntities.OrderEntity;
import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.repos.OrderRepo;
import be.ucll.craftsmanship.cleanarchitecture.application.OrderPersistence;
import be.ucll.craftsmanship.cleanarchitecture.domain.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderGateway implements OrderPersistence {

    private final DbAdapter<OrderEntity, Order> dbAdapter;
    private final OrderRepo orderRepo;

    public OrderGateway(DbAdapter<OrderEntity, Order> dbAdapter, OrderRepo orderRepo) {
        this.dbAdapter = dbAdapter;
        this.orderRepo = orderRepo;
    }

    @Override
    public void save(Order order) {
        var orderEntity = dbAdapter.mapToDb(order);
        orderRepo.save(orderEntity);
    }
}
