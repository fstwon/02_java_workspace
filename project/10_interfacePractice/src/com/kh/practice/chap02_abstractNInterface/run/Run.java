package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		/*
			갤럭시 노트9과 V40가 만들기에 필요한 기술들의 상속 구조를 나타낸 클래스 다이어그램이다.
			
			클래스 다이어그램과 설명을 보고 클래스, 인터페이스를 구현 한 뒤 
			
			갤럭시 노트9과 V40의 제원을 출력하는 프로그램을 작성하시오.
		*/
		
		/*
			스마트폰 명 / 갤럭시노트9 		/		V40
			
			전화 걸기 / 번호를 누르고 통화버튼을 누름 / 번호를 누르고 통화버튼을 누름
			
			전화 받기 / 수신 버튼을 누름 / 수신 버튼을 누름
			
			촬영 방식 / 1200만 듀얼 카메라 / 1200, 1600만 트리플 카메라
			
			충전 방식 / 고속 충전, 고속 무선 충전 / 고속 충전, 고속 무선 충전
			
			터치 방식 / 정전식, 와콤펜 지원 / 정전식
			
			블루투스펜 탑재 여부 / true / false
		*/
		
		// PhoneController객체 생성하고 method() 호출 후 반환 값을 String 배열에 담고
		PhoneController pc = new PhoneController();
		String[] sArr = pc.method();
		
		// 반복문을 이용하여 String배열의 각 인덱스 출력
		for(String s : sArr) {
			System.out.println(s);
			System.out.println();
		}
	}
}
