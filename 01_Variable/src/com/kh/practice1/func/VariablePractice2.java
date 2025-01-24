package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice2 {
	public static void main(String[] args) {
		// scanner 생성
		Scanner sc = new Scanner(System.in);
		// 정수 두개 입력
		System.out.print("첫 번째 정수: ");
		int firstInt = sc.nextInt();
		System.out.print("두 번째 정수: ");
		int secondsInt = sc.nextInt();
		
		// 더하기 결과
		int addResult = firstInt + secondsInt;
		System.out.println("더하기 결과: " + addResult);
		
		// 빼기 결과
		int subResult = firstInt - secondsInt;
		System.out.println("빼기 결과: " + subResult);
		
		// 곱하기 결과
		int timesResult = firstInt * secondsInt;
		System.out.println("곱하기 결과: " + timesResult);
		
		// 나누기 결과 
		int divResult = firstInt / secondsInt;
		System.out.println("나누기 몫 결과: " + divResult);
	}
}
