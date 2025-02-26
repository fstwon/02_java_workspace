package com.kh.generic.ex2;

// ex1 내용과 이어짐 
// 제네릭 사용 후 
// * 타입 매개변수를 가지고 데이터 타입 부분을 사용 시점에 정하도록 하는 기능
// 타입 매개변수 선언
// => 클래스 전체 적용 : 클래스명<제네릭타입변수명>
// => 메소드 내 사용 : 접근제한자 [예약어] <제네릭타입변수명> 반환형 메소드명
// 타입 매개변수명 규칙 : 대문자사용, 한글자 정의

public class Box<T> {
	// 선언한 타입 매개변수 T로 필드의 타입 지정
	private T ob;
	
	public T get() {
		return ob;
	}
	public void set(T o) {
		this.ob = o;
	}
}

class Apple {
	@Override
	public String toString() {
		return "I'm an apple.";
	}
}
class Orange {
	@Override
	public String toString() {
		return "I'm an orange.";
	}
}