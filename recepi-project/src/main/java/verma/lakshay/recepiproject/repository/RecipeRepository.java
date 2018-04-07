package verma.lakshay.recepiproject.repository;

import org.springframework.data.repository.CrudRepository;
import verma.lakshay.recepiproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
