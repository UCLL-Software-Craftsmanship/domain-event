package be.ucll.craftsmanship.cleanarchitecture.controllers;

import be.ucll.craftsmanship.cleanarchitecture.domain.menu.Menu;
import be.ucll.craftsmanship.cleanarchitecture.domain.order.Order;

public interface OrderCommandService {
    void createOrder(Order order);
}
