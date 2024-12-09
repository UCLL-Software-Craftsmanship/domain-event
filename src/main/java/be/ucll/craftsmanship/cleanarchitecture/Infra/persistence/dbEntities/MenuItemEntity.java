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
@Table(name="MENU_ITEM")
public class MenuItemEntity {
    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private MenuEntity menu;

    private String name;
    private String description;
    private double price;
}
