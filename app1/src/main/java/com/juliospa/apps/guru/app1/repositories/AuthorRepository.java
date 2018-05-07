package com.juliospa.apps.guru.app1.repositories;

import org.springframework.data.repository.CrudRepository;

import com.juliospa.apps.guru.app1.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
