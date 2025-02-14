package com.kh.inter.ex1;

// 인터페이스 상속(구현)
public class Cat implements Animal {
	// Cat 클래스는 Animal 인터페이스를 구현
	// => 해당 인터페이스의 추상 메소드를 오버라이딩 해야 한다. (객체 생성 가능)
	//    오버라이딩 하지 않는 경우 현재 Cat 클래스는 추상 클래스가 된다. (객체 생성 불가)
	@Override
	public void move() {
		System.out.println("Cat이 사뿐사뿐 걷습니다.");
	}
	@Override
	public void eat() {
		System.out.println("Cat이 츄르를 먹습니다.");
	}
	@Override
	public void makeSound() {
		System.out.println("냐옹 냐옹");
	}
}
