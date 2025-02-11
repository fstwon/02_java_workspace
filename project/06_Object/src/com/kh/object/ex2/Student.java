package com.kh.object.ex2;

public class Student {
	// 필드부
	String name;   // 이름
	int age;	   // 나이
	double height; // 키
	
	// 메소드부
	public void print() {
		System.out.printf(
			"이름 : %s, 나이 : %d, 키 : %.2f\n", 
			name, age, height
		);
	}
}
