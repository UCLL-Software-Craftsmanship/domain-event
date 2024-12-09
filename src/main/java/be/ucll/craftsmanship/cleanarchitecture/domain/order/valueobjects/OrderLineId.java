package be.ucll.craftsmanship.cleanarchitecture.domain.order.valueobjects;

import java.util.Objects;
import java.util.UUID;

public record OrderLineId(UUID id) {
    public OrderLineId (UUID id) {
        this.id = Objects.requireNonNullElseGet(id, UUID::randomUUID);
    }
}
