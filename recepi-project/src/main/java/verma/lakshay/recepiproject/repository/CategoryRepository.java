package verma.lakshay.recepiproject.repository;

import org.springframework.data.repository.CrudRepository;
import verma.lakshay.recepiproject.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);

}
