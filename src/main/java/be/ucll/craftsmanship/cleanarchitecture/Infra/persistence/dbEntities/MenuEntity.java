package be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.dbEntities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="MENU")
public class MenuEntity {
    @Id
    private UUID id;
    private LocalDate endDate;

    @OneToMany(mappedBy = "menu")
    private Set<MenuItemEntity> menuItems;

    public Set<MenuItemEntity> getMenuItems(){
        return Collections.unmodifiableSet(menuItems);
    }
}
