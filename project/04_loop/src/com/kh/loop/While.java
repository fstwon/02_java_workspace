package com.kh.loop;
import java.util.Scanner;
public class While {
	public static void main(String[] args) {
		// method1();
		method2();
	}
	public static void method1() {
		// "Happy" 문장 5번 출력
		int i = 10;
		while(i > 5) {
			System.out.println("Happy");
			i--;
		}
	}
	public static void method2() {
		// 1 ~ 10 중 랜덤 값까지 총 합
		int random = (int)(Math.random() * 10 + 1);
		int i = 1;
		int total = 0;
		while(i <= random) {
			total += i++;
			/*
			total += i;
			i++;
			*/
		}
		System.out.printf("1 ~ %d 까지 총 합 : %d", random, total);
	}
}
