package com.kh.inherit.before;

public class Desktop {
	// field
	/*
		-brand:String
		-code:String
		-name:String
		-price:int
		-allInOne:boolean
	*/
	private String brand;
	private String code;
	private String name;
	private int price;
	private boolean allInOne;
	 
	// constructor
	// +Desktop(brand:String, code:String, name:String, price:int)
	public Desktop() {}
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	// method
	// +information():String
	public String information() {
		return "brand : " + brand + ", code : " + code + ", name : " + name + ", price : " + price + ", allInOne : " + allInOne; 
	}
}
