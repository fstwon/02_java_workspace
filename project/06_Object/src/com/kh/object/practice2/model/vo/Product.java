package com.kh.object.practice2.model.vo;

public class Product {
	// field
	// -productName:String
	private String productName;
	// -price:int
	private int price;
	// -brand:String
	private String brand;
	
	// constructor
	// +Product()
	public Product() {
		
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", brand=" + brand + "]";
	}

	// method
	// +information():void
	public void information() {
		System.out.println(toString());
	}
}
