package com.noeolvera.libraryexample.repository;

import com.noeolvera.libraryexample.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Procedure(name = "GetAllAuthors")
    Iterable<Author> GetAllAuthors();

    @Procedure(name = "GetAuthorsBySearch")
    Iterable<Author> GetAuthorsBySearch(String search);

}
