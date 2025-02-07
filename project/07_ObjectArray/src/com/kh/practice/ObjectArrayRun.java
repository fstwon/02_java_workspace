package com.kh.practice;

import java.util.Scanner;

public class ObjectArrayRun {

	public static void main(String[] args) {
		// 크기가 3인 정수형 배열 선언 및 할당
		int[] intArr = new int[3];
		// 반복문을 사용하여 1 ~ 3까지 저장 
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
		}
		
		// 학생 정보를 담을 객체 배열 선언 및 할당
		Student[] stdArr = new Student[2];
		stdArr[0] = new Student("TOP", 30, '남');
		stdArr[1] = new Student("GD", 30, '남');
		
		// 저장된 학생 정보 출력
		stdArr[0].printInfo();
		
		// 두번째 학생 정보 제거
		stdArr[1] = null;
		
		// 입력 받은 값으로 학생 정보 관리
		Student[] sArr = new Student[2];
		Scanner sc = new Scanner(System.in);
		
		// 반복문 사용, 입력된 정보 배열 저장
		for(int i = 0; i < sArr.length; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			
			sc.nextLine();
			sArr[i] = new Student(name, age, gender);
		}
		for(Student s : sArr) {
			s.printInfo();
		}

		sc.close();
	}

}
