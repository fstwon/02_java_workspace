package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone
				implements NotePen {

	public V40() {
		// 부모에게 상속받은 maker 필드를 “LG”로 초기화
		setMaker("LG");
	}

	@Override
	public String touch() {
		return "정전식";
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}

	@Override
	public String picture() {
		return "1200, 1600만 트리플 카메라";
	}

	@Override
	public boolean bluetoothPen() {
		return !PEN_BUTTON;	// => !true -> false
	}

	@Override
	public String printInformation() {
		return "V40는 " + getMaker() + "에서 만들어졌고 제원은 다음과 같다\n"
				+ makeCall() + "\n"
				+ takeCall() + "\n"
				+ picture() + "\n"
				+ charge() + "\n"
				+ touch() + "\n"
				+ "블루투스 펜 탑재 여부 : " + bluetoothPen();
	}
	
	
}
