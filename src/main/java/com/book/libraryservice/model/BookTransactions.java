package com.book.libraryservice.model;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LIBRARY_BOOK_TRANSACTIONS")
public class BookTransactions implements Serializable {

	private static final long serialVersionUID = 8565739677719263111L;

	@Id
	@GeneratedValue
	@Column(name = "TRANSACTION_ID")
	private Long transactionId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK2_LIBRARY_MEMBER_MEMBERID")
	private Member member;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK2_LIBRARY_BOOK_ENTRYID")
	private Book book;

	@Column(name = "BOOK_ID")
	private String bookId;

	@Column(name = "BOOK_NAME")
	private String bookName;

	@Column(name = "ISSUED_ON")
	private ZonedDateTime issuedOn;

	@Column(name = "RETURNED_ON")
	private ZonedDateTime returnedOn;

	@Column(name = "TRANSACTION_STATUS")
	private String transactionStatus;// Issued/Returned

	/**
	 * @return the transactionId
	 */
	public Long getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the memberId
	 */
	public Member getMember() {
		return member;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMember(Member member) {
		this.member = member;
	}

	/**
	 * @return the bookEntryId
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * @param bookEntryId the bookEntryId to set
	 */
	public void setBookEntryId(Book book) {
		this.book = book;
	}

	/**
	 * @return the bookId
	 */
	public String getBookId() {
		return bookId;
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @return the issuedOn
	 */
	public ZonedDateTime getIssuedOn() {
		return issuedOn;
	}

	/**
	 * @param issuedOn the issuedOn to set
	 */
	public void setIssuedOn(ZonedDateTime issuedOn) {
		this.issuedOn = issuedOn;
	}

	/**
	 * @return the returnedOn
	 */
	public ZonedDateTime getReturnedOn() {
		return returnedOn;
	}

	/**
	 * @param returnedOn the returnedOn to set
	 */
	public void setReturnedOn(ZonedDateTime returnedOn) {
		this.returnedOn = returnedOn;
	}

	/**
	 * Issued/Returned
	 *
	 * @return the transactionStatus
	 */
	public String getTransactionStatus() {
		return transactionStatus;
	}

	/**
	 * Issued/Returned
	 *
	 * @param transactionStatus the transactionStatus to set
	 */
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"BookTransactions [transactionId=%s, member=%s, book=%s, bookId=%s, bookName=%s, issuedOn=%s, returnedOn=%s, transactionStatus=%s]",
				transactionId, member, book, bookId, bookName, issuedOn, returnedOn, transactionStatus);
	}

}
