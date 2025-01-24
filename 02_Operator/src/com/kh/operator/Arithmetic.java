package com.kh.operator;

public class Arithmetic {
	/*
	 * 산술연산자(이항연산자)
	 * => +, -, *, /, %
	 * 
	 * 우선 순위: *, /, % > +, -
	 * 
	 */
	public static void main(String[] args) {
		// method1();
		method2();
	}
	public static void method2() {
		int a = 5;
		int b = 10;
		
		int c = (++a) + b; 
		System.out.println("c: " + c);
		// => c: 6 + 10 = 16
		// => a: 6, b: 10, c: 16
		
		int d = c / a;
		System.out.println("d: " + d);
		// => d: 16 / 6 = 2
		// => a: 6, b: 10, c: 16, d: 2
		
		int e = c % a;
		System.out.println("e: " + e);
		// => e: 16 % 6 = 4
		// => a: 6, b: 10, c: 16, d: 2, e: 4
		
		int f = e++;
		System.out.println("f: " + f);
		// => f: 4
		// => a: 6, b: 10, c: 16, d: 2, e: 5, f: 4
		
		int g = (--b) + (d--);
		System.out.println("g: " + g);
		// => g: 9 + 2 = 11
		// => a: 6, b: 9, c: 16, d: 1, e: 5, f: 4, g: 11
		
		int h = 2;
		System.out.println("h: " + h);
		// => h: 2
		// => a: 6, b: 9, c: 16, d: 1, e: 5, f: 4, g: 11, h: 2
				
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		System.out.println("i: " + i);
		// => i: 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
		// => i: 6 + 9 / 3 * 10 % 8
		// => i: 6 + 3 * 10 % 8
		// => i: 6 + 30 % 8
		// => i: 6 + 6
		// => i: 12
		// => a: 7, b: 9, c: 15, d: 1, e: 6, f: 4, g: 10, h: 2, i: 12
		
		System.out.printf(
				"a: %d, b: %d, c: %d, d: %d, e: %d,"
				+ " f: %d, g: %d, h: %d, i: %d",
				a, b, c, d, e, f, g, h, i);
		// => a: 7, b: 9, c: 15, d: 1, e: 6, f: 4, g: 10, h: 2, i: 12	
	}
	public static void method1() {
		int n1 = 10;
		int n2 = 3;
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));
		
		// 나머지 연산자 (%) -> 짝수/홀수 판별
		// (변수 % 2 == 0) -> 짝수
		// (변수 % 2 != 0) -> 홀수
		// => !(변수 % 2 == 0)
		
		System.out.printf("n1의 값은 짝수인가? %b\n", (n1 % 2 == 0));
		System.out.printf("n2의 값은 짝수인가? %b\n", (n2 % 2 == 0));
	}
}
