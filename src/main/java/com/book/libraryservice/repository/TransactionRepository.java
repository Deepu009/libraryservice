package com.book.libraryservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.book.libraryservice.model.BookTransactions;

/**
 * Transaction Repository interface that extends JpaRepository.
 */
@Repository
public interface TransactionRepository extends JpaRepository<BookTransactions, Long> {

	@Query("SELECT bt FROM BookTransactions bt where bt.bookId = :bookId AND YEAR(bt.issuedOn) = :issuedOnYear")
	List<BookTransactions> retrieveBookTransactionsforYear(String bookId, int issuedOnYear);

}
