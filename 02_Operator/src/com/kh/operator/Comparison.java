package com.kh.operator;
import java.util.Scanner;

public class Comparison {
	/*
	 * 비교 연산자 (이항 연산자)
	 * 두 값을 비교 연산
	 * 연산 결과가 조건을 만족하면 true, 만족하지 않으면 false
	 * 
	 * * 종류
	 * - 대소 비교 연산자: <, >, <=, >=
	 * - 동등 비교 연산자: ==, !=
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 받은 두 정수의 값 비교
		System.out.print("정수1: ");
		int n1 = sc.nextInt();
		
		System.out.print("정수2: ");
		int n2 = sc.nextInt();
		
		System.out.println("첫번째 숫자와 두번째 숫자는 같은 값인가? " + (n1 == n2));
		System.out.println("첫번째 숫자가 두번째 숫자보다 큰가? " + (n1 > n2));
		System.out.println("두번째 숫자는 짝수인가? " + (n2 % 2 == 0));
		
		System.out.println("두번째 값은 'A'의 유니코드인가? " + (n2 == 'A'));

	}
}
