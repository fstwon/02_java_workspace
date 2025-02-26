package com.kh.last.p5;

public class Phone {
	// field
	/*
		- model:String
		- price:int
		- manufacture:String
		- quantity:int
	 */
	private String model;
	private int price;
	private String manufacture;
	private int quantity;
	
	// constructor
	/*
		+Phone()
		+Phone(model:String,price:int,manufacture:String,quantity:int)
	 */
	public Phone() {
	}

	public Phone(String model, int price, String manufacture, int quantity) {
		this.model = model;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity;
	}
	
	// method
	/*
		+toString():String
		+getXXX()
		+setXXX()
	*/
	
	@Override
	public String toString() {
		return " " + model + ", " + price + ", " + manufacture + ", " + quantity;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMnufacture() {
		return manufacture;
	}

	public void setMnufacture(String mnufacture) {
		this.manufacture = mnufacture;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
