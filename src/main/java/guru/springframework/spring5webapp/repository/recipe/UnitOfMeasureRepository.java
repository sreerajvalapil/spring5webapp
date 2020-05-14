package guru.springframework.spring5webapp.repository.recipe;


import guru.springframework.spring5webapp.domain.recipe.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
    Optional<UnitOfMeasure> findByUnitOfMeasure(String unitOfMeasure);

}
