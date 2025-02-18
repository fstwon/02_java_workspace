package com.kh.exception;

public class MyException extends Exception {
	// 예외 클래스 정의, MyException class 생성
	/*
		1. 예외 클래스 상속
		2. 예외 메시지 초기화(설정)
			- 매개변수가 1개인 생성자 이용*
			- getMessage 메소드 오버라이딩
	*/
	public MyException() {}
	public MyException(String message) {
		super(message);
	}
}
