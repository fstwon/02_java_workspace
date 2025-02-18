package com.kh.inherit.before;
/*
 * Desktop 클래스
 * -------------
 * -brand:String
 * -code:String
 * -name:String
 * -price:int
 * -allInOne:boolean
 * -------------
 * +Desktop(모든 필드를 매개변수로 가짐)
 * +information():String
 * -------------
 */
public class Desktop {
	private String brand;
	private String code;
	private String name;
	private int price;
	private boolean allInOne;
	
	public Desktop() {}

	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		super();	// => 부모클래스(Object)의 기본생성자 호출(실행)
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	public String information() {
		return "brand : " + brand + ", code : " + code + ", name : " + name
				+ ", price : " + price + ", allInOne : " + allInOne;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	
}





