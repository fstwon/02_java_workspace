package com.kh.inherit.after;

//Product 클래스 상속
//필요한 멤버 따로 정의
public class TV extends Product {
	private int inch;
	
	public TV() {}
	public TV(String brand, String code, String name, int price, int inch) {
		super(brand, code, name, price);
		this.inch = inch;
	}
	
	@Override
	public String information() {
		return super.information() + ", inch : " + inch;
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
}
