package com.kh.poly.ex2;

public class Avante extends Car {
	public Avante(String color, String fuel, int year) {
		super(color, fuel, year);
	}
	
	@Override
	public void drive() {
		System.out.println("Avante drive");
	}
	
	public void moveAvante() {
		System.out.println("move Avante");
	}
}
