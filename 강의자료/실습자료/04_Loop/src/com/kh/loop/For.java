package com.kh.loop;

import java.util.Scanner;

public class For {
	/*
	 * 반복문 : 프로그램 흐름을 제어하는 제어문 중 하나로
	 * 		   특정 코드를 반복적으로 수행하는 문법
	 * 
	 * * for 문 *
	 * [표현식]
	 * 			for(초기식;조건식;증감식) {
	 * 				// 반복적으로 수행할 코드
	 * 			}
	 * 
	 * 	* 초기식 : 반복문이 수행될 때 "최초" 한번만 실행되는 구문
	 *  * 조건식 : 반복문이 "수행될 조건"을 작성하는 구문
	 *  	- 조건식의 결과가 true일 때 -> 중괄호 안의 코드 수행
	 *  	- 조건식의 결과가 false일 때 -> 반복문 종료
	 *  * 증감식 : 반복문을 제어하는 변수의 값을 증감시키는 구문
	 *  ==> 보통 초기식, 조건식, 증감식에서 사용되는 변수가 동일!
	 *  
	 *  [for문 실행 순서]
	 *  초기식 -> 조건식 검사 -> true인 경우 반복할 코드 수행 -> 증감식
	 *  	  -> 조건식 검사 -> true인 경우 반복할 코드 수행 -> 증감식
	 *        ----- 계속 반복 -----------------------------------
	 *        -> 조건식 검사 -> false인 경우 반복문 종료
	 *        
	 *  * 참고 : 초기식, 조건식, 증감식 생략 가능!
	 *         => 세미콜론(;)은 필수로 입력!
	 *    - 증감식 생략 : for(초기식;조건식;) {}
	 *    - 초기식 생략 : for(;조건식;증감식) {}
	 *    - 조건식 생략 : for(초기식;;증감식) {}
	 *    - 모두 생략 : for(;;) {}
	 */
	public static void main(String[] args) {
		// method1();
		// method2();
		// method3();
		// method4();
		// method5();
		// method6();
		// method7();
		method8();
	}
	
	public static void method8() {
		// 2단부터 9단까지 출력 => 중첩 반복문 사용!
		/*
		// 세로로 출력
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
		}
		*/
		// 가로로 출력
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.printf("%d x %d = %d\t", dan, i, dan*i);
			}
			System.out.println();
		}
	}
	
	public static void method7() {
		// 사용자에게 2 ~ 9 사이의 정수를 입력받아
		// 해당 단을 출력하기
		// ex) 3 입력 시
		//     3 x 1 = 3
		//	   3 x 2 = 6
		// ...
		//     3 x 9 = 27
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 ~ 9 사이 정수 입력 : ");
		int dan = sc.nextInt();
		
		if (2 <= dan && dan <= 9) {
			// 입력된 값의 단을 출력
			for (int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
		} else {
			System.out.println("입력 범위를 벗어났습니다.");
		}
	}
	
	public static void method6() {
		final String STR = "Story";
		// 각 인덱스(위치) 별 문자를 한 줄씩 출력
		// => 문자열 길이 : 문자열.length()
		// => 문자열의 인덱스 위치의 문자 조회 : 문자열.charAt(인덱스)
		/*
		 출력 결과:
		 S
		 t
		 o
		 r
		 y
		 */
		for(int i=0; i<STR.length(); i++) {
			char ch = STR.charAt(i);
			System.out.println(ch);
		}
	}
	
	public static void method5() {
		// 랜덤값을 조회하여 1부터 해당 값까지의 총 합
		/*
		 * [랜덤값 구하는 방법]
		 * - Math : java.lang.Math
		 * 	 		random()
		 *   => Math.random() 호출하여 사용
		 *      0.0 ~ 0.9999999 ( 0.0 <= random값 < 1.0 )
		 */
		// Math.random() * 10      // 0.0 ~ 9.999999
		// Math.random() * 10 + 1  // 1.0 ~ 10.9999999
		// (int)(Math.random() * 10 + 1) // 1 ~ 10
		int random = (int)(Math.random() * 10 + 1);
		// => 1 ~ 10 사이의 랜덤값이 저장될 것임!
		int total = 0;
		for(int i=1; i<=random; i++) {
			total += i;
		}
		System.out.printf("%d까지의 총합 : %d\n", random, total);
	}
	
	public static void method4() {
		// TODO: 사용자로부터 1~10 사이의 정수를 입력받아
		// 1부터 입력받은 값까지의 총 합을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 10 정수 입력 : ");
		int num = sc.nextInt();
		
		// 1 ~ 10 사이의 값인지 확인
		if (1 <= num && num <= 10) {
			// 1부터 입력받은값(num)까지의 총 합 계산
			int total = 0;
			for(int i=1; i<=num; i++) {
				total += i;
			}
			System.out.printf("1부터 %d까지의 총 합: %d\n", num, total);
		} else {
			System.out.println("범위를 벗어난 값이 입력되었습니다!");
		}
	}
	
	public static void method3() {
		// TODO: 1부터 10까지의 총 합을 구해서 출력
		int total = 0;
		for(int i=1; i<=10; i++) {
			total += i;
			// System.out.println("total: " + total + ", i : " + i);
		}
		System.out.println("총 합: " + total);
		/*
		 for (int i=10; i>0; i--) {}
		 */
	}
	
	public static void method2() {
		// 반복문(for)을 사용하여 10부터 1까지 출력
		// 출력 결과 : 10 9 8 7 6 5 4 3 2 1
		for(int i=10; i>0; i--) {
			System.out.print(i);
			if (i > 1) {
				System.out.print(" ");
			}
		}
	}
	
	public static void method1() {
		// "Happy" 5번 출력
		/*
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		*/
		// => for문을 사용하여 출력
		/*
		for(int i=0; i<5; i++) {
			System.out.println("Happy");
		}
		*/
		/*
		for(int i=1;i<6;i++) {
			System.out.println("Happy");
		}
		*/
		int i;
		for(i=0; i<5; i++) {
			System.out.println(i+": Happy");
		}
		System.out.println(i);
		// 반복문 종료 후 i값을 확인하고자 할 경우..?
		
	}
	
}
