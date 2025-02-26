package com.kh.generic.ex3;

public class Run {

	public static void main(String[] args) {
		// Box<Apple> aBox = new Box<>();
		// => Number 클래스를 상속받지 않기 때문에 오류 발생!
		// => Number 클래스를 상속시키면 오류가 해결됨!!

		Box<Number> nBox = new Box<>();
		
		Box<Integer> iBox = new Box<>();
		Box<Double> dBox = new Box<>();
		// => Number 또는 Number 타입을 상속받는 타입 사용 가능!
	}

}
