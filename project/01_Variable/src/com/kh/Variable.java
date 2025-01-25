package com.kh;

public class Variable {
	// 자바 실행 시 꼭 필요한 메소드 : main
	public static void main(String[] args) {
		// printVarible();
		declareVariable();
	}
	public static void declareVariable() {
		/*
		 * 변수 선언: 값을 기록하기 위한 변수를 메모리 공간에 할당(확보)
		 * 
		 * [표현식]
		 * 자료형 변수명;
		 * - 자료형: 변수의 크기 및 모양을 지정하는 부분
		 * - 변수명: 변수의 이름을 부여하는 부분 (의미 부여)
		 * 
		 * *****
		 * 명명 규칙 
		 * [1] camel Case: 소문자로 시작, 다른 단어 연결은 대문자로 시작
		 * 				   => 클래스명의 경우 대문자로 시작
		 * [2] 영문 대/소문자 구분 
		 * [3] 숫자로 시작할 수 없음
		 * [4] 예약어(키워드)와 같은 변수명 사용 불가
		 * [5] "_", "$"를 제외한 특수문자 사용 불가
		 * 
		 * *****
		 * 주의 사항
		 * - 같은 영역 안에서 변수명 중복 선언 불가 
		 * - 해당 영역 안에서 선언된 변수는 선언된 영역 안에서만 사용 가능
		 */
		// 정수형 변수 num에 10을 할당 
		int num = 10;
		// int num = 20; 중복 선언 불가
		int num2 = 20;
		
		// -----
		// 1. 논리형(boolean): 논리값(true/false)
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("isTrue 변수의 값: " + isTrue);
		System.out.println("isFalse 변수의 값: " + isFalse);
		
		isTrue = 1 + 3 > 1; // isTrue 값: true
		System.out.println("1 + 3 > 1: " + isTrue);
		isFalse = 2 + 3 < 0; // isFalse 값: false
		System.out.println("2 + 3 < 0: " + isFalse);
		// ----- 
		// 2. 숫자(정수형/실수형)
		// 2-1) 정수형: 소수점이 포함되지 않는 숫자
		//		byte(1B) / short(2B) / int(4B)* /long(8B)
		byte bNum; // byte: -128 ~ 127, 범위를 벗어나면 오류 발생
		bNum = -128;
		
		// 2-2) 실수형: 소수점이 포함된 숫자
		//		float(4B) / double(8B)*
		float fNum = 0.0f;	// 0.0 값을 저장, 
						   	// 소숫점 7자리까지 표현 가능
						   	// 값(리터럴)을 저장할 때 값 뒤에 f를 붙여준다.
		double dNum = 0;   	// 0.0 값을 저장
							// 소숫점 15자리까지 표현 가능
							// 실수형의 기본 자료형*
		// ----- 
		// 3. 문자형(char/String)
		// 3-1) 문자: char(2B)
		char ch = 'a';
		char kim = '한';
		
		// 3-2) 문자열: String (참조 자료형)
		String str;
		str = "문자열";
		System.out.println("str 변수의 길이: " + str.length());
		
		// 상수: 변하지 않는 값을 저장하는 공간 
		// [표현식]
		// final 자료형 변수명;
		
		// TODO: 나이를 저장하기 위한 상수 AGE 선언
		final int AGE;
		AGE = 20;
		// AGE = 30;
		System.out.println("Math.PI: " + Math.PI);
		
		// [참고]
		int sample = 999_999_999;
		System.out.println("underbar sample: " + sample);
	}
	
	public static void printVarible() {
		// System.out.println(num); // 다른 영역에 있는 변수 사용 불가
		/*
		 * 변수의 목적?
		 * - 데이터(값)을 저장하기 위한 공간
		 * - 가독성 증가 (의미 있는 변수 명 작성)
		 * - 재사용성 증가 (한번 저장된 값을 필요할 때마다 변수명을 통해 가져올 수 있음)
		 * - 유지보수 용이 (변수에 저장된 값 변경 가능)
		 */
		// 월급 계산 = 시급 * 근무 시간 * 근무 일수
		// *출력 형식* => 이름: 0원
		// * 2025 한국 최저 시급: 10050
		System.out.println("김철수:" + 10050 * 8 * 14 + "원");
		System.out.println("카리나:" + 10050 * 4 * １４ + "원");
		System.out.println("설운도:" + 10050 * 8 * １4 + "원");
		System.out.println("테스형:" + 10050 * 6 * 14 + "원");
		
		// 변수 사용 
		int pay = 10050;
		int time = 8;
		int day = 14;
		
		System.out.println("---------- 구분선 ----------");
		System.out.println("김철수:" + pay * time * day + "원");
		
		System.out.println("카리나:" + pay * time * day + "원");
		System.out.println("설운도:" + pay * time * day + "원");
		System.out.println("테스형:" + pay * time * day + "원");
	}
}
