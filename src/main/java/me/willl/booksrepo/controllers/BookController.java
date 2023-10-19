package me.willl.booksrepo.controllers;

import me.willl.booksrepo.domain.model.Book;
import me.willl.booksrepo.services.BookService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("books")
@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public Iterable<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.findById(id);
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookService.create(book);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        bookService.delete(id);
        return "Deletado com sucesso";
    }
}
