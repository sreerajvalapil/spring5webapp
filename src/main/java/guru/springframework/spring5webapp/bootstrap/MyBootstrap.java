package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import guru.springframework.spring5webapp.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyBootstrap implements CommandLineRunner {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    @Autowired
    private PublisherRepository publisherRepository;

    public MyBootstrap(BookRepository bookRepository,
                       AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("I am running .......");

        Book book = new Book("book1","b1") ;
        Author author = new Author("guru1");
        Author author2 = new Author("guru2");
        Publisher pub = new Publisher("sree","addr");
        publisherRepository.save(pub) ;

        book.getAuthors().add(author); book.getAuthors().add(author2) ;
        author.getBooks().add(book);
        book.setPublisher(pub);
        pub.getBooks().add(book);

        authorRepository.save(author) ;
        bookRepository.save(book) ;
        publisherRepository.save(pub) ;

        System.out.println("The number of  publisher ..." + publisherRepository.count());
        System.out.println("The number of  book ..." + bookRepository.count());
        System.out.println("The number of  author ..." + authorRepository.count());

    }
}
