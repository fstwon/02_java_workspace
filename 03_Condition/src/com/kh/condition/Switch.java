package com.kh.condition;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		// method1();
		method2();
		// method3();
	}
	public static void method3() {
		/*
		 * "월"을 입력받아 해당 월의 말일이 며칠까지인지 출력
		 * 
		 * "월을 입력하세요: "
		 * "xx월은 xx일까지입니다."
		 * 
		 * * 1, 3, 5, 7, 8, 10, 12 => 31
		 * * 4, 6, 9, 11 		   => 30
		 * * 2 					   => 28
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요: ");
		int month = sc.nextInt();
		String result = "%d월은 %d일까지입니다.";
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.printf(result, month, 31);
				break;
			case 4: case 6: case 9: case 11:
				System.out.printf(result, month, 30);
				break;
			case 2:
				System.out.printf(result, month, 28);
				break;
			default:
				System.out.print("해당 월은 존재하지 않습니다.");
		}
		
		// JDK 14버전
		/*
		switch(month) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.printf(result, month, 31);
				break;
			case 4, 6, 9, 11:
				System.out.printf(result, month, 30);
				break;
			case 2:
				System.out.printf(result, month, 28);
				break;
			default:
				System.out.print("해당 월은 존재하지 않습니다.");
		}
		*/
		
	}
	public static void method2() {
		/*
		 * * 과일을 구매하는 프로그램 *
		 * 사용자가 구매하고자 하는 과일을 입력하면 
		 * 해당 가격 출력
		 * 
		 * 출력 => {과일 이름}의 가격은 {과일 가격}원 입니다.
		 * 
		 * 과일 데이터 (단위: 원) 
		 * 사과: 15,000
		 * 포도: 30,000
		 * 귤: 8,000
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 과일을 입력해주세요.: ");
		String selFruit = sc.next();
		
		String result = "%s의 가격은 %s원 입니다.";
		switch(selFruit) {
			case "사과": // string.equals("비교값"); 문자열을 비교할 경우 .equals() 메소드를 사용할 수 있다.
				System.out.printf(result, "사과", "15,000");
				break;
			case "포도":
				System.out.printf(result, "포도", "30,000");
				break;
			case "귤":
				System.out.printf(result, "귤", "8,000");
				break;
			default:
				System.out.print("해당 과일 가격은 알 수 없습니다.");
		}
	}
	public static void method1() {
		/*
		 * 정수를 입력 받아, 아래 조건에 따라 출력
		 * 입력 받은 값: 
		 * 1, 출력 값: "빨간색"
		 * 2, 출력 값: "파란색"
		 * 3, 출력 값: "초록색"
		 * 그 외, "잘못 입력하셨습니다."
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요.: ");
		int inputNum = sc.nextInt();
		
		/*
		switch(inputNum) {
			case 1: 
				System.out.print("빨간색");
				break;
			case 2: 
				System.out.print("파란색");
				break;
			case 3: 
				System.out.print("초록색");
				break;
			default:
				System.out.print("잘못 입력하셨습니다.");
				break;
		}
		*/
		
		// => if 문으로 수정
		if(inputNum == 1) {
			System.out.print("빨간색");
		} else if(inputNum == 2) {
			System.out.print("파란색");
		} else if(inputNum == 3) {
			System.out.print("초록색");
		} else {
			System.out.print("잘못 입력하셨습니다.");
		}
	}
}
