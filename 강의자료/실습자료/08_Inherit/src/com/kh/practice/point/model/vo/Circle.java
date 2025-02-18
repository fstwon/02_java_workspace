package com.kh.practice.point.model.vo;

public class Circle extends Point {
/*
	- radius : int
	+ Circle()
	+ Circle(x:int, y:int, radius:int)
	+ getter/setter()
	+ toString() : String
 */
	private int radius;

	public Circle() {
		super();
	}

	public Circle(int x, int y, int radius) {
		super(x, y);	// x, y의 값은 부모클래스의 생성자 사용!
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + ", radius : " + radius;
	}
}
