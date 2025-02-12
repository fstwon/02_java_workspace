package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {
	// field
	/*
		- accessAge : int // 제한 나이	
	*/
	private int accessAge;
	
	// constructor
	/*
		+ AniBook()
		+ AniBook(title:String, author:String, publisher:String, accessAge:int)
	*/
	public AniBook() {}
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	
	// method
	/*
		+ toString() : String	
	*/
	@Override
	public String toString() {
		return "AniBook " + super.toString() + ", accessAge=" + accessAge + "]";
	}
	public int getAccessAge() {
		return accessAge;
	}
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
}
