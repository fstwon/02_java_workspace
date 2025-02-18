package com.kh.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		method3();
	}
	public static void method3() {
		// 예외 발생 시키기
		try {
			throw new MyException("직접 정의한 예외 발생");
		} catch(MyException e) {
			System.out.println("직접 정의한 예외 발생");
			System.out.println(">> " + e.getMessage());
		}
	}
	public static void method2() {
		// Checked Exception
		// 반드시 예외 처리가 필요한 오류 (예외)
		// 에러가 예측이 불가능한 영역에서 발생하기 때문에 필수로 예외 처리가 필요하다.
		// 외부 매체와의 입출력 입력 시 발생
		
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			str = br.readLine();
		} catch(Exception e) {
			System.out.println("IOException 발생");
			System.out.println(">> " + e.getMessage());
		}
	}
	public static void method() {
		Scanner sc = new Scanner(System.in);
		// Unchecked Exception
		// 필수적인 예외 처리가 아니지만 프로그램 실행 중 발생 가능성이 있는 오류 (예외)
		try {
			System.out.print("a / b ...  a? ");
			int a = sc.nextInt();
			
			System.out.print("a / b ...  b? ");
			int b = sc.nextInt();
			
			System.out.printf("%d / %d = %d\n", a, b, a / b);
		} catch(ArithmeticException e) {
			// System.out.println(e instanceof Exception);
			// System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(InputMismatchException e) {
			System.out.println("오류 내용 : " + e.getMessage());;
		}
		System.out.println("프로그램 종료");
	}
}
