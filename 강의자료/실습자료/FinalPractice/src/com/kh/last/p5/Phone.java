package com.kh.last.p5;
/*
Phone
- model:String
- price:int
- manufacture:String
- quantity:int
+Phone()
+Phone(model:String,price:int,manufacture:String,quantity:int)

+toString():String
+getXXX()
+setXXX()
 */
public class Phone /* extends Object*/ {
	// 클래스 = 데이터 + 기능
	//        필드(변수) + 생성자 + 메소드(함수)
	private String model;
	private int price;
	private String manufacture;
	private int quantity;
	// * 접근제한자 : public > protected > (default) > private
	
	// 기본생성자 => 클래스 내에 생성자가 정의되어 있지 않을 경우
	//			   컴파일러 의해서 자동으로 만들어짐
	public Phone() {
		super();
	}

	public Phone(String model, int price, String manufacture, int quantity) {
		super();
		this.model = model;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override		// Object 클래스의 toString 메소드를 재정의(오버라이딩)
	public String toString() {
		// * 모든 필드의 정보를 알 수 있도록 문자열 형태로 반환
		// "galaxy S7, 563500, 삼성, 7" 형식으로 반환
		// return model + ", " + price + ", " 
		//			+ manufacture + ", " + quantity;
		return String.format("%s, %d, %s, %d"
							, model, price, manufacture, quantity);
		
	}
	
}





