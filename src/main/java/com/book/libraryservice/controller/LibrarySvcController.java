package com.book.libraryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.libraryservice.model.Book;
import com.book.libraryservice.model.BookDetailsResponse;
import com.book.libraryservice.model.BookTransactions;
import com.book.libraryservice.service.LibrarySvcService;

/**
 * Rest Controller class for Library Service.
 *
 * This class contains the methods to retrieve, insert, update or delete Library
 * details.
 */
@RestController
public class LibrarySvcController {

	@Autowired
	private LibrarySvcService librarySvcService;

	/**
	 * Method used to retrieve the number of copies of a particular book with the
	 * details of the people who lent the book.
	 *
	 * End-point Exposed: http://localhost:8080/library/book/details?bookId=810HP1
	 *
	 * @param bookId - Book Id unique to every book.
	 * @return ResponseEntity<BookDetailsResponse> with list of copies of Book and
	 *         number of copies.
	 */
	@GetMapping(value = "/book/details")
	public ResponseEntity<BookDetailsResponse> getBookDetailsById(
			@RequestParam(name = "bookId", required = true) String bookId) {

		ResponseEntity<BookDetailsResponse> responseEntity = null;
		List<Book> books = librarySvcService.getBookDetailsById(bookId);

		if (CollectionUtils.isEmpty(books)) {
			responseEntity = ResponseEntity.notFound().build();
		} else {
			BookDetailsResponse bookDetailsResponse = new BookDetailsResponse();
			bookDetailsResponse.setBooks(books);
			bookDetailsResponse.setBookCount(books.size());
			responseEntity = ResponseEntity.ok(bookDetailsResponse);
		}
		return responseEntity;
	}

	/**
	 * Method used to retrieve the transaction history of a particular book using
	 * its book id for the particular year.
	 *
	 * End-point Exposed:
	 * http://localhost:8080/library/transactions/book?bookId=810HP1&year=2020
	 *
	 * @param year   - Year of transaction.
	 * @param bookId - Unique id of Book.
	 * @return ResponseEntity<BookDetailsResponse> with list of transactions for the
	 *         provided year.
	 */
	@GetMapping(value = "/transactions/book")
	public ResponseEntity<BookDetailsResponse> getBookTransactionDetailsOfYear(
			@RequestParam(name = "year", required = true) int year,
			@RequestParam(name = "bookId", required = true) String bookId) {

		ResponseEntity<BookDetailsResponse> responseEntity = null;
		List<BookTransactions> bookTransactions = librarySvcService.getBookTransactionDetailsOfYear(bookId, year);

		if (CollectionUtils.isEmpty(bookTransactions)) {
			responseEntity = ResponseEntity.notFound().build();
		} else {
			BookDetailsResponse bookDetailsResponse = new BookDetailsResponse();
			bookDetailsResponse.setBookTransactions(bookTransactions);
			responseEntity = ResponseEntity.ok(bookDetailsResponse);
		}
		return responseEntity;
	}

	/**
	 * Method used to retrieve the number of books in a particular section (Book
	 * Type).
	 *
	 * End-point Exposed:
	 * http://localhost:8080/library/book/booktype?bookType=FANTASY
	 *
	 * @param bookType - section of book (like: AUTOBIOGRAPHY, FANTASY)
	 * @return ResponseEntity<BookDetailsResponse> with list of book for the
	 *         provided book type/section.
	 */
	@GetMapping(value = "/book/booktype")
	public ResponseEntity<BookDetailsResponse> getBooksByType(
			@RequestParam(name = "bookType", required = true) String bookType) {

		ResponseEntity<BookDetailsResponse> responseEntity = null;
		List<Book> books = librarySvcService.getBooksByType(bookType);

		if (CollectionUtils.isEmpty(books)) {
			responseEntity = ResponseEntity.notFound().build();
		} else {
			BookDetailsResponse bookDetailsResponse = new BookDetailsResponse();
			bookDetailsResponse.setBooks(books);
			bookDetailsResponse.setBookCount(books.size());
			responseEntity = ResponseEntity.ok(bookDetailsResponse);
		}
		return responseEntity;
	}

}
