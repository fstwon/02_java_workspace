package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice4 {
	public static void main(String[] args) {
		// scanner 생성
		Scanner sc = new Scanner(System.in);
		
		// 영어 문자열 입력
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		
		// 앞에서 세개 하나씩 출력
		// 첫 번째 문자
		char firstWord = str.charAt(0);
		System.out.println("첫 번째 문자: " + firstWord);
		
		// 두 번째 문자
		char secondsWord = str.charAt(1);
		System.out.println("두 번째 문자: " + secondsWord);
		
		// 세 번째 문자
		char thirdWord = str.charAt(2);
		System.out.println("세 번째 문자: " + thirdWord);
		
	}
}
