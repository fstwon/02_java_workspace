package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	// SmartPhone 클래스는 CellPhone, TouchDisplay 인터페이스를 상속(구현)!
	/*
	 * * 상속 적용 후 SmartPhone의 멤버 정보
	 *  touch();
	 * ---------- TouchDisplay
	 *  charge();
	 *  NUMBERPAD 상수필드
	 *  makeCall();
	 *  takeCall();
	 *  picture();
	 * ---------- CellPhone
	 */
	private String maker;	// 제조사 정보
	
	public SmartPhone() {}
	
	// + printInformation() : String (기울임)
	public abstract String printInformation();
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMaker() {
		return maker;
	}

}
