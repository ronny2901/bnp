package ms.bnp.persistence.repository;

import ms.bnp.persistence.entity.ManualMovementEntity;
import ms.bnp.persistence.entity.MovementId;
import org.springframework.data.repository.CrudRepository;

public interface MovementRepository extends CrudRepository<ManualMovementEntity, MovementId> {
}
