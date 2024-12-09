package be.ucll.craftsmanship.cleanarchitecture.domain.menu.valueobjects;

import java.util.Objects;
import java.util.UUID;

public record MenuId (UUID id) {
    public MenuId(UUID id) {
        this.id = Objects.requireNonNullElseGet(id, UUID::randomUUID);
    }
}
