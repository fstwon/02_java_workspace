package com.kh.object;

public class Method01 {
	/*
	 * 메소드(Method) : 클래스 내부에 있는 함수. 기능.
	 * 
	 * 	[표현법]
	 * 
	 * 			접근제한자 예약어 반환형 메소드명(매개변수 정보) {
	 * 
	 * 				// 함수에서 실행할 내용(코드)
	 * 
	 * 			}
	 */

	public static void main(String[] args) {
		System.out.println("======== 프로그램 시작 =========");

		hiEveryOne(20);
		// => 메소드 호출 : 메소드명([전달값]);
		hiEveryOne(50);
		
		System.out.println("======== 프로그램 종료 =========");
	}
	
	public static void hiEveryOne(int age) {
		// 반환형 : void (=> 결과 값이 없음을 의미!)
		// 메소드명 : hiEveryOne
		// 매개변수 정보 : 1개. 정수형(int) age 변수.
		//  => 메소드 호출 시 전달되는 값을 저장하는 변수
		System.out.println("=== hiEveryOne! ===");
		System.out.println("나이는 : " + age);
	}

}
