package com.kh.object;

public class Method01 {

	public static void main(String[] args) {
		System.out.println("========= 프로그램 시작 =========");
		hiEveryOne(20); // 메소드 호출 : 메소드명([전달값]);
		hiEveryOne(50);
		System.out.println("========= 프로그램 종료 =========");
	}
	
	public static void hiEveryOne(int age) {
		// 반환형 : void, 결과 값 없음
		// 메소드명 : hiEveryOne
		// 매개변수 정보 : 1개, 정수형(int), age 변수
		System.out.println("=== hiEveryOne! ===");
		System.out.println("나이는 : " + age);
	}

}
