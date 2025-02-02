package com.kh.condition;

import java.util.Scanner;

public class Switch {
	/*
	 * switch
	 * : if문과 동일한 조건문이지만, 동등비교를 통해 흐름을 제어
	 * : 실행할 코드만 실행하고 자동으로 종료되지 않음 => 직접 종료될 수 있게 설정! (break)
	 * 
	 * switch(비교대상) {	// 비교대상(변수/식) --> 정수, 문자, 문자열
	 * 	case 값:	    // 비교대상 == 값
	 * 		실행코드;
	 *  case 값2:	// 비교대상 == 값2
	 *  	실행코드;
	 *  ...
	 *  default:	// 모든 case에 해당되지 않을 때
	 *  	실행코드;
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method1();
		// method2();
		method3();
	}
	
	public static void method3() {
		/* 
		 * "월"을 입력받아 해당 월의 말일이 며칠까지인지 출력
		 * 
		 * 월을 입력하세요 : xx
		 * xx월은 xx일까지입니다.
		 * 
		 * * 1,3,5,7,8,10,12 => 31
		 * * 4,6,9,11        => 30
		 * * 2               => 28
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		// month 값이 1, 3, 5, 7, 8, 10, 12 중 하나인 경우 31일
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			// month == 1 || month == 3 || month == 5 || ... || month == 12
			System.out.println(month+"월은 31일까지입니다.");
			break;
		// month 4, 6, 9, 11 중 하나인 경우 30일
		case 4: case 6: case 9: case 11:
		// case 4, 6, 9, 11: // *JDK14부터 지원*
			System.out.println(month + "월은 30일까지입니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일까지입니다.");
		default:
			System.out.println("잘못입력했습니다.");
		}
		
		
		
	}
	
	public static void method2() {
		/*
		 * * 과일을 구매하는 프로그램 *
		 * 사용자가 구매하고자 하는 과일을 입력하면, 해당 가격을 출력
		 * 
		 * 출력 => {과일이름}의 가격은 {과일가격}원입니다.
		 * 
		 * ------------------------
		 * 사과  :  15000
		 * 포도  :  30000
		 * 귤   :   8000
		 * ------------------------
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일 이름 : ");
		String fruit = sc.nextLine();
		
		switch(fruit) {
			case "사과":		// fruit == "사과" | fruit.equals("사과")
				System.out.println("사과의 가격은 15000원입니다.");
				break;
			case "포도":		// fruit == "포도"
				System.out.println("포도의 가격은 30000원입니다.");
				break;
			case "귤":		// fruit == "귤"
				System.out.println("귤의 가격은 8000원입니다.");
				break;
			default:
				System.out.println("해당 과일 가격은 알수없습니다.");
				break;
		}
	}
	
	public static void method1() {
		/* 
		 * 정수를 입력받아, 아래 조건에 따라 출력.
		 * * 1 : "빨간색"
		 * * 2 : "파란색"
		 * * 3 : "초록색"
		 * * 그외 : "잘못입력하셨습니다"
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3 사이의 정수 입력 : ");
		int num = sc.nextInt();
		/****
		switch(num) {
		case 1:		// num == 1
			System.out.println("빨간색");
			break;		// 위의 내용 실행 후 switch 종료!
		case 2:		// num == 2
			System.out.println("파란색");
			break;
		case 3: 	// num == 3
			System.out.println("초록색");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
		}
		****/
		// => if문으로 작성한다면...
		if (num == 1) {  
			System.out.println("빨간색");
		} else if (num == 2) {
			System.out.println("파란색");
		} else if (num == 3) {
			System.out.println("초록색");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}

	
}




