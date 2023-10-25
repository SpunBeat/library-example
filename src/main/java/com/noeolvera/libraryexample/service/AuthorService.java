package com.noeolvera.libraryexample.service;

import com.noeolvera.libraryexample.entity.Author;
import com.noeolvera.libraryexample.entity.AuthorWithBooks;
import com.noeolvera.libraryexample.repository.AuthorRepository;
import com.noeolvera.libraryexample.repository.AuthorWithBooksRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorWithBooksRepository authorWithBooksRepository;

    public AuthorService(
            AuthorRepository authorRepository,
            AuthorWithBooksRepository authorWithBooksRepository
    ) {
        this.authorRepository = authorRepository;
        this.authorWithBooksRepository = authorWithBooksRepository;
    }

    public Iterable<Author> GetAllAuthors() {
        return authorRepository.GetAllAuthors();
    }

    public Iterable<Author> GetAuthorsBySearch(String search) {
        return authorRepository.GetAuthorsBySearch(search);
    }

    public Iterable<AuthorWithBooks> GetAuthorWithBooks(String authorFirstName, String authorLastName) {
        return authorWithBooksRepository.GetAuthorWithBooks(authorFirstName, authorLastName);
    }

}
