package com.kh.loop;

public class While {
	/*
	 * while문
	 * 
	 * [표현식]
	 * 			// [초기식]	// => 생략 가능!
	 * 			while(조건식) {
	 * 				// 반복적으로 수행할 코드
	 * 
	 * 				// [증감식]	// => 생략 가능!
	 * 			}
	 * 
	 * 	* 실행 순서
	 * 	조건식 검사 -> 조건식의 결과가 true인 경우 중괄호 안의 코드 수행
	 * 	-> 조건식 검사 -> 조건식의 결과가 true인 경우 중괄호 안의 코드 수행
	 *  ------------- 계속 반복 ---------------------------------
	 *  -> 조건식 검사 -> 조건식의 결과가 false인 경우 반복문 종료
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method1();
		method2();
	}
	
	public static void method2() {
		// For 클래스의 method5 예제를 while문을 사용하여 작성!
		// => 랜덤값까지의 총 합
		int random = (int)(Math.random() * 10 + 1); // 1 ~ 10
		
		int total=0;	// 총 합을 계산하기위한 변수
		int i=1;		// 초기식
		while(i<=random) {		// 조건식
			/*
			total += i;	// 1부터 랜덤값까지 합
			i++;		// 증감식
			*/
			total += i++;
		}
		System.out.printf("%d까지의 총합 : %d", random, total);
	}
	
	public static void method1() {
		// "Happy" 문장을 5번 출력
		int i=10;		// 초기식
		while(i > 5) {	// 조건식
			System.out.println("Happy");
			i--;		// 증감식
		}
	}

}
