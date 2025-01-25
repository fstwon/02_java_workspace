package com.kh.condition;
import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		// method1();
		// method2();
		method3();
	}
	public static void method3() {
		/*
		 * 주민번호를 입력 받은 후 남/여 출력
		 * (단, `-`를 포함해서 입력받은 값의 길이가 14가 아닌 경우 "잘못 입력되었습니다." 출력
		 * 
		 * * 문자열 길이 확인 메소드, str.length();
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민 등록 번호를 입력해주세요.: ");
		String resNum = sc.next();
		
		if(resNum.length() != 14) {
			System.out.print("잘못 입력되었습니다.");
		} else {
			char genderId = resNum.charAt(7);
			if(genderId == '1' || genderId == '3') {
				System.out.print("남");
			} else if(genderId == '2' || genderId == '4') {
				System.out.print("여");
			} else {
				System.out.print("잘못 입력되었습니다.");
			}
		}
		
	}
	public static void method2() {
		/*
		 * 문자를 입력 받아 
		 * 소문자인 경우 "{입력 받은 값}은 소문자입니다." 출력
		 * 대문자인 경우 "{입력 받은 값}은 대문자입니다." 출력
		 * 그렇지 않으면 "알파벳이 아닙니다." 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문 대/소문자를 입력해주세요. : ");
		String inputStr = sc.next();
		char inputChar = inputStr.charAt(0);
		
		// 문자로도 비교할 수 있다. 'a' ~ 'z'
		if('a' <= inputChar && inputChar <= 'z') {
			// 입력 받은 값이 a ~ z 사이인 경우
			System.out.printf("%c은 소문자입니다.", inputChar);
		} else if('A' <= inputChar && inputChar <= 'Z') {
			// 입력 받은 값이 A ~ Z 사이인 경우
			System.out.printf("%c은 대문자입니다.", inputChar);
		} else {
			// 입력 받은 값이 a ~ z, A ~ Z 모두 아닌 경우 
			System.out.print("알파벳이 아닙니다.");
		}
	}
	public static void method1() {
		/*
		 * 사용자의 입력 값이 1 ~ 10 사이의 값인지 확인 후 
		 * 범위를 벗어난 경우 "범위를 벗어났습니다." 문자열 출력
		 * 범위 내 있는 경우 입력 값 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 10 사이 정수를 입력해주세요: ");
		int inputNum = sc.nextInt();
		String result = "범위를 벗어났습니다.";
		
		if(1 <= inputNum && inputNum <= 10) {
			result = "입력 값: " + inputNum;
		}
		
		System.out.println(result);
	}

}
