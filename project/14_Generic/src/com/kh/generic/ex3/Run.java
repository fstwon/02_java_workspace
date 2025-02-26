package com.kh.generic.ex3;

// 타입 제한
// <T extends 클래스 또는 인터페이스>
// 클래스 또는 인터페이스를 상속(구현)하는 타입으로 제한
// *클래스의 경우 해당 클래스도 포함

// Number 클래스를 상속하는 타입으로 제한 
public class Run {
	public static void main(String[] args) {
		// Error. Generic 타입을 Number 클래스로 제한하고 있기 때문에 발생
		// Box<Apple> aBox = new Box<>();
		// 클래스에 Number 클래스를 상속시키면 할당은 가능
		
		Box<Number> nBox = new Box<>();
		Box<Integer> iBox = new Box<>();
		Box<Double> dBox = new Box<>();
		// Number 또는 Number 타입을 상속 받는 하위 타입 사용 가능
	}

}
