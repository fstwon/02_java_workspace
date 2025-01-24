package com.kh;

import java.util.Scanner;

public class CastPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자 : ");	// "문자 : " 내용을 콘솔창에 출력
		String in = sc.next();	// 문자열을 입력받아 in이라는 변수에 저장
		
		// 문자(char) -> 정수(int)
		char ch = in.charAt(0);	// 문자열변수 in에 저장된 값 중 첫번째 위치의 글자를 추출
		
		// "{입력받은값} unicode : {정수값}" 형식으로 출력
		// println 메소드
		System.out.println(ch + " unicode : " + (int)ch);
		// printf 메소드
		System.out.printf("%c unicode : %d\n", ch, (int)ch);
	}

}
