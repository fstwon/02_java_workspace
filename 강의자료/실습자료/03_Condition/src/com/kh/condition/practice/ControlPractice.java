package com.kh.condition.practice;

import java.util.Scanner;

public class ControlPractice {

	public static void main(String[] args) {
		// practice1();
		practice5();
	}
	
	/*
	 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
	   로그인 성공 시 “로그인 성공”, 
       아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
       비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.

		ex 1.					ex 2.					ex 3.
		아이디 : myId				아이디 : myId				아이디 : my
		비밀번호 : myPassword12	비밀번호 : myPassword		비밀번호 : myPassword12
		로그인 성공				비밀번호가 틀렸습니다.		아이디가 틀렸습니다.
	 */
	public static void practice5() {
		// 상수 : 아이디, 비밀번호
		final String ID = "myId";
		final String PASSWD = "myPassword12";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String userId = sc.next();
		
		System.out.print("비밀번호 : ");
		String userPwd = sc.next();
		
		// 문자열 값 비교 메소드: 문자열.equals(변수_또는_문자열값) => true/false
		// if (userId == ID && userPwd == PASSWD) {  // x
		if (userId.equals(ID) && userPwd.equals(PASSWD)) {
			System.out.println("로그인 성공");
		} else {
			
			// if (userId != ID) {
			if (!userId.equals(ID)) {
				System.out.println("아이디가 틀렸습니다.");
			// } else if (userPwd != PASSWD) {
			} else if (!userPwd.equals(PASSWD)) {
				System.out.println("비밀번호가 틀렸습니다.");
			} 
			
		}
		
	}
	
	/*
	 * 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
	   종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		ex.
		1. 입력
		2. 수정
		3. 조회
		4. 삭제
		7. 종료
		메뉴 번호를 입력하세요 : 3
		조회 메뉴입니다.
	 */
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
			case 1:		// menu == 1
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:		// menu == 2
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:		// menu == 3
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:		// menu == 4
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7: 	// menu == 7
				System.out.println("프로그램이 종료됩니다.");
				break;
			default:
				System.out.println("없는 메뉴입니다.");
		}
	}

}
