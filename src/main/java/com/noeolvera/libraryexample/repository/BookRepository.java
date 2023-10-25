package com.noeolvera.libraryexample.repository;

import com.noeolvera.libraryexample.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface BookRepository extends JpaRepository<Book, Integer> {

    @Procedure(name = "GetAllBooks")
    Iterable<Book> GetAllBooks();

    @Procedure(name = "GetBooksByAuthorSearch")
    Iterable<Book> GetBooksByAuthorSearch(String search);
}
