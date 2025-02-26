package com.kh.generic.ex5;

public class Run {

	public static void main(String[] args) {

		GenericMethod.<Double>test(777.2);
		
		GenericMethod.<Integer>test(10);
		
		GenericMethod.<String>test("hi");
		
		GenericMethod.<Character>test('a');
		// GenericMethod.<Character>test("a");	
		// => Character 타입의 데이터가 전달되지 않아 오류 발생!
		
		GenericMethod gm = new GenericMethod();
		gm.<String>test("abs");
		gm.<Integer>test(10);
	}
}

class GenericMethod {
	// * 제네릭 메소드
	//   : 특정 메소드 내에서 타입을 전달받아 적용
	/*
	 * 	// 타입 매개변수 선언 <T>
	 *   접근제한자 [예약어] "<T>" 반환형 메소드명(매개변수정보) {
	 *   }
	 *   // => T라는 변수를 사용해서 매개변수타입, 반환타입, 지역변수타입으로 사용 가능!
	 */
	public static <T> void test(T n) {
		// public static <T extends Number> void test(T n) {
		// => Number 클래스 타입과 상속관계인 타입만 전달할 수 있도록 제한!!
		System.out.println(n);
	}
}




