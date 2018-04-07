package verma.lakshay.recepiproject.repository;

import org.springframework.data.repository.CrudRepository;
import verma.lakshay.recepiproject.domain.Recipe;

public interface RecipeRepoistory extends CrudRepository<Recipe,Long> {
}
