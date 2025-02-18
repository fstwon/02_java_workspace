package com.kh.poly.ex2;

public class Sonata extends Car {
	// Car : color, fuel, year
	
	public Sonata(String color, String fuel, int year) {
		// this.color = color;  // private 변수는 직접 접근 불가!
		
		// setColor(color); 	// setter 사용 
		super(color, fuel, year);	// 부모클래스의 생성자 사용
	}
	
	// 오버라이딩된 메소드!
	@Override
	public void drive() {
		System.out.println("Sonata drive~~");
	}
	public void moveSonata() {
		System.out.println("move ~~ sonata~~~");
	}
}
