package verma.lakshay.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import verma.lakshay.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book,Long > {
}
