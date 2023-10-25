package com.noeolvera.libraryexample.service;


import com.noeolvera.libraryexample.entity.Author;
import com.noeolvera.libraryexample.entity.Book;
import com.noeolvera.libraryexample.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> GetAllBooks() {
        return bookRepository.GetAllBooks();
    }

    public Iterable<Book> GetBooksByAuthorSearch(String search) {
        return bookRepository.GetBooksByAuthorSearch(search);
    }
}
