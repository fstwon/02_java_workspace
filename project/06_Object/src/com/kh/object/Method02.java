package com.kh.object;

public class Method02 {

	public static void main(String[] args) {
		System.out.println(add(10, 20));

	}
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	public static int add(int n1) {
		return n1 + 10;
	}
	/*
	// 반환형과 상관 없이 메소드명과 매개변수 정보가 같으면 오버로딩 적용 x
	public static double add(int num) {
		return num;
	} 
	*/
	public static void divide(int n1 , int n2) {
		// n2 변수의 값이 0인 경우 메소드 종료
		if(n2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("n1 / n2 : " + (n1 / n2));
	}
}
