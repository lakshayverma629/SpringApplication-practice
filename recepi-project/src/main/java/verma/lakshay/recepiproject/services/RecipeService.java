package verma.lakshay.recepiproject.services;

import verma.lakshay.recepiproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
