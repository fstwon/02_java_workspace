package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface CellPhone extends Phone, Camera {
	// => CellPhone 인터페이스는 
	//			Phone, Camera 인터페이스로부터 상속을 받는다.
	// Phone 멤버와 Camera 멤버를 물려받았음!(CellPhone의 멤버가됨!)

	
	String charge(); // 충전 방식
	
	// => CellPhone의 멤버 정보 -------------
	/*
	 * NUMBERPAD (상수필드)
	 * makeCall()
	 * takeCall()
	 * ------------ Phone 의 멤버 정보 --
	 * picture()
	 * ------------ Camera 의 멤버 정보 --
	 * charge()
	 * ------------ CellPhone에서 정의된 정보!
	 */
}
