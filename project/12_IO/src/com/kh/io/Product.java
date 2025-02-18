package com.kh.io;

import java.io.Serializable;

// Serializable 인터페이스 상속 => 데이터 직렬화
public class Product implements Serializable {
	// field
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	
	// constructor
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// method
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
