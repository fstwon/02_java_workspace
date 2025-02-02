package com.kh.practice.chap02.loop;
import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		// practice1();
		// practice2();
		// practice3();
		// practice4();
		// practice5();
		// practice6();
		// practice8();
		// practice10();
		// practice11();
		// practice12();
		practice13();
	}
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		// 정수 입력 받고 1부터 정수까지 모든 숫자 출력
		// 입력 정수 >= 1, 아닌 경우 "1 이상의 숫자를 입력해주세요"
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		// 정수 입력 받고 1부터 정수까지 모든 숫자 출력
		// 입력 정수 > 1, 아닌 경우 "1 이상의 숫자를 입력해주세요"
		// 다시 사용자 입력
		
		/*
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int i = 1;
		do {
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				System.out.print("1 이상의 숫자를 입력하세요 : ");
				num = sc.nextInt();
				continue;
			}
			System.out.print(i + " ");
			i++;
		} while(i <= num); 
		*/
		
		// 입력 받은 값이 1 이상이 아닐 때의 조건
		int num;
		do {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();	
			if(num >= 1) {
				for(int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		} while(num < 1);
	}
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		// 정수 입력 받고 입력 값부터 1까지 숫자 출력
		// 입력 값 >= 1
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");	
			}
		}
	}
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		// 정수 입력 받고 입력 값부터 1까지 숫자 출력
		// 입력 값 >= 1
		
		int num;
		do {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if(num >= 1) {
				for(int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");	
			}
		} while(num < 1);
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		// 정수 입력 받고 입력 값부터 1까지 숫자 출력
		// 입력 값 >= 1
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int total = 0;
		for(int i = 1; i <= num; i++) {
			total += i;
			System.out.print(i);
			/*
			if(i == 1) {
				System.out.printf("%d ", i);
			} else {
				System.out.printf("+ %d ", i);
			}
			*/
			if(i < num) {
				System.out.print(" + ");
			}
		}
		System.out.printf("= %d", total);
	}
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		// 두 개의 값 입력 후 두 숫자 사이의 값 모두 출력
		System.out.print("첫 번째 숫자 : ");
		int s = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int e = sc.nextInt();
		if(s >= 1 && e >= 1) {
			/*
			int min = Math.min(s, e);
			int max = Math.max(s, e);
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");	
			}
			*/
			int min;
			int max;
			if(s > e) {
				min = e;
				max = s;
			} else {
				min = s;
				max = e;
			}
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");	
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}
	}
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		// 두 개의 값 입력 후 두 숫자 사이의 값 모두 출력
		int s;
		int e;
		
		do {
			System.out.print("첫 번째 숫자 : ");
			s = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			e = sc.nextInt();
			if(s >= 1 && e >= 1) {
				int min;
				int max;
				if(s > e) {
					min = e;
					max = s;
				} else {
					min = s;
					max = e;
				}
				for(int i = min; i <= max; i++) {
					System.out.print(i + " ");	
				}
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		} while(s < 1 || e < 1);
	}
	public static void practice8() {
		Scanner sc = new Scanner(System.in);
		// 입력 받은 숫자의 구구단 출력
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.printf("===== %d단 =====\n", dan);
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		
	}
	public static void practice9() {
		Scanner sc = new Scanner(System.in);
		// 입력 받은 숫자의 구구단 출력
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else {			
			for(int i = dan; i <= 9; i++) {
				System.out.printf("===== %d단 =====\n", i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);				
				}
			}
		}
	}
	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		do {
			// 입력 받은 숫자의 구구단 출력
			System.out.print("숫자 : ");
			dan = sc.nextInt();
			if(dan > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			} else {			
				for(int i = dan; i <= 9; i++) {
					System.out.printf("===== %d단 =====\n", i);
					for(int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i * j);				
					}
				}
			}			
		} while(dan > 9);
	}
	public static void practice11() {
		Scanner sc = new Scanner(System.in);
		// 숫자, 공차 입력
		// 공차만큼 증가 또는 감소
		// 출력 숫자는 10개까지만
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int b = sc.nextInt();
		for(int i = 0; i < 10; i++) {
			System.out.print(num + " ");
			num += b;
		}
	}
	public static void practice12() {
		Scanner sc = new Scanner(System.in);
		// 정수 두개, 연산자 입력
		String opStr;
		char op;
		int num1;
		int num2;
		
		
		// 연산자에 따라 정수 계산 결과 출력
		do {
			System.out.print("연산자(+, -, *, /, %) : ");
			opStr = sc.next();
			if(opStr.equals("exit")) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			
			op = opStr.charAt(0);
			System.out.print("정수 1 : ");
			num1 = sc.nextInt();
			System.out.print("정수 2 : ");
			num2 = sc.nextInt();
			
			switch(op) {
				case '+':
					int calc = num1 + num2;
					System.out.printf("%d %c %d = %d\n", num1, op, num2, calc);
					break;
				case '-':
					calc = num1 - num2;
					System.out.printf("%d %c %d = %d\n", num1, op, num2, calc);
					break;
				case '*':
					calc = num1 * num2;
					System.out.printf("%d %c %d = %d\n", num1, op, num2, calc);
					break;
				case '/':
					if(num2 < 1) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						break;
					}
					calc = num1 / num2;
					System.out.printf("%d %c %d = %d\n", num1, op, num2, calc);
					break;
				case '%':
					calc = num1 % num2;
					System.out.printf("%d %c %d = %d\n", num1, op, num2, calc);
					break;
				default:
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
			System.out.println();
		} while(opStr != "exit");
	}
	public static void practice13() {
		Scanner sc = new Scanner(System.in);
		// 정수 두개, 연산자 입력
	}
}
