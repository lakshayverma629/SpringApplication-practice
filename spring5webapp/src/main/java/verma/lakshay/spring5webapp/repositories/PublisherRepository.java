package verma.lakshay.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import verma.lakshay.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
