package com.book.libraryservice.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@Component
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class BookDetailsResponse implements Serializable {

	private static final long serialVersionUID = -2439090718507295393L;

	private List<Book> books;

	private List<BookTransactions> bookTransactions;

	private List<Member> members;

	private int bookCount;

	private int memberCount;

	/**
	 *
	 */
	public BookDetailsResponse() {
		super();
	}

	/**
	 * @param books
	 * @param bookTransactions
	 * @param members
	 * @param bookCount
	 */
	public BookDetailsResponse(List<Book> books, List<BookTransactions> bookTransactions, List<Member> members,
			int bookCount) {
		super();
		this.books = books;
		this.bookTransactions = bookTransactions;
		this.members = members;
		this.bookCount = bookCount;
	}

	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	/**
	 * @return the bookTransactions
	 */
	public List<BookTransactions> getBookTransactions() {
		return bookTransactions;
	}

	/**
	 * @param bookTransactions the bookTransactions to set
	 */
	public void setBookTransactions(List<BookTransactions> bookTransactions) {
		this.bookTransactions = bookTransactions;
	}

	/**
	 * @return the members
	 */
	public List<Member> getMembers() {
		return members;
	}

	/**
	 * @param members the members to set
	 */
	public void setMembers(List<Member> members) {
		this.members = members;
	}

	/**
	 * @return the bookCount
	 */
	public int getBookCount() {
		return bookCount;
	}

	/**
	 * @param bookCount the bookCount to set
	 */
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	/**
	 * @return the memberCount
	 */
	public int getMemberCount() {
		return memberCount;
	}

	/**
	 * @param memberCount the memberCount to set
	 */
	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("BookDetailsResponse [books=%s, bookTransactions=%s, members=%s, bookCount=%s]", books,
				bookTransactions, members, bookCount);
	}

}
