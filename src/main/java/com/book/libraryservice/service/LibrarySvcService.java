package com.book.libraryservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.libraryservice.model.Book;
import com.book.libraryservice.model.BookTransactions;
import com.book.libraryservice.repository.BookRepository;
import com.book.libraryservice.repository.TransactionRepository;

/**
 * Service class for Library service.
 *
 * This class contains the methods to retrieve, insert, update or delete Library
 * details.
 */
@Service
public class LibrarySvcService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private TransactionRepository transactionRepository;

	/**
	 * Method to get Book Details By Book Id.
	 *
	 * @param bookId - Book Id unique to every book.
	 * @return List of Book
	 */
	public List<Book> getBookDetailsById(String bookId) {
		return bookRepository.findAllByBookId(bookId);
	}

	/**
	 * Method to get Book Transaction Details for the provided Year.
	 *
	 * @param bookId       - Book Id unique to every book.
	 * @param issuedOnYear - Year of transaction.
	 * @return List of BookTransactions.
	 */
	public List<BookTransactions> getBookTransactionDetailsOfYear(String bookId, int issuedOnYear) {
		return transactionRepository.retrieveBookTransactionsforYear(bookId, issuedOnYear);
	}

	/**
	 * Method to get Books by book type.
	 *
	 * @param bookType - section of book (like: AUTOBIOGRAPHY, FANTASY)
	 * @return List of Book
	 */
	public List<Book> getBooksByType(String bookType) {
		return bookRepository.findAllByBookType(bookType);
	}
}
