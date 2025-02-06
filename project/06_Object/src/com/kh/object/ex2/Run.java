package com.kh.obejct.ex2;

public class Run {

	public static void main(String[] args) {
		// Student 클래스 사용
		// Student 인스턴스 생성
		// 변수 선언
		Student std1; // 참조 변수
		// 인스턴스 생성
		std1 = new Student();
		std1.name = "student name";
		std1.age = 20;
		std1.height = 172;
		
		// std1 인스턴스 메소드 접근
		std1.print(); // Student 인스턴스 std1의 print 메소드 호출
		
		// 변수 선언 및 클래스 인스턴스 생성(할당)
		Student std2 = new Student();
		std2.name = "student2 name";
		std2.age = 20;
		std2.height = 180;
		
		// std2 인스턴스 메소드 접근
		std2.print(); // Student 인스턴스 std2의 print 메소드 호출
	}

}
