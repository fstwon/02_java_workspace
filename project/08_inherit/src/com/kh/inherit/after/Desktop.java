package com.kh.inherit.after;

// Product 클래스 상속
// 필요한 멤버 따로 정의
public class Desktop extends Product {
	private boolean allInOne;
	
	public Desktop() {}
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		super(brand, code, name, price);
		this.allInOne = allInOne;
	}
	
	@Override
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
}
