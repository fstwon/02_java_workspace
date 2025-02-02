package com.kh.loop;
import java.util.Scanner;



public class For {
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
	public static void method1() {
		// 반복문 없이 "Happy" 5번 출력
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		// for문 사용
		/*
		for(int i = 0; i < 5; i++) {
			System.out.println("Happy");	
		}
		*/
		for(int i = 1; i <= 5; i++) {
			System.out.println("Happy");
		}
	}
	public static void method2() {
		// TODO: for문을 사용하여 10부터 1까지 출력
		System.out.print("출력 결과 : ");
		for(int i = 10; i > 0; i--) {
			if(i == 1) {
				System.out.print(i);
				break;
			}
			System.out.print(i + " ");
		}
	}
	public static void method3() {
		// 1부터 10까지 총 합 출력
		int result = 0;
		for(int i = 1; i <= 10; i++) {
			result += i;
		}
		System.out.print(result);
	}
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		// TODO: 사용자로부터 1 ~ 10 사이 정수 입력
		System.out.print("1 ~ 10 사이의 정수를 입력해 주세요 : ");
		int inputNum = sc.nextInt();
		// 1부터 입력 받은 값까지의 총 합
		if(1 <= inputNum && inputNum <= 10) {
			int total = 0;
			for(int i = 1; i <= inputNum; i++) {
				total += i;
			}
			System.out.printf("1부터 %d까지의 총 합: %d\n", inputNum, total);
		} else {
			System.out.print("범위를 벗어난 값이 입력되었습니다.");
		}
	}
	public static void method5() {
		/*
		 * 1 ~ 랜덤 값까지 총합 출력 
		 * 랜덤 값 구하기
		 * Math : java.lang.math
		 * Math.random(); 호출
		*/
		int random = (int)(Math.random() * 10 + 1);
		int total = 0;
		for(int i = 1; i <= random; i++) {
			total += i;
		}
		
		System.out.printf("1부터 %d까지의 총 합: %d", random, total);
	}
	public static void method6() {
		final String STR = "Story";
		// 각 인덱스(위치) 별 문자를 한 줄씩 출력
		/*
		 * 출력 결과 :
		 * S
		 * t
		 * o
		 * r
		 * y
		 */
		System.out.println("출력 결과 : ");
		for(int i = 0; i < STR.length(); i++) {
			char ch = STR.charAt(i);
			System.out.println(ch);
		}
	}
	public static void method7() {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 2 ~ 9 사이의 정수를 입력
		System.out.print("2 ~ 9 사이의 정수를 입력해주세요. : ");
		int inputNum = sc.nextInt();
		if(2 <= inputNum && inputNum <= 9) {
			// 해당 단에 해당하는 구구단 출력
			for(int i = 1; i <= 9; i++) {
				int times = inputNum * i;
				System.out.printf("%d x %d = %d\n", inputNum, i, times);
			}
		} else {
			System.out.print("입력 범위를 벗어났습니다.");
		}
	}
	public static void method8() {
		// 2단부터 9단까지 출력
		// 세로 출력
		/*
		for(int i = 2; i <= 9; i++) {
			System.out.printf("%d단\n", i);
			for(int j = 1; j <= 9; j++) {
				int times = i * j;
				System.out.printf("%d x %d = %d\n", i, j, times);
			}
		}		
		*/
		// 가로 출력
		for(int i = 2; i <= 9; i++) {
			System.out.printf("%d단\t\t", i);
		}
		System.out.println();
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}
	}
}
