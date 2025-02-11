package com.kh.practice;

import java.util.Scanner;

public class ObjectArrayRun {

	// * 객체 배열 : 여러 개의 객체를 관리하는 구조
	/*
	 * 선언
	   		클래스명[] 변수명;
	 * 할당
	  		변수명 = new 클래스명[배열크기];
	 
	 * 인덱스 위치에 초기화	// => 해당 인덱스 위치에 객체를 생성하여 할당
	 		변수명[인덱스] = new 클래스명();	// 기본생성자 사용!
    */
	public static void main(String[] args) {
		// 크기가 3인 정수형 배열 선언 및 할당
		int[] arr = new int[3];
		// 반복문을 사용하여 1 ~ 3까지 저장 | 1 | 2 | 3 |
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}
		
		// ----------------------------------
		// 학생 정보를 담을 객체 배열 선언 및 할당
		// [1] 학생 정보를 관리하기 위해 Student 클래스 추가(정의)
		// [2] 정의한 Student 객체를 사용하여 배열 선언 및 할당
		Student[] stdArr = new Student[2];	// | null | null |
		stdArr[0] = new Student("임수진", 20, 'F');	// | Student객체 | null |
		stdArr[1] = new Student("홍길동", 30, 'M');  // | Student객체 | Student객체 |
		
		// **저장된 학생 정보 출력**
		stdArr[0].printInfo();	// 첫번째 학생의 정보 출력
		// 두번째 학생 정보를 제거
		stdArr[1] = null;
		
		// --------------------------------
		// 입력받은 값으로 학생정보 관리
		Student[] sArr = new Student[2];
		Scanner sc = new Scanner(System.in);
		
		// 반복문을 사용하여 입력된 정보를 배열에 저장
		for(int i=0; i<sArr.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("성별 : ");
			char gen = sc.next().charAt(0);
			
			sArr[i] = new Student(name, age, gen);
			// Student타입 = 인스턴스(객체)
		}
		
		// * 객체 배열을 for-each으로 사용한다면..?
		// for(자료형 변수명 : 배열명) {} // => 자료형 위치에 클래스명 작성!
		for(Student s : sArr) {
			s.printInfo();
		}
	}

}






