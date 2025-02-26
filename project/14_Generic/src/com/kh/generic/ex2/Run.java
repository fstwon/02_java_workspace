package com.kh.generic.ex2;

public class Run {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<>();
		aBox.set(new Apple());
		Apple apple = aBox.get();
		
		Box<Orange> oBox = new Box<>();
		// oBox.set("Orange"); // 컴파일 단계에서 에러를 미리 확인할 수 있다.
	}

}
