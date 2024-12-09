package be.ucll.craftsmanship.cleanarchitecture.Infra.persistence;

import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.dbEntities.MenuEntity;
import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.repos.MenuRepo;
import be.ucll.craftsmanship.cleanarchitecture.application.MenuPersistence;
import be.ucll.craftsmanship.cleanarchitecture.domain.menu.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuGateway implements MenuPersistence {
    private final DbAdapter<MenuEntity, Menu> dbAdapter;
    private final MenuRepo menuRepo;

    @Autowired
    public MenuGateway(MenuRepo menuRepo, DbAdapter<MenuEntity, Menu> dbAdapter) {
        this.menuRepo = menuRepo;
        this.dbAdapter = dbAdapter;
    }

    @Override
    public Menu getCurrentMenu() {
        var menuEntityList = menuRepo.findByEndDateIsNull().stream().toList();
        if (menuEntityList.isEmpty()) {
            return null;
        }
        var menuEntity = menuEntityList.getFirst();
        return dbAdapter.mapFromDb(menuEntity);
        }
}

