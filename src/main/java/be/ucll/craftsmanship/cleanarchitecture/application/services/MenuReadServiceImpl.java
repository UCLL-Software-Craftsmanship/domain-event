package be.ucll.craftsmanship.cleanarchitecture.application.services;

import be.ucll.craftsmanship.cleanarchitecture.application.MenuPersistence;
import be.ucll.craftsmanship.cleanarchitecture.controllers.MenuReadService;
import be.ucll.craftsmanship.cleanarchitecture.domain.menu.Menu;
import org.springframework.stereotype.Service;

@Service
public class MenuReadServiceImpl implements MenuReadService {

    private final MenuPersistence menuPersistence;

    public MenuReadServiceImpl(MenuPersistence menuPersistence) {
        this.menuPersistence = menuPersistence;
    }

    @Override
    public Menu getMenu() {
        return menuPersistence.getCurrentMenu();
    }
}
