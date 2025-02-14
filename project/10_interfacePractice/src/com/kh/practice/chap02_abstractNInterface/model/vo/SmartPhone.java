package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements TouchDisplay, CellPhone {
	// field
	// - maker : String // 제조사 정보
	private String maker;
	
	// constructor
	/*
		+ SmartPhone()
	*/
	public SmartPhone() {}
	
	// method
	/*
		+ printInformation() : String
		+ setMaker(maker : String) : void
		+ getMaker() : String	
	*/
	public abstract String printInformation();
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMaker() {
		return maker;
	}
}
