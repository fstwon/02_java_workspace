package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {
	private boolean coupon;	// 요리학원쿠폰유무
	
//	+ CookBook()
	public CookBook() {}
//	+ CookBook(title:String, author:String, publisher:String, coupon:boolean)
	
	public CookBook(String title, String author
					, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

//	+toString() : String
	@Override
	public String toString() {
		return "CookBook ["+ super.toString()+", coupon=" + coupon + "]";
	}
	// coupon:boolean 변수(필드) getter/setter
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	

}
