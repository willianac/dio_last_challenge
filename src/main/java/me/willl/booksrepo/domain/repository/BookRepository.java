package me.willl.booksrepo.domain.repository;

import me.willl.booksrepo.domain.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}
