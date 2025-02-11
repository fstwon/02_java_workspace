package com.kh.practice.point.model.vo;

public class Rectangle extends Point {
	// field
	/*
		- width : int
		- height : int
	*/
	private int width;
	private int height;
	// constructor
	/*
		+ Rectangle()
		+ Rectangle(x:int, y:int, width:int, height:int)

	*/
	public Rectangle() {}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	// method
	/*
		+ getter/setter()
		+ toString() : String
	*/
	
	
	public int getWidth() {
		return width;
	}
	@Override
	public String toString() {
		return super.toString() + ", width : " + width + ", height : " + height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
