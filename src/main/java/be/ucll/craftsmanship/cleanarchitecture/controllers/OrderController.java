package be.ucll.craftsmanship.cleanarchitecture.controllers;


import be.ucll.craftsmanship.cleanarchitecture.controllers.request.OrderRequest;
import be.ucll.craftsmanship.cleanarchitecture.controllers.response.MenuResponse;
import be.ucll.craftsmanship.cleanarchitecture.domain.menu.Menu;
import be.ucll.craftsmanship.cleanarchitecture.domain.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final MenuReadService menuReadService;
    private final OrderCommandService orderCommandService;
    private final Mapper<Menu, MenuResponse> menuResponseMapper;
    private final Mapper<OrderRequest, Order> orderRequestMapper;

    @Autowired
    public OrderController(MenuReadService menuReadService,
                           Mapper<Menu, MenuResponse> menuResponseMapper,
                           OrderCommandService orderCommandService,
                           Mapper<OrderRequest, Order> orderRequestMapper) {
        this.menuReadService = menuReadService;
        this.menuResponseMapper = menuResponseMapper;
        this.orderCommandService = orderCommandService;
        this.orderRequestMapper = orderRequestMapper;
    }

    @GetMapping("/menu")
    public MenuResponse GetMenu(){
        return menuResponseMapper.map(menuReadService.getMenu());
    }

    @PostMapping("/order")
    public void MakeOrder(@RequestBody OrderRequest orderRequest){
        orderCommandService.createOrder(orderRequestMapper.map(orderRequest));
    }
}
