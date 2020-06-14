package com.book.libraryservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.libraryservice.model.Book;

/**
 * Book Repository interface that extends JpaRepository.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findAllByBookId(String bookId);

	List<Book> findAllByBookType(String bookType);
}
