package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {
	// field
	/*
		- coupon : boolean // 요리학원쿠폰유무
	*/
	private boolean coupon;
	
	// constructor
	/*
		+ CookBook()
		+ CookBook(title:String, author:String, publisher:String, coupon:boolean)
	*/
	public CookBook() {}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	// method
	/*
		+ toString() : String
	*/
	@Override
	public String toString() {
		return "CookBook " + super.toString() + ", coupon=" + coupon + "]";
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
}
