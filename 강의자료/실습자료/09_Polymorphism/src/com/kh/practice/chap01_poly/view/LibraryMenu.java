package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	//- lc : LibraryController // 초기화 생성
	private LibraryController lc = new LibraryController();
	//- sc : Scanner // 초기화 생성
	private Scanner sc = new Scanner(System.in);
	
	
//	+ mainMenu() : void
	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		Member m = new Member(name, age, gender);
		// LibraryController의 insertMember() 메소드에 전달
		lc.insertMember(m);	// => controller 객체를 통해 데이터 저장!		
		
		while(true) {
			System.out.println("==== 메뉴 ===="); // 무한 반복 실행
			System.out.println("1. 마이페이지"); 
			System.out.println("2. 도서 전체 조회"); 
			System.out.println("3. 도서 검색"); 
			System.out.println("4. 도서 대여하기"); 
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			// LibraryController의 myInfo() 호출하여 출력
			case 1: 
				Member memInfo = lc.myInfo();
				System.out.println(memInfo);
				break;
			// LibraryMenu의 selectAll() 호출
			case 2: 
				selectAll();
				break;
			// LibraryMenu의 searchBook() 호출
			case 3:
				searchBook();
				break;
			// LibraryMenu의 rentBook() 호출
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;	// 무한 반복문 내에 있기때문에, 메소드 종료시킴!
			default:
				System.out.println("잘못입력하였습니다. 다시입력해주세요.");
				break;
			}
			
		}
	}
//	+ selectAll() : void
	public void selectAll() {
		// LibraryController의 selectAll()메소드 호출하여 
		// 결과 값 Book[] 자료형 bList에 담기
		Book[] bList = lc.selectAll();
		
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
		// ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		for(int i=0; i<bList.length; i++) {
			System.out.printf("%d번도서 : %s\n", i, bList[i]);
		}
	
	}
//	+ searchBook() : void
	public void searchBook() {
		// “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		
		// LibraryController의 searchBook() 에 전달
		// 그 결과 값을 Book[] 자료형 searchList에 담아 검색 결과인 도서 목록 출력
		Book[] searchList = lc.searchBook(keyword);
		for(Book b : searchList) {
			if (b != null) {
				System.out.println(b);
			}
		}
	}
//	+ rentBook() : void
	public void rentBook() {
		// 도서대여를 위해 도서번호를 알아야 하기 때문에 selectAll() 메소드 호출
		selectAll();
		
		// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		// LibraryController의 rentBook() 에 전달
		// 그 결과 값을 result로 받고 그 result가
		int result = lc.rentBook(index);
		
		// 0일 경우 → “성공적으로 대여되었습니다.” 출력
		if (result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result == 1) {
			// 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if (result == 2) {
			// 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요” 출력
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
		} else {
			System.out.println("결과값 확인 불가@@");
		}
	}
}





