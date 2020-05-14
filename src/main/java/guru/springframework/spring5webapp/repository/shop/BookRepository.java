package guru.springframework.spring5webapp.repository.shop;

import guru.springframework.spring5webapp.domain.shop.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
