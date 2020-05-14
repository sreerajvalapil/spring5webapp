package guru.springframework.spring5webapp.repository.recipe;


import guru.springframework.spring5webapp.domain.recipe.Notes;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository  extends CrudRepository<Notes,Long> {
}
