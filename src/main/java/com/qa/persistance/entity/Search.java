package com.qa.persistance.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Search {

	private Long id;
	private String name;
	private Long memberNumber;
	private String searchTerm;
	private Date date;

	public Search(Long id, String name, Long memberNumber, String searchTerm, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.memberNumber = memberNumber;
		this.searchTerm = searchTerm;
		this.date = date;
	}

	public Search() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(Long memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
