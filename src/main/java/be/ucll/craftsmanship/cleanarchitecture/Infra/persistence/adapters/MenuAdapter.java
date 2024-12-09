package be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.adapters;

import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.DbAdapter;
import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.dbEntities.MenuEntity;
import be.ucll.craftsmanship.cleanarchitecture.domain.menu.Menu;
import be.ucll.craftsmanship.cleanarchitecture.domain.menu.entities.MenuItem;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class MenuAdapter implements DbAdapter<MenuEntity, Menu> {

    @Override
    public MenuEntity mapToDb(Menu menu) {
        return null;
    }

    @Override
    public Menu mapFromDb(MenuEntity menuEntity) {
        var itemSet = new HashSet<MenuItem>();

        menuEntity.getMenuItems().forEach(item -> {
            MenuItem menuItem = new MenuItem(item.getId(), item.getName(), item.getDescription(), item.getPrice());
            itemSet.add(menuItem);
        });
        return Menu.of(
                menuEntity.getId(),
                null,
                itemSet);
    }
}
