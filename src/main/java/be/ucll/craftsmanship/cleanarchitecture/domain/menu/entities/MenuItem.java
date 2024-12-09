package be.ucll.craftsmanship.cleanarchitecture.domain.menu.entities;

import be.ucll.craftsmanship.cleanarchitecture.domain.menu.valueobjects.MenuItemId;
import lombok.Getter;

import java.util.UUID;

@Getter
public class MenuItem {
    private MenuItemId id;
    private String itemName;
    private String description;
    private double price;

    public MenuItem(UUID id, String itemName, String description, double price) {
        this.id = new MenuItemId(id);
        this.itemName = itemName;
        this.description = description;
        this.price = price;
    }
}
