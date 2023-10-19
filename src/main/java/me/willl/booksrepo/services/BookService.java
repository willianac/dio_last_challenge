package me.willl.booksrepo.services;

import me.willl.booksrepo.domain.model.Book;


public interface BookService {
    Iterable<Book> getAll();
    Book findById(Integer id);

    Book create(Book bookToCreate);

    void delete(Integer id);

}
