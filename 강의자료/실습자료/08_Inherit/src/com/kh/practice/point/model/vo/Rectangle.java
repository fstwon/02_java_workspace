package com.kh.practice.point.model.vo;

public class Rectangle extends Point {
/*
	- width : int
	- height : int
	+ Rectangle()
	+ Rectangle(x:int, y:int, width:int, height:int)
	+ getter/setter()
	+ toString() : String
 */
	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(int x, int y, int width, int height) {
		// * 부모 생성자 사용하여 초기화
		// super(x, y);
		
		// * 부모 setter 메소드를 사용하여 초기화
		setX(x);
		//this.setX(x);
		//super.setX(x);
		setY(y);
		
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
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
	@Override
	public String toString() {
		return super.toString() + ", width : " + width
					+ ", height : "+ height;
	}
	
	
}
