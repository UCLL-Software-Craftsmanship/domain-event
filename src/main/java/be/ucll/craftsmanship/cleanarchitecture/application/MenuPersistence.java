package be.ucll.craftsmanship.cleanarchitecture.application;

import be.ucll.craftsmanship.cleanarchitecture.domain.menu.Menu;
import org.springframework.stereotype.Service;

@Service
public interface MenuPersistence {
    Menu getCurrentMenu();
}
