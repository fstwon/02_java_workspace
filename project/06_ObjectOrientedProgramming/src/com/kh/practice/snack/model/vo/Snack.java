package com.kh.practice.snack.model.vo;

public class Snack {
	// field
	/*
		- kind : String // 종류
		- name : String // 이름
		- flavor : String // 맛
		- numOf : int // 개수
		- price : int // 가격
	*/
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	// constructor
	/*
	 	+ Snack()
		+ Snack(kind:String, name:String, flavor:String,
		numOf:int, price:int)
	*/
	public Snack() {}
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	/*
		+ information() : String
		+ setter() / getter()
	*/
	
	// method
	public String information() {
		// 문자열을 format을 통해 변환하는 메소드 : String.format("형식", 값/데이터);
		// return kind + "(" + name + " - " + "flavor" + ") " + numOf + "개 " + price + "원";
		return String.format(
			"%s(%s - %s) %d개 %d원", 
			kind, name, flavor, numOf, price
		);
	}
	
	// method setter/getter
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
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
	
	
	
}
