package com.book.libraryservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LIBRARY_BOOK")
public class Book implements Serializable {

	private static final long serialVersionUID = 9164087732192247042L;

	@Id
	@GeneratedValue
	@Column(name = "ENTRY_ID")
	private Long entryId;

	@Column(name = "PRICE")
	private Double price;

	@Column(name = "BOOK_ID")
	private String bookId;

	@Column(name = "BOOK_NAME")
	private String bookName;

	@Column(name = "BOOK_TYPE")
	private String bookType;

	@Column(name = "AUTHOR")
	private String author;

	@Column(name = "ISBN_CODE")
	private String isbnCode;

	@Column(name = "BOOK_STATUS")
	private String bookStatus; // Issued/Available

	@Column(name = "DATE_OF_ENTRY")
	private String dateOfEntry;

	@Column(name = "PUBLISHED_ON")
	private String publishedOn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEMBER_ID")
	private Member issuedTo;

	public Book() {
	}

	public Book(Long entryId, Double price, String bookId, String bookName, String bookType, String author,
			String isbnCode, String bookStatus, String dateOfEntry, String publishedOn) {
		super();
		this.entryId = entryId;
		this.price = price;
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookType = bookType;
		this.author = author;
		this.isbnCode = isbnCode;
		this.bookStatus = bookStatus;
		this.dateOfEntry = dateOfEntry;
		this.publishedOn = publishedOn;
	}

	/**
	 * @return the entryId
	 */
	public Long getEntryId() {
		return entryId;
	}

	/**
	 * @param entryId the entryId to set
	 */
	public void setEntryId(Long entryId) {
		this.entryId = entryId;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
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
	 * @return the bookType
	 */
	public String getBookType() {
		return bookType;
	}

	/**
	 * @param bookType the bookType to set
	 */
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the isbnCode
	 */
	public String getIsbnCode() {
		return isbnCode;
	}

	/**
	 * @param isbnCode the isbnCode to set
	 */
	public void setIsbnCode(String isbnCode) {
		this.isbnCode = isbnCode;
	}

	/**
	 * Issued/Available
	 *
	 * @return the bookStatus
	 */
	public String getBookStatus() {
		return bookStatus;
	}

	/**
	 * Issued/Available
	 *
	 * @param bookStatus the bookStatus to set
	 */
	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	/**
	 * @return the dateOfEntry
	 */
	public String getDateOfEntry() {
		return dateOfEntry;
	}

	/**
	 * @param dateOfEntry the dateOfEntry to set
	 */
	public void setDateOfEntry(String dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	/**
	 * @return the publishedOn
	 */
	public String getPublishedOn() {
		return publishedOn;
	}

	/**
	 * @param publishedOn the publishedOn to set
	 */
	public void setPublishedOn(String publishedOn) {
		this.publishedOn = publishedOn;
	}

	/**
	 * @return the issuedTo
	 */
	public Member getIssuedTo() {
		return issuedTo;
	}

	/**
	 * @param issuedTo the issuedTo to set
	 */
	public void setIssuedTo(Member issuedTo) {
		this.issuedTo = issuedTo;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Book [entryId=%s, price=%s, bookId=%s, bookName=%s, bookType=%s, author=%s, isbnCode=%s, bookStatus=%s, dateOfEntry=%s, publishedOn=%s]",
				entryId, price, bookId, bookName, bookType, author, isbnCode, bookStatus, dateOfEntry, publishedOn);
	}
}
