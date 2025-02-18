package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
// 인터페이스의 멤버 => 상수 필드 + 추상 메소드
	public static final char[] NUMBERPAD
	= {'1', '2', '3',
		'4', '5', '6',
		'7', '8', '9',
		'*', '0', '#'};
	
	public abstract String makeCall(); // 전화 걸기
	/* public abstract*/ String takeCall(); // 전화 받기
}
