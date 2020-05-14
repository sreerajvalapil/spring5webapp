package guru.springframework.spring5webapp.repository.shop;

import guru.springframework.spring5webapp.domain.shop.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
