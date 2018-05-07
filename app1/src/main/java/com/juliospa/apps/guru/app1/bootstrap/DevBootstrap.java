package com.juliospa.apps.guru.app1.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.juliospa.apps.guru.app1.model.Author;
import com.juliospa.apps.guru.app1.model.Book;
import com.juliospa.apps.guru.app1.model.Publisher;
import com.juliospa.apps.guru.app1.repositories.AuthorRepository;
import com.juliospa.apps.guru.app1.repositories.BookRepository;
import com.juliospa.apps.guru.app1.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	private AuthorRepository autorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	
	
	public DevBootstrap(AuthorRepository autorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
		super();
		this.autorRepository = autorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
		
	}

	private void initData() {
		Author eric = new Author("Eric", "Evans");
		Publisher publ21 = new Publisher("Harper Collins");
		Book ddd = new Book("Domain Driven Desing","1234",publ21);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);

		publisherRepository.save(publ21);
		autorRepository.save(eric);
		bookRepository.save(ddd);
		
		Author rod = new Author("Rod", "Johnson");
		Publisher publ1 = new Publisher("Worx");
		Book noEJB = new Book("J2EE Development without EJB","23444",publ1);
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		
		publisherRepository.save(publ1);
		autorRepository.save(rod);
		bookRepository.save(noEJB);
	}
}
