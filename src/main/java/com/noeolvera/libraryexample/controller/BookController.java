package com.noeolvera.libraryexample.controller;

import com.noeolvera.libraryexample.entity.Book;
import com.noeolvera.libraryexample.service.BookService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path="/all")
    @Transactional()
    public @ResponseBody Iterable<Book> getAll() {
        return bookService.GetAllBooks();
    }

    @GetMapping(path="/byAuthorSearch")
    @Transactional()
    public @ResponseBody Iterable<Book> getBySearch(@RequestParam(name="search", required = false) String search) {
        if (search != null) {
            return bookService.GetBooksByAuthorSearch(search);
        }
        return bookService.GetAllBooks();
    }
}
