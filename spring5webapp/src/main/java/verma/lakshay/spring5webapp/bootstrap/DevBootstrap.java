package verma.lakshay.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import verma.lakshay.spring5webapp.model.Author;
import verma.lakshay.spring5webapp.model.Book;
import verma.lakshay.spring5webapp.model.Publisher;
import verma.lakshay.spring5webapp.repositories.AuthorRepository;
import verma.lakshay.spring5webapp.repositories.BookRepository;
import verma.lakshay.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>
{
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        Publisher pub=new Publisher();
        pub.setAddress("1415 Rue Saint Catherine");
        pub.setName("Concordia University");
        publisherRepository.save(pub);

        //Lakshay
        Author lak=new Author();
        lak.setName("Lakshay");
        Book ddd=new Book();
        ddd.setName("Autobiography");
        ddd.setPublisher(pub);

        lak.getBooks().add(ddd);
        ddd.getAuthors().add(lak);

        authorRepository.save(lak);
        bookRepository.save(ddd);

    }
}
