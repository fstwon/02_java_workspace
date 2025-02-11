package com.kh.practice;

public class Student {
	// => 이름, 나이, 성별 정보를 관리하는 객체
	private String name;	// 학생 이름
	private int age;		// 학생 나이
	private char gender;	// 학생 성별
	
	// 생성자를 통해 학생정보에 대한 값을 전달받아 초기화
	public Student(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// 학생 정보를 출력하는 메소드
	public void printInfo() {
		System.out.println("학생 정보 : " + name + ", " + age + ", " + gender);
	}
}
