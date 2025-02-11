package com.kh.practice.snack.model.vo;

// * M(Model) => 데이터를 저장하기 위한 용도의 클래스
public class Snack {
	// ----- 필드부 ---------
	private String kind;	//	- kind : String // 종류
	private String name;	//	- name : String // 이름
	private String flavor;  //	- flavor : String // 맛
	private int numOf;		//	- numOf : int // 개수
	private int price;		//	- price : int // 가격
	// --------------------
	
	// ----- 생성자부 -------
	//	+ Snack()	// => 기본생성자
	public Snack() {}
	//	+ Snack(kind:String, name:String, flavor:String, numOf:int, price:int)
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		super();
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	// --------------------
	
	// ---- 메소드부 --------
	//	+ information() : String
	public String information() {
		// "빵(케이크 - 블루베리) 1개 15000원" 형식으로 문자열 리턴!
		/*
		String info = kind + "(" + name + " - " + flavor + ") " 
					  + numOf +"개 " + price + "원";
		return info;
		*/
		// 문자열의 특정 형식으로 변환해주는 기능 : String.format("형식", 값/데이터) : String
		String info = String.format("%s(%s - %s) %d개 %d원"
									, kind, name, flavor, numOf, price);
		return info;
	}
	//	+ setter() / getter()
	// String kind
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	// --------------------
}







