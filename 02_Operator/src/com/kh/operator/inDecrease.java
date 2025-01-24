package com.kh.operator;

public class inDecrease {
	public static void main(String[] args) {
		/*
		 * 증감연산자 (단항연산자)
		 * 
		 * ++: 값을 1씩 증가
		 * --: 값을 1씩 감소
		 * 
		 * * 처리 순서: 다른 연산자가 있을 경우 *
		 * - (증감연산자)변수: 전위연산 => "선증감" 후처리
		 * 				  ++변수, --변수
		 * - 변수(증감연산자): 후위연산 => 선처리 "후증감"
		 * 				  변수++, 변수--
		 */
		
		// method1();
		// method2();
		method3();
	}
	public static void method3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int r1 = a++;
		
		System.out.printf("a: %d, b: %d, c: %d, r1: %d\n", a, b, c, r1);
		// => r1: 10
		// => a: 11, b: 20, c: 30
		
		int r2 = (++a) + (b++);
		System.out.printf("r2: %d\n", r2);
		// => r2: 12 + 20 = 32
		// => a: 12, b: 21, c: 30
		
		int r3 = (a++) + (--b) + (--c);
		System.out.printf("r3: %d\n", r3);
		// => r3: 12 + 20 + 29 = 61
		// => a: 13, b: 20, c: 29
		
		System.out.printf("a: %d, b: %d, c: %d\n", a, b, c);
		// => a: 13, b: 20, c: 29
	}
	public static void method2() {
		int num1 = 20;
		int result1 = ++num1 * 3;
		System.out.printf("num1 : %d, result1: %d\n", num1, result1);
	
		int num2 = 20;
		int result2 = num2++ * 3;
		System.out.printf("num2: %d, result1: %d\n", num2, result2);
		// num2: 21, result2: 60
	}
	public static void method1() {
		int num1 = 10;
		System.out.println("num1: " + num1); // 10
		System.out.println("전위연산 1회 수행 (++num1): " + ++num1); // 11
		System.out.println("후위연산 1회 수행 (--num1): " + num1++); // 11
		System.out.println("최종 num1: " + num1); // 12
	}
}
