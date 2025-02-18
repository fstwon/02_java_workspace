package com.kh.inherit.after;

// Product 클래스를 상속받기! => extends
// * 필요한 추가적인 정보는 따로 정의할 것!
public class Desktop extends Product {
	private boolean allInOne;
	
	public Desktop() {}

	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		super(brand, code, name, price);
		// => 부모클래스(Product)의 매개변수가 4개인 생성자 실행(호출)
		this.allInOne = allInOne;
	}

	@Override		// Override 어노테이션=> 오버라이딩된 메소드
	public String information() {
		// return super.information() + ", allInOne : " + allInOne;
		return getBrand() + ", " + getName() + ", " + getCode() + ", "
				+ getPrice() + "," + allInOne;
		// super.information() => 부모클래스에 정의된 information 메소드 호출(실행)
	}

	// boolean 타입 필드의 getter 메소드명 => is필드명()
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	
}
