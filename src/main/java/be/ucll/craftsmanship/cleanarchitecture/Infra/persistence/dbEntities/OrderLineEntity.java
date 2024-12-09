package be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.dbEntities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ORDER_ITEMS")
public class OrderLineEntity {
    @Id
    private UUID id;
    private int quantity;
    private String name;
    private double unitPrice;
}
