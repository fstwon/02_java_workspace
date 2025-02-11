package com.kh.inherit.before;

public class Tv {
	// field
	/*
		-brand:String
		-code:String
		-name:String
		-price:int
		-inch:int
	*/
	private String brand;
	private String code;
	private String name;
	private int price;
	private int inch;
	
	// constructor
	// +TV(모든 필드를 매개변수로 가진다)
	public Tv() {}
	
	public Tv(String brand, String code, String name, int price, int inch) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.inch = inch;
	}
	
	// method
	// +information():String
	public String information() {
		return "brand : " + brand + ", code : " + code + ", name : " + name + ", price : " + price + ", inch : " + inch; 
	}
}
