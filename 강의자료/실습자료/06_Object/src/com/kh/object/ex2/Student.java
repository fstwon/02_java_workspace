package com.kh.object.ex2;
/*
 * 클래스 구조
 * 
 * 		접근제한자 class 클래스명 {
 * 
 * 			// 변수부 (사용할 데이터를 선언하는 영역) -> 필드부라고도 표현함!
 * 
 * 			// 생성자부 (데이터를 초기화하기 위한 특수한 목적으로 메소드를 정의하는 영역)
 * 
 * 			// 메소드부 (기능을 정의하는 영역)
 * 
 * 		}
 */
public class Student {
	// ----- 필드부 정의 -------------
	String name;	// 이름
	int age;		// 나이
	double height;  // 키
	// ----------------------------
	// public Student() {}
	// ----- 메소드부 정의 -----------
	/* 저장된 데이터를 출력해주는 메소드 */
	public void print() {
		System.out.printf("이름: %s, 나이: %d, 키: %.2f\n",
								name, age, height);
	}
	// ----------------------------
}




