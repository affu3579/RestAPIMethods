package com.RestAPITest.Entity;

public class BookStoreEntity {
	
	private int id;
	private String titleName;
	private String authorName;
	@Override
	public String toString() {
		return "BookStoreEntity [id=" + id + ", titleName=" + titleName + ", authorName=" + authorName + "]";
	}
	public BookStoreEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookStoreEntity(int id, String titleName, String authorName) {
		super();
		this.id = id;
		this.titleName = titleName;
		this.authorName = authorName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
