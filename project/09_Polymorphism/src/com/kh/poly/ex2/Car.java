package com.kh.poly.ex2;

public class Car {
	private String color;
	private String fuel;
	private int year;
	
	
	public Car() {
		
	}
	public Car(String color, String fuel, int year) {
		this.color = color;
		this.fuel = fuel;
		this.year = year;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getFuel() {
		return fuel;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString() {
		return "color : " + color + ", fuel : " + fuel + ", year" + year;
	}
	public void drive() {
		System.out.println("Car drive");
	}
}
