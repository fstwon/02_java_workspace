package com.kh.inter.ex1;

public class Rabbit implements Animal, Baby {
	// Rabbit 클래스는 Animal, Baby 인터페이스를 상속받는다(구현한다)
	
	@Override
	public void move() {
	}

	@Override
	public void eat() {
		System.out.println("Rabbit이 풀을 먹습니다.");
	}

	@Override
	public void makeSound() {
		System.out.println("깨갱");
	}
}
