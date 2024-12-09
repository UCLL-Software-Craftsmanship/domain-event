package be.ucll.craftsmanship.cleanarchitecture.domain.menu;

import be.ucll.craftsmanship.cleanarchitecture.domain.menu.valueobjects.MenuId;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import be.ucll.craftsmanship.cleanarchitecture.domain.menu.entities.MenuItem;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@EqualsAndHashCode
@Getter
public class Menu {
    private final MenuId id;
    private LocalDate endDate;
    private Set<MenuItem> menuItems;

    private Menu(UUID id, LocalDate endDate, Set<MenuItem> menuItems) {
        this.id = new MenuId(id);
        this.endDate = endDate;
        this.menuItems = menuItems;
    }

    public static Menu of(UUID id, LocalDate startDate, Set<MenuItem> menuItems) {
        // add domain validations here
        return new Menu(id, startDate, menuItems);
    }

}
