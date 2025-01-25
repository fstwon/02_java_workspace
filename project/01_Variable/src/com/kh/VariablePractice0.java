package com.kh;
import java.util.Scanner; // Scanner import(연결)

public class VariablePractice0 {
	public static void main(String[] args) {
		/*
		 * (1) 아래 코드를 변수를 사용하여 실행
		 */
		System.out.println("현재 2025년이고 올해 20살입니다.");
		int thisYear = 2025;
		int thisAge = 20;
		
		System.out.println("현재 " + thisYear + "년이고 올해 " + thisAge + "살입니다.");
		System.out.printf("현재 %d년이고 올해 %d살입니다.\n", thisYear, thisAge);		
				
		System.out.println("몸무게가 80kg 이상인 경우 탑승하지 못합니다.");
		final String LIMIT_WEIGHT = "80";
		
		System.out.println("몸무게가 " + LIMIT_WEIGHT + "kg 이상인 경우 탑승하지 못합니다.");
		System.out.printf("몸무게가 %skg 이상인 경우 탑승하지 못합니다.\n", LIMIT_WEIGHT);		
		/*
		 * 입력을 받기 위한 기능을 포함한 클래스: Scanner
		 * 1) 연결:	import 전체클래스명; // 패키지경로.클래스명
		 * 		  	import java.util.Scanner;
		 * 2) 생성: 	new 생성자;
		 * 			new Scanner(System.in);	
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.println(name + "님 반갑습니다");
		
		// 나이를 입력받아 출력
		// .nextInt() 메소드 사용
		// "00살입니다" 출력
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.println(name + "님은 " + age + "살 입니다");
		sc.nextLine(); // 버퍼 비움, 위에서 이름을 입력할 때 '\n' 개행 문자가 버퍼에 남아 있음
		String temp = sc.nextLine(); 
		System.out.println("temp: " + temp);
	}
}
