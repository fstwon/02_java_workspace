package com.kh.generic.ex1;

public class Run {

	public static void main(String[] args) {
		// Box 기본 생성자로 인스턴스 생성
		Box aBox = new Box();
		// Box 인스턴스 aBox 필드에 Apple 클래스의 기본 생성자로 Apple 인스턴스 할당
		aBox.set(new Apple());
		// Box 인스턴스 aBox 필드에 할당한 Apple 클래스의 인스턴스 ob를 Apple 타입의 apple 변수에 할당
		Apple apple = (Apple)aBox.get(); // aBox는 Box 타입으로 Apple 타입 변수에 할당하기 위해서 강제 형변환(Down-casting)이 필요하다.
		
		// Orange 클래스 인스턴스를 할당하기 위해 위 Apple 과정 반복
		Box oBox = new Box();
		// Orange 클래스의 인스턴스를 할당해야 하는데 Orange의 문자열을 전달함
		oBox.set("Orange");
		
		// oBox 인스턴스에 할당한 Orange 객체를 Orange 타입 orange 변수에 할당 시도 
		Orange orange = (Orange)oBox.get();
		
		System.out.println(orange);

	}

}
