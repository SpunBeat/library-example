package com.noeolvera.libraryexample.repository;

import com.noeolvera.libraryexample.entity.AuthorWithBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface AuthorWithBooksRepository extends JpaRepository<AuthorWithBooks, Integer> {

    @Procedure(name = "GetAuthorWithBooks")
    Iterable<AuthorWithBooks> GetAuthorWithBooks(String authorFirstName, String authorLastName);
}
