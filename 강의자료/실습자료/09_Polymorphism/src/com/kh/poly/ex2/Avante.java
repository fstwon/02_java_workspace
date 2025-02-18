package com.kh.poly.ex2;

public class Avante extends Car {

	// Alt + Shift + S > c
	public Avante(String color, String fuel, int year) {
		super(color, fuel, year);
	}

	// 오버라이딩된 메소드!
	@Override
	public void drive() {
		System.out.println("Avante ~~ drive ~~");
	}
	public void moveAvante() {
		System.out.println("move ~~ Avante ~~~");
	}
	
}
