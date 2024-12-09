package be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.dbEntities;

import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.dbEntities.OrderLineEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ORDERS")
public class OrderEntity {
    @Id
    private UUID id;
    private String customerName;
    private double totalPrice;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Set<OrderLineEntity> orderLines;

}
