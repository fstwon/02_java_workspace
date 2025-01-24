package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		// scanner 생성
		Scanner sc = new Scanner(System.in);
		// 키보드로 문자 하나를 입력 받아 유니 코드로 출력
		// 문자 입력 받아 앞자리 값 가져오기
		System.out.print("문자 : ");
		String inputStr = sc.nextLine();
		char inputWord = inputStr.charAt(0);
		
		// 유니코드로 출력하기(형변환)
		int inputWordUnicode = (int)inputWord; // 강제 형변환
		System.out.println(inputWord + " unicode : " + inputWordUnicode);
		System.out.printf("%c unicode : %d", inputWord, inputWordUnicode);
	}
}
