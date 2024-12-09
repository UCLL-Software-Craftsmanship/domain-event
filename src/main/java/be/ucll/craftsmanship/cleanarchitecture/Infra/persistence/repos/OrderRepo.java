package be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.repos;

import be.ucll.craftsmanship.cleanarchitecture.Infra.persistence.dbEntities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepo extends JpaRepository<OrderEntity, UUID> {
}
