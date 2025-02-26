package com.kh.last.p6;

public class EmptyException extends Exception{

	// message 을 받아 부모생성자로 전달하는 생성자
	public EmptyException() {
		
	}
	public EmptyException(String msg) {
		super(msg);
	}
}
