package com.juliospa.apps.guru.app1.repositories;

import org.springframework.data.repository.CrudRepository;

import com.juliospa.apps.guru.app1.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
