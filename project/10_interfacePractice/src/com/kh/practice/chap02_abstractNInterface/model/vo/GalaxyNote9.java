package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {
	// constructor
	/*
		+ GalaxyNote9()	
	*/
	public GalaxyNote9() {
		super.setMaker("Samsung");
	}
	
	
	// method
	/*
		+ makeCall() : String
		+ takeCall() : String
		+ picture() : String
		+ charge() : String
		+ touch() : String
		+ bluetoothPen() : boolean
		+ printInformation() : String	
	*/
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	public String takeCall() {
		return "수신 버튼을 누름";
	}
	
	public String picture() {
		return "1200만 듀얼 카메라";
	}
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}
	public String touch() {
		return "정전식, 와콤펜 지원 ";
	}
	public boolean bluetoothPen() {
		return PEN_BUTTON;
	}
	
	public String printInformation() {
		/*		
			실행 화면을 참조하여 오버라이딩
		*/	
		return "갤럭시 노트9은 " + getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n"
				+ makeCall() + "\n"
				+ takeCall() + "\n"
				+ picture() + "\n"
				+ charge() + "\n"
				+ touch() + "\n"
				+ "블루투스 펜 탑재 여부 : " + bluetoothPen();
	}
}
