package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1();
	}
	
	public static void practice1() {
		// 실습문제 1 풀이
		// 하나의 정수를 입력받아 양수이면 "양수다", 양수가 아니면 "양수가 아니다" 출력
		Scanner sc = new Scanner(System.in);
		
		// "정수 : " 출력
		System.out.print("정수 : ");
		
		// 정수를 입력받고 해당 값을 변수에 저장
		int num = sc.nextInt();
		
		// 입력받은 값이 0보다 크다면 "양수다" 그렇지 않으면 "양수가 아니다" 출력
		// System.out.println(num > 0 ? "양수다" : "양수가 아니다");
		String result = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);
	}

}
