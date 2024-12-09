package be.ucll.craftsmanship.cleanarchitecture.domain.menu.valueobjects;

import java.util.Objects;
import java.util.UUID;

public record MenuItemId(UUID id) {
    public MenuItemId(UUID id) {
        this.id = Objects.requireNonNullElseGet(id, UUID::randomUUID);
    }
}