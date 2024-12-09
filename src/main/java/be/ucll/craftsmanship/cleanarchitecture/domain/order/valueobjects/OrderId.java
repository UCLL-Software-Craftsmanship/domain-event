package be.ucll.craftsmanship.cleanarchitecture.domain.order.valueobjects;

import java.util.Objects;
import java.util.UUID;

public record OrderId (UUID id) {
    public OrderId(UUID id) {
        this.id = Objects.requireNonNullElseGet(id, UUID::randomUUID);
    }
}
