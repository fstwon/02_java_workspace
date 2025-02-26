package com.kh.practice.list.library.model.vo;

public class Book implements Comparable<Book> {
	// field
	/*
		- title:String
		- author:String
		- category : String
		- price : int
	*/
	private String title;
	private String author;
	private String category;
	private int price;
	
	// constructor
	/*
		+ Book()
		+ Book(title:String, author:String, category:String, price:int)
	 */
	public Book() {
	}
	
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	// method
	/*
		+ setter() / getter()
		+ toString() : String
		+ hashCode() : int
		+ equals() : boolean
		+ compareTo() : int
	*/
	@Override
	public int compareTo(Book o) {
		// 정렬 기준을 가지고 있는 메소드
		return this.title.compareTo(o.title);
	}
	public boolean equals() {
		// 객체가 같은지 여부를 리턴하는 메소드
		return false;
	}	
	@Override
	public int hashCode() {
		// 해시코드를 리턴하는 메소드
		return 0;
	}
	@Override
	public String toString() {
		return "(" + title + "/" + author + "/" + category + "/" + price + ")";
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}