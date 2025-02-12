package com.kh.practice.chap01_poly.model.vo;

public class Book {
	// field
	
	/*
		- title : String // 도서명
		- author : String // 저자명
		- publisher : String // 출판사명	
	*/
	private String title;
	private String author;
	private String publisher;
	
	
	// constructor
	/*
		+ Book()
		+ Book(title:String, author:String, publisher:String)
	*/
	public Book() {}
	
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	// method
	/*
		+ toString() : String	
	*/
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
