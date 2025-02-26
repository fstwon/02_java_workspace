package com.kh.practice.book.model.vo;

import java.io.Serializable;

public class Book implements Serializable {
	// field
	/*
		- title : String // 도서명
		- author : String // 저자
		- price : int // 가격
		- date : String // 출판날짜
		- discount : double // 할인율
	*/
	private String title;
	private String author;
	private int price;
	private String date;
	private double discount;

	// constructor
	/*
		+ Book()
		+ Book(title:String, author:String, price:int, date:String, discount:double)
	*/
	public Book() {}
	public Book(String title, String author, int price, String date, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}
	
	// method
	/*
		+ setter() / getter()
		+ toString() : String
	*/
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", date=" + date + ", discount="
				+ discount + "]";
	}
}
