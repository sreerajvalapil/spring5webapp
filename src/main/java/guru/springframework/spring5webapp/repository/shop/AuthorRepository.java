package guru.springframework.spring5webapp.repository.shop;

import guru.springframework.spring5webapp.domain.shop.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
