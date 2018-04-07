package verma.lakshay.recepiproject.repository;

import org.springframework.data.repository.CrudRepository;
import verma.lakshay.recepiproject.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
