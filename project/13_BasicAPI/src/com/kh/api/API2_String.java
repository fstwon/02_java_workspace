package com.kh.api;

public class API2_String {

	public static void main(String[] args) {
		// test1();
		test2();
	}
	public static void test2() {
		// 1. equals()
		String str1 = "Hello";
		System.out.println("[1] " + str1.equals("Hello")); // true
		System.out.println("[2] " + str1.equals("Bye")); // false
		
		// 2. charAt()
		System.out.println("[3] " + str1.charAt(1)); // 'e' 문자 추출
		
		// 3. length
		System.out.println("[4] " + str1.length()); // 5
		
		// str1 변수의 마지막 문자 출력
		System.out.println("[5] " + str1.charAt(str1.length() - 1)); // 'o' 문자 추출
		
		// 4. toUpperCase()
		System.out.println("[6] " + str1.toUpperCase()); // "HELLO" 
		
		// toLowerCase()
		System.out.println("[7] " + str1.toLowerCase()); // "hello" 
		
		// 5. contains()
		System.out.println("[8] " + str1.contains("el")); // true
		System.out.println("[9] " + str1.contains("tt")); // false
		
		// 6. indexOf()
		System.out.println("[10] " + str1.indexOf("el")); // 1
		System.out.println("[11] " + str1.indexOf("tt")); // -1
		
		// 7. substring()
		System.out.println("[12] " + str1.substring(2)); // "llo"
		System.out.println("[13] " + str1.substring(2, 4)); // "ll"
		
		// 8. repeat()
		System.out.println("[14] " + "Happy".repeat(5)); // "HappyHappyHappyHappyHappy"
		
		// 9. split()
		String str2 = "HTML#CSS#JS#JAVA";
		String[] sArr = str2.split("#");
		System.out.println("[15]");			
		for(String s : sArr) {
			System.out.println(s);			
		}
	}
	public static void test1() {
		String str1 = "apple";
		String str2 = "apple";
		// 1. str1 == str2
		System.out.println("[1] " + (str1 == str2)); // true
		/*
			문자열 값 자체를 대입하면 "상수풀" 영역에 값이 저장되어 
			str1과 str2는 같은 주소 값을 가리키고 있기 때문에 같다. 
		 */
		
		// 2. str1 == "apple"
		System.out.println("[2] " + (str1 == "apple")); // true
		/*
			str1의 주소와 "apple" 이라는 값 자체가 저장된 주소를 비교한다.
			str1, "apple" 모두 상수풀 공간에서 같은 주소를 가리키고 있기 때문에 같다.
		*/
		
		String str3 = new String("apple");
		String str4 = new String("apple");
		
		// 3. str3 == str4
		System.out.println("[1] " + (str3 == str4)); // false
		/*
			문자열 객체 생성자를 사용하여 값을 대입하면 
			각각 메모리 영역을 가지게 되어 다른 주소 값을 가리키고 있기 때문에 다르다.
		*/
		
		// 4. str3 == "apple"
		System.out.println("[1] " + (str3 == "apple")); // false
		System.out.println("[1.1] str3의 주소 값 : " + System.identityHashCode(str3));
		System.out.println("[1.2] 'apple'의 주소 값 : " + System.identityHashCode("apple"));
		/*
			str3의 주소 값과 "apple"이 저장된 메모리의 저장된 주소 값을 비교한다.
			str3은 새로운 영역에 메모리 공간을 만들어 저장하고 "apple"은 상수풀 영역에 저장하고 있기 때문에 다르다.
		*/
		
		// 문자열 값 비교 
		// String 객체의 equals 메소드 사용하면 주소 값이 아닌 실제 할당된 값을 비교한다.
		System.out.println("문자열 값 비교 : " + str3.equals("apple"));
		
		String str5 = "Hello";
		String str6 = "World";
		
		// 5. str5의 값 출력
		System.out.println("[5] " + str5); // 문자열 값 출력
		System.out.println("[6] " + str5.toString()); // 문자열 값 출력
		/*
			String 클래스 toString 메소드가 오버라이딩(재정의) 되어 있다. 
		*/
		
		// 7. 해쉬(주소) 값 확인 
		// System.identityHashCode(참조변수)
		int hash1 = System.identityHashCode(str5);
		System.out.println("[7] " + hash1); // 정수 형의 주소 값 출력
		
		// 8. str5 변수 값 변경
		// 문자열.concat(추가문자열):String
		str5 = str5.concat(str6);
		System.out.println("[8] " + str5);
		
		// 9. 변경된 str5의 주소 값 확인
		int hash2 = System.identityHashCode(str5);
		System.out.println("[9] " + hash2); // 저장된 주소 값 변경
	}
}
