package verma.lakshay.recepiproject.repository;

import org.springframework.data.repository.CrudRepository;
import verma.lakshay.recepiproject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
