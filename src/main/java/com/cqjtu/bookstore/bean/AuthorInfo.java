package com.cqjtu.bookstore.bean;

import java.util.Date;

public class AuthorInfo {

	private String authorId;
	private String authorName;
	private String authorTele;
	private String authorEmail;
	private String authorPassword;
	private String authorAvatar;
	private String authorVip;
	private Date enrollDate;
	private Date endDate;

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorTele() {
		return authorTele;
	}

	public void setAuthorTele(String authorTele) {
		this.authorTele = authorTele;
	}

	public String getAuthorEmail() {
		return authorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}

	public String getAuthorPassword() {
		return authorPassword;
	}

	public void setAuthorPassword(String authorPassword) {
		this.authorPassword = authorPassword;
	}

	public String getAuthorAvator() {
		return authorAvatar;
	}

	public void setAuthorAvator(String authorAvatar) {
		this.authorAvatar = authorAvatar;
	}

	public String getAuthorVip() {
		return authorVip;
	}

	public void setAuthorVip(String authorVip) {
		this.authorVip = authorVip;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
