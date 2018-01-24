package verma.lakshay.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import verma.lakshay.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
