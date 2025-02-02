package com.kh.condition;

import java.util.Scanner;

public class If {

	/*
	 * 조건문 if
	 * : 기본적으로 프로그램은 순차적으로 진행 (위->아래, 왼쪽->오른쪽)
	 *   순차적인 흐름을 바꿀때 제어문(조건문, 반복문, ..)을 사용하여 제어 가능
	 *   
	 * : 조건문 - 조건에 따라 선택적으로 실행할 때
	 * : 반복문 - 반복적으로 실행할 때
	 * 
	 * : "조건식"을 통해 참인지, 거짓인지 판단하여 그에 해당하는 코드를 실행
	 *   => 조건식의 결과 : true, false
	 *   => 연산자 : 비교연산자(> < == ..), 논리연산자(&& ||)를 주로 사용
	 *   
	 * : 조건문의 종류 : if, switch
	 * * if
	 * 		[1] 단독 if문
	 * 			if (조건식) {
	 * 				// 조건식이 참인 경우 실행할 코드
	 * 			}
	 * 			// => 조건식이 거짓인 경우 실행되는 내용은 없음!
	 * 
	 * 		[2] if ~ else문
	 * 			if (조건식) {
	 * 				// 조건식이 참인 경우 실행할 코드
	 * 			} else {
	 * 				// 조건식이 거짓인 경우 실행할 코드
	 * 			}
	 * 
	 * 		[3] if ~ else if ~ else문
	 * 			if (조건식) {
	 * 				// 조건식이 참인 경우 실행할 코드
	 * 			} else if (조건식2) {
	 * 				// 조건식이 거짓이고, 조건식2가 참인 경우 실행할 코드
	 *  		} else {
	 *  			// 조건식, 조건식2 모두 거짓인 경우 실행할 코드
	 *  		}
	 */
	public static void main(String[] args) {
		// method1();
		// method2();
		method3();
	}
	
	public static void method3() {
		/* TODO:
		 * 주민번호 입력받아서 남자인지, 여자인지 출력
		 * (단, - 포함해서 입력받은 값의 길이가 14가 아닌 경우 "잘못 입력되었습니다" 출력)
		 * * 문자열 길이 확인 메소드: 문자열.length()
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력 : ");
		String number = sc.nextLine(); 
		
		if (number.length() != 14) {
			System.out.println("잘못 입력되었습니다.");
		} else {	
			// 입력받은 값의 길이가 14일 때
			// 000000-'0'000000
			char i7 = number.charAt(7); // 입력받은 값에서 인덱스 7번 위치 문자를 추출
			
			if (i7 == '1' || i7 == '3') {
				System.out.println("남자입니다.");
			} else {
				System.out.println("여자입니다.");
			}		
		}
	}
	
	public static void method2() {
		/* 
		 * 문자를 입력받아 소문자인 경우 "{입력받은값}은 소문자입니다." 출력
		 * 대문자인 경우 "{입력받은값}은 대문자입니다." 출력
		 * 그렇지 않으면 "알파벳이 아닙니다." 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		if (ch >= 'a' && ch <= 'z') { // 입력받은 값이 a ~ z 사이인 경우
			System.out.printf("%c은 소문자입니다.\n", ch);
		} else if (ch >= 'A' && ch <= 'Z') {
			// 입력받은 값이 a ~ z 사이가 아니고, A ~ Z 사이인 경우
			System.out.printf("%c은 대문자입니다.\n", ch);
		} else {
			// 입력받은 값이 a ~ z 사이가 아니고, A ~ Z 사이도 아닌 경우
			System.out.println("알파벳이 아닙니다.");
		}
	}
	
	public static void method1() {
		/* 
		 * 사용자의 입력 값이 1 ~ 10 사이의 값인지 확인하여
		 * * 범위를 벗어난 경우 "범위를 벗어났습니다." 출력
		 * * 범위 내에 있는 경우 입력값을 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 10 사이 정수 입력 : ");
		int num = sc.nextInt();
		
		if (num >= 1 && num <= 10) {	// 범위 내에 있는 경우
			System.out.println(num);
		} else {						// 범위를 벗어난 경우
			System.out.println("범위를 벗어났습니다.");
		}		
	}

}
