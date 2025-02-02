package com.kh.loop;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		method1();
	}
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 입력받은 정수를 계속해서 더하는 프로그램
		// 단, 0을 입력받으면 종료
		// 종료 후 최종 합 출력
		int num;
		int sum = 0;
		do {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			sum += num;
			System.out.print("현재 합 : " + sum + "\n");
		} while(num != 0);
		
		System.out.println("총 합 : " + sum);
	}
}
