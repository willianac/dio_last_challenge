package me.willl.booksrepo.services.impl;

import me.willl.booksrepo.domain.model.Book;
import me.willl.booksrepo.domain.repository.BookRepository;
import me.willl.booksrepo.services.BookService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public Iterable<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return bookRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
    }

    @Override
    public Book create(Book bookToCreate) {
        return bookRepository.save(bookToCreate);
    }

    @Override
    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }
}
