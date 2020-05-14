package guru.springframework.spring5webapp.repository.recipe;


import guru.springframework.spring5webapp.domain.recipe.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
