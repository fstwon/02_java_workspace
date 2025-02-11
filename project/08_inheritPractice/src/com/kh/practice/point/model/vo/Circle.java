package com.kh.practice.point.model.vo;

public class Circle extends Point {
	// field
	/*
		- radius : int 
	*/
	private int radius;
	// constructor
	/*
		+ Circle()
		+ Circle(x:int, y:int, radius:int)

	*/
	public Circle() {
		
	}
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	// method
	/*
		+ getter/setter()
		+ toString() : String
	*/
	@Override
	public String toString() {
		return super.toString() + ", radius : " + radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
