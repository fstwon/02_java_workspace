package com.kh.practice.point.model.vo;

public class Point {
	// field
	/*
		- x : int
		- y : int
	*/
	private int x;
	private int y;
	
	// constructor
	/*
		+ Point()
		+ Point(x:int, y:int)
	*/
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// method
	/*
		+ getter/setter()
		+ toString() : String
	*/
	
	@Override
	public String toString() {
		return "x : " + x + ", y : " + y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
