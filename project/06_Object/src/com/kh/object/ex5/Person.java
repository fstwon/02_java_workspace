package com.kh.obejct.ex5;

public class Person {
	// 필드부
	String name; 		  // 이름
	int age; 	 		  // 나이
	static int count = 0; // 인스턴스 생성 시 개수
	
	// 생성자부
	// 기본 생성자
	public Person() {
		count++;
	}
	// 매개변수가 2개인 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
	}
	// 메소드부
	@Override
	public String toString() {
		return "이름 : " + name + 
				", 나이 : " + age +
				", 번호 : " + count;
	}
	
	
}
