package com.kh.loop;

public class Break {

	public static void main(String[] args) {
		// method1();
	}
	public static void method1() {
		// 랜덤 값 (1 ~ 100) 추출 후 출력
		// 추출한 랜덤 값이 짝수일 때 반복문 종료 
		while(true) {
			int random = (int)(Math.random() * 100 + 1);
			System.out.println("랜덤 값 : " + random);
			if(random % 2 == 0) {
				System.out.println("종료 : " + random);
				break;
			}
		}
	}
}
