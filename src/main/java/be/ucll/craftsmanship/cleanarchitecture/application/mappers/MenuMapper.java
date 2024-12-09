package be.ucll.craftsmanship.cleanarchitecture.application.mappers;

import be.ucll.craftsmanship.cleanarchitecture.controllers.Mapper;
import be.ucll.craftsmanship.cleanarchitecture.controllers.response.MenuItemResponse;
import be.ucll.craftsmanship.cleanarchitecture.controllers.response.MenuResponse;
import be.ucll.craftsmanship.cleanarchitecture.domain.menu.Menu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MenuMapper implements Mapper<Menu, MenuResponse> {

    @Override
    public MenuResponse map(Menu menu) {
        var list = new ArrayList<MenuItemResponse>();
        menu.getMenuItems().forEach(menuItem -> {
          var item = new MenuItemResponse(menuItem.getId().id().toString(),menuItem.getItemName(), menuItem.getPrice());
          list.add(item);
        });
        return new MenuResponse(list);
    }
}
