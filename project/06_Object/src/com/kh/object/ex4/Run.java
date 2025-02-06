package com.kh.obejct.ex4;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Student s1 = new Student("std name", 20, 95, 85, 90);
		Student s2 = new Student("std2 name", 19, 70, 100, 90);
		
		// "xxx학생의 평균 : xx"
		// 첫번째 학생 평균 출력
		System.out.println(s1.getName() + "학생의 평균 : " + s1	.getAvg());
		
		// 두번째 학생 평균 출력
		System.out.println(s2.getName() + "학생의 평균 : " + s2.getAvg());
		
		// 사용자로부터 이름, 나이, 수학점수, 영어점수, 국어점수 입력
		// 평균 계산 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("나이 :");
		int age = sc.nextInt();
		System.out.print("수학 점수 :");
		int math = sc.nextInt();
		System.out.print("영어 점수 :");
		int eng = sc.nextInt();
		System.out.print("국어 점수 :");
		int kor = sc.nextInt();
		
		// s3 변수에 Student 인스턴스 생성 할당
		Student s3 = new Student(name, age, math, eng, kor);
		System.out.println("--------------");
		// 평균 값 출력
		System.out.printf("%s님의 평균 : %.2f", s3.getName(), s3.getAvg());
	}

}
