package be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.repos;

import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.dbEntities.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public interface MenuRepo extends JpaRepository<MenuEntity, UUID> {
    Collection<MenuEntity> findByEndDateIsNull();
}
