package com.kh.practice;

public class Student {
	// field
	private String name;
	private int age;
	private char gender;
	
	// constructor
	public Student() {}
	public Student(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// method
	// 학생 정보 출력 
	public void printInfo() {
		System.out.println(
			"학생 정보 : " + name + ", " + age + ", " + gender
		);
	}
}
