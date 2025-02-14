package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
	// field
	/*
		- result:String[] = new String[2];	
	*/
	private String[] result = new String[2];
	
	// method
	/*
		+ method() : String[]
	*/
	public String[] method() {
		/*
			Phone객체 배열의 각 인덱스에 GalaxyNote9, V40 객체 저장하고 
			각 객체의 정보를 문자열 배열에 저장하여 
			문자열 배열 주소를 반환하는 메소드
			
			for문을 이용하여 Phone 객체배열에 모든 인덱스를 참조. (instanceof 활용하기)
			
			이때 참조한 객체의 타입이 
			GalayNote9 경우 GalayNote9에 오버라이딩 된 printInform() 호출,
			V40인 경우 V40에 오버라이딩된 printInform() 호출
		*/
		// Phone 객체 배열에 GN9 V40 객체 저장
		Phone[] pArr = new Phone[result.length];		
		pArr[0] = new GalaxyNote9();
		pArr[1] = new V40();
		
		// 객체의 정보를 문자열 배열에 저장 후 배열 주소 반환
		for(int i = 0; i < pArr.length; i++) {
			Phone p = pArr[i];
			if(p instanceof SmartPhone) {
				result[i] = ((SmartPhone)p).printInformation();
			}
			/*
			if(p instanceof GalaxyNote9) {
				// GN9.printInformation();
				result[0] = ((GalaxyNote9) p).printInformation();
			} else if(p instanceof V40) {
				// V40.printInformation();
				result[1] = ((V40) p).printInformation();
			}
			*/
		}
				
		return result;
	}
}
