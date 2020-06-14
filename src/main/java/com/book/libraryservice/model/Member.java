package com.book.libraryservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIBRARY_MEMBER")
public class Member implements Serializable {

	private static final long serialVersionUID = -1800724803186516800L;

	@Id
	@GeneratedValue
	@Column(name = "MEMBER_ID")
	private Long memberId;

	@Column(name = "NUMBER_OF_BOOK_ISSUED")
	private Integer numberOfBookIssued;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CONTACT")
	private String contact;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "EXPIRATION_DATE_OF_MEMBERSHIP")
	private String expirationDateofMembership;

	@Column(name = "START_DATE_OF_MEMBERSHIP")
	private String startDateofMembership;

	@Column(name = "MEMBER_STATUS")
	private String memberStatus; // Active / In-Active / Discontinued

	/**
	 * @return the memberId
	 */
	public Long getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the expirationDateofMembership
	 */
	public String getExpirationDateofMembership() {
		return expirationDateofMembership;
	}

	/**
	 * @param expirationDateofMembership the expirationDateofMembership to set
	 */
	public void setExpirationDateofMembership(String expirationDateofMembership) {
		this.expirationDateofMembership = expirationDateofMembership;
	}

	/**
	 * @return the startDateofMembership
	 */
	public String getStartDateofMembership() {
		return startDateofMembership;
	}

	/**
	 * @param startDateofMembership the startDateofMembership to set
	 */
	public void setStartDateofMembership(String startDateofMembership) {
		this.startDateofMembership = startDateofMembership;
	}

	/**
	 * Active / In-Active / Discontinued
	 *
	 * @return the memberStatus
	 */
	public String getMemberStatus() {
		return memberStatus;
	}

	/**
	 * Active / In-Active / Discontinued
	 *
	 * @param memberStatus the memberStatus to set
	 */
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	/**
	 * @return the numberOfBookIssued
	 */
	public Integer getNumberOfBookIssued() {
		return numberOfBookIssued;
	}

	/**
	 * @param numberOfBookIssued the numberOfBookIssued to set
	 */
	public void setNumberOfBookIssued(Integer numberOfBookIssued) {
		this.numberOfBookIssued = numberOfBookIssued;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Member [memberId=%s, name=%s, contact=%s, address=%s, expirationDateofMembership=%s, startDateofMembership=%s, memberStatus=%s, numberOfBookIssued=%s]",
				memberId, name, contact, address, expirationDateofMembership, startDateofMembership, memberStatus,
				numberOfBookIssued);
	}
}
