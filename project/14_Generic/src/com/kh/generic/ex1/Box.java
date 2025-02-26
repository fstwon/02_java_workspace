package com.kh.generic.ex1;


// apple과 orange를 할당할 수 있는 Box 클래스 정의
// 제네릭 사용하기 전
public class Box {
	//
	private Object ob;
	
	public Object get() {
		return ob;
	}
	public void set(Object o) {
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