package com.kh.generic.ex2;

public class Run {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<>();	// => new Box<Apple>();
		aBox.set(new Apple());
		Apple apple = aBox.get();
		System.out.println(apple);
		
		// * 문제가 있었던 코드를 다시 작성해보자.
		Box<Orange> oBox = new Box<>();	// => new Box<Orange>();
		// oBox.set("Orange");		
		// => 컴파일오류발생!, Orange 타입의 데이터를 전달해야하는데, 문자열로 전달

	}

}
