package com.kh.exception;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		method();
	}
	public static void method() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("a / b ...  a? ");
			int a = sc.nextInt();
			
			System.out.print("a / b ...  b? ");
			int b = sc.nextInt();
			
			System.out.printf("%d / %d = %d\n", a, b, a / b);
			
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());;
		} finally {
			System.out.println("프로그램 종료");
			
		}
	}
}
