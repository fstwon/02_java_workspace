package com.kh.object.practice3.model.vo;

public class Circle {
	// field
	// -PI:double=3.14
	private final double PI = 3.14;
	// -radius:int=1
	private int radius = 1;
	
	// constructor
	// +Circle()
	public Circle() {
		
	}
	
	// method
	// +incrementRadius():void
	public void incrementRadius() {
		radius++;
	}
	// +getAreaOfCircle():void
	public void getAreaOfCircle() {
		// 원 둘레
		System.out.printf("원 둘레 : %.2f\n", (2 * PI * radius));
	}
	// +getSizeOfCircle():void
	public void getSizeOfCircle() {
		// 원 넓이
		System.out.printf("원 넓이 : %.2f\n", (radius * radius * PI));
	}
}
