package com.kh.api;

public class API03_Wrapper {

	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 200;
		
		// Boxing
		// 1. 객체 생성 구문
		Integer i1 = new Integer(n1);
		Integer i2 = new Integer(n2);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교하여 -1, 0, 1 의 값 반환
		
		// 2. 객체 생성 구문 없이 사용
		Integer i3 = n1; // auto-boxing
		
		// * 객체 생성을 통해 변환해야 하는 경우
		Integer i4 = new Integer("300");
		Integer i5 = Integer.parseInt("300");
		
		
		// Unboxing
		// 1. Wrapper 클래스의 자료형Value() 메소드 사용
		int n3 = i3.intValue(); 
		int n4 = i4.intValue();
		
		// 2. 메소드를 사용하지 않고 대입
		int n5 = i5; // auto-unboxing
		
		// String과의 변환
		
		// String -> 기본 자료형
		String str1 = "10";
		String str2 = "33.5";
		
		// str1 + str2 를 정수형으로 처리하기
		// Wrapper클래스의 parse자료형() 메소드 사용
		int num = Integer.parseInt(str1);
		double dNum = Double.parseDouble(str2);
		System.out.println(num + dNum);
		
		// 기본 자료형 -> String
		System.out.println(num + "");
		System.out.println(String.valueOf(num));
		System.out.println(String.valueOf(dNum));
	}
}




















