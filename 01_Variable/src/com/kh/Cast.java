package com.kh;

public class Cast {
	
	/*
	 * 형 변환: 값의 자료형을 변환하는 것
	 * * 컴퓨터에서 데이터 값을 처리하는 규칙(형변환이 필요한 시점/상황)
	 * 1) 대입 연산자: 변수와 데이터가 같은 자료형이어야 함
	 * 				=> 다른 자료형의 데이터 대입이 필요한 경우 필수로 형 변환이 필요함
	 * 				자료형 변수명 = (자료형)값;
	 * 2) 자료형이 동일해야 연산이 가능
	 * 	  결과 값 = 값1 + 값2;
	 * 	  => 값1, 값2, 결과 값 모두 동일한 자료형이어야 함
	 */
	public static void main(String[] args) {
		// autoCasting();
		forceCasting();

	}
	public static void autoCasting() {
		/* 자동 형변환 정리
		 * 값의 범위가 작은 자료형에서 큰 자료형으로 자동 형변환
		 * 
		 * byte(1B) - short(2B) - int(4B) - long(8B) - float(4B) - double(8B)
		 * 
		 * 			  char(2B)
		 */
		// 정수형 변수 i1에 12라는 값 저장
		int i1 = 12;
		
		// 실수형 변수 d1에 i1의 값을 저장
		double d1 = i1; // int => double
						// 12 => 12.0
		System.out.println("d1: " + d1);
		int i2 = 15;
		 double d2 = 3.3;
		 double result = i2 + d2;
		// i2 (int) => (double)
		// 15 => 15.0
		// i2 + d2 => (int) + (double) => (double) + (double)
		System.out.println("result: " + result);
		
	}
	public static void forceCasting() {
		/*
		 * 강제 형변환 
		 * 자동 형변환이 되지 않는 경우, 직접 형변환을 해주는 것
		 * 값의 범위가 큰 자료형에서 작은 자료형으로 변환이 필요할 떄
		 * 
		 * (변환할 자료형)변환할대상
		 * => 변환대상: 값, 변수, ... 
		 */
		// 실수형 d1 변수에 4.0 값 저장 
		double d1 = 4.7;
		
		// 정수형 i1 변수에 50 값 저장
		int i1 = 50;
		
		// d1 변수와 i1 변수의 합을 정수형 result 변수에 저장
		// double d1을 int로 강제 형변환 후 연산
		int result = (int)d1 + i1;
		// int i1을 double로 자동 형변환 후 연산한 값을 int형으로 강제 형변환
		// int result = (int)(d1 + i1);
		
		// 강제 형변환은 데이터 손실이 발생할 수 있기 때문에 
		// 데이터 손실을 최대한 줄일 수 있는 방법을 선택해야 함
		
		System.out.println("result: " + result);
		
		// * 강제 형변환 시 데이터 손실이 발생될 수 있음
		int i2 = 290;
		byte i3 = (byte)i2;
		// i3(byte) = i2 (int) => 강제 형변환 필요
		// byte 값의 범위: -128 ~ 127
		System.out.println("i3: " + i3);
	}	
	
	
}