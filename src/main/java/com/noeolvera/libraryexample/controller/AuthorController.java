package com.noeolvera.libraryexample.controller;

import com.noeolvera.libraryexample.entity.Author;
import com.noeolvera.libraryexample.entity.AuthorWithBooks;
import com.noeolvera.libraryexample.service.AuthorService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping(path="/all")
    @Transactional()
    public @ResponseBody Iterable<Author> getAll() {
        return authorService.GetAllAuthors();
    }

    @GetMapping(path="/search")
    @Transactional()
    public @ResponseBody Iterable<Author> getBySearch(@RequestParam(name="search", required = false) String search) {
        if (search != null) {
            return authorService.GetAuthorsBySearch(search);
        }
        return authorService.GetAllAuthors();
    }

    @GetMapping(path="/books")
    @Transactional()
    public @ResponseBody Iterable<AuthorWithBooks> getBySearch(
            @RequestParam(name="nombre") String authorFirstName,
            @RequestParam(name="apellido") String authorLastName
    ) {
        return authorService.GetAuthorWithBooks(authorFirstName, authorLastName);
    }
}
