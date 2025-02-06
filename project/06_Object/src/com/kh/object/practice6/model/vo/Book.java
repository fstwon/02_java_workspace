package com.kh.object.practice6.model.vo;

public class Book {
	// field
	// -title:String
	private String title;
	// -publisher:String
	private String publisher; 
	// -author:String
	private String author;
	// -price:int
	private int price;
	// -discountRate:double
	private double discountRate;
	
	// constructor
	// +Book()
	public Book() {}
	
	// +Book(title:String, publisher:String, author:String)
	public Book(String title, String publisher, String author) {
		this(title, publisher, author, 0, 0);
	}
	// +Book(title:String, publisher:String, author:String, price:int, discountRate:double)
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	// method
	// +inform():void
	public void inform() {
		System.out.println(
				"title : " + title + ", " 
				+ "publisher : " + publisher + ", " 
				+ "author : " + author + ", "
				+ "price : " + price + ", "
				+ "discountRate : " + discountRate
		);
	}
}
