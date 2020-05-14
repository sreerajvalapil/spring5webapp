package guru.springframework.spring5webapp.repository.recipe;

import guru.springframework.spring5webapp.domain.recipe.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient,Long> {
}
