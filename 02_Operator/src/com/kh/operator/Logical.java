package com.kh.operator;
import java.util.Scanner;

public class Logical {
	/*
	 * 논리 연산자(이항 연산자)
	 * 두 개의 논리 값을 연산(true/false)
	 * 결과 값도 논리 값
	 * 
	 * * 종류: &&, ||
	 * - A && B: A, B 모두 true 값이어야 결과 값 true
	 *   true && true   => true
	 *   true && false  => false
	 *   false && true  => false
	 *   false && false => false
	 *   
	 * - A || B: A 또는 B 둘 중 하나라도 true면 결과 값 true
	 *   true || true   => true
	 *   true || false  => true
	 *   false || true  => true
	 *   false || false => false
	 * 
	 *  * 주의 사항, SCE(Short-Circuit Evaluation)
	 *  - && 연산자: 첫 번째 조건이 false면 두 번째 조건은 연산이 실행되지 않는다.
	 *  - || 연산자: 첫 번째 조건이 true면 두 번째 조건은 연산이 실행되지 않는다.
	 */
	public static void main(String[] args) {
		// method1();
		method2();
	}
	public static void method2() {
		// 입력 받은 문자가 소문자인지 확인
		// 'a': 97 ~ 'z': 122
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자를 입력해주세요: ");
		String inputStr = sc.next();
		char inputChar = inputStr.charAt(0);
		
		boolean result = (inputChar >= 97) && (inputChar <= 122);
		System.out.println("입력 받은 문자는 소문자입니까? " + result);
		
		boolean result2 = (inputChar >= 'a') && (inputChar <= 'z');
		System.out.println("입력 받은 문자는 소문자입니까? " + result2);
	}
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		// 입력 받은 값이 1 ~ 10 사이의 값인지 확인
		// 정수 입력 받기 
		System.out.print("정수를 입력하세요: ");
		int inputNum = sc.nextInt();
		boolean result = ((inputNum >= 1) && (inputNum <= 10));
		System.out.println("inputNum이 1 ~ 10 사이의 값인가? " + result);
		
		boolean result2 = (inputNum < 1) || (inputNum > 10);
		System.out.println("inputNum이 1 ~ 10 사이의 값이 아닌가? " + result2);
	}
}
