package be.ucll.craftsmanship.cleanarchitecture.controllers.response;

import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor
public class MenuResponse {
    public List<MenuItemResponse> menuItems;
}
