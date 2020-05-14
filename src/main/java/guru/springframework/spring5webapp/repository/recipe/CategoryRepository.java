package guru.springframework.spring5webapp.repository.recipe;


import guru.springframework.spring5webapp.domain.recipe.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface CategoryRepository extends JpaRepository<Category,Long> {

    Optional<Category> findByName(String name);
}
