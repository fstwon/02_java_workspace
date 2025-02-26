package com.kh.generic.ex1;

public class Run {

	public static void main(String[] args) {
		Box aBox = new Box();	// 상자를 만든다.
		aBox.set(new Apple());	// 상자에 사과를 담는다.
		Apple apple = (Apple)aBox.get();	// 상자에서 사과를 꺼낸다.
		System.out.println(apple);
		
		// * 문제가 생긴다면..
		Box oBox = new Box();	// 상자를 만든다.
		oBox.set("Orange");		// 상자에 오렌지를 담아야하는데, 이름표를 담아버렸다.(실수)
		// ...
		Orange orange = (Orange)oBox.get();	// 상자에서 오렌지를 꺼낸다.
		// 오렌지를 담지 않았는데, 오렌지를 꺼내려고 했다. => 오류 발생!!
		System.out.println(orange); 
	}

}
