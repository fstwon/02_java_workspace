package com.kh.loop;

public class Continue {

	public static void main(String[] args) {
		method2();

	}
	public static void method1() {
		// 1 ~ 10 사이 정수 중 짝수만 출력
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
                 			}
			System.out.print("짝수 : ");
			System.out.println(i);
		}
	}
	public static void method2() {
		// TODO: 1부터 100까지 총 합
		// 3의 배수 또는 5의 배수는 제외
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				continue;
			}
			total += i;
		}
		System.out.println("1 ~ 100까지 총 합 (3, 5 배수 제외) : " + total);
	}
}
