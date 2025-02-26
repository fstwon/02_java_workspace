package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	// field
	// - sc:Scanner = new Scanner(System.in)
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	// - bc : BookController = new BookController()
	BookController bc = new BookController();
	
	// method
	/*
	 * + mainMenu() : void 
	 * + insertBook() : void 
	 * + selectList() : void 
	 * + searchBook() : void 
	 * + deleteBook() : void 
	 * + ascBook() : void
	 */
	public void mainMenu() {
		while(true) {
			System.out.println("== Welcome KH Library ==");
			System.out.println();
			System.out.println("******* 메인 메뉴 *******");
			
			// 1. 새 도서 추가 // insertBook () 실행
			System.out.println("1. 새 도서 추가");
			// 2. 도서 전체 조회 // selectList ()
			System.out.println("2. 도서 전체 조회");
			// 3. 도서 검색 조회 // searchBook ()
			System.out.println("3. 도서 검색 조회");
			// 4. 도서 삭제 // deleteBook ()
			System.out.println("4. 도서 삭제");
			// 5. 도서 명 오름차순 정렬 // ascBook()
			System.out.println("5. 도서 명 오름차순 정렬");
			// 9. 종료 // “프로그램을 종료합니다.” 출력 후 main()으로 리턴
			System.out.println("9. 종료");
			System.out.println();
			// 메뉴 번호 선택 : >> 입력 받음
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			// 메뉴 화면 반복 실행 처리
			// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
			switch(menu) {
				case 1:
					insertBook();
					break;
				case 2:
					selectList();
					break;
				case 3:
					searchBook();
					break;
				case 4:
					deleteBook();
					break;
				case 5:
					ascBook();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요");	
			}
		
		}

	}
	public void insertBook() {
		System.out.println("책 정보를 입력해 주세요.");
		// 1. 도서명 입력받기 (String title)
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		// 2. 저자명 입력받기 (String author)
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		// 3. 장르 입력받기 (int category) --> 숫자로 입력받기 (1.인문 / 2.자연과학 / 3.의료 / 4.기타)
		System.out.print("장르 (1.인문 / 2.자연과학 / 3.의료 / 4.기타)");
		int categoryNum = sc.nextInt();
		// (객체 생성 시 장르 번호 별로 조건식 이용해 장르번호가 아닌 장르 명으로 값 넘겨야 함)
		String category = "";
		switch(categoryNum) {
			case 1: category = "인문"; break;
			case 2: category = "자연과학"; break;
			case 3: category = "의료"; break;
			case 4: category = "기타"; break;
			default: System.out.println("잘못 입력하셨습니다.");
		}
		// 4. 가격 입력받기 (int price)
		System.out.print("가격 : ");
		int price = sc.nextInt();
		// 5. 매개변수 생성자를 이용하여 Book 객체 생성
		Book b = new Book(title, author, category, price);
		// 6. bc(BookController)의 insertBook으로 위의 Book 객체 전달
		bc.insertBook(b);
		System.out.println();
	}
	public void selectList() {
		// 1. bc(BookController)의 selectList() 메소드를 호출 후
		// --> 결과 값을 임의의 리스트(ArrayList<Book> bookList)에 대입
		ArrayList<Book> bookList = bc.selectList();
		// 2. 조건식 이용해서
		if(bookList.isEmpty()) {
			//  2_1. bookList가 "비어있는 경우" --> "존재하는 도서가 없습니다." 라는 알람 문구 출력
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			//  2_2. bookList가 "비어있지 않은 경우" --> 반복문을 통해 bookList 안의 Book 객체들 출력
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
		System.out.println();
	}
	public void searchBook() {
		// 1. 검색할 도서명 키워드로 입력 받기 (String keyword)
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		// 2. bc(BookController)의 searchBook() 메소드로 위의 keyword 값 전달 후
		ArrayList<Book> searchList = bc.searchBook(keyword);
		//   --> 결과 값을 임의의 리스트(ArrayList<Book> searchList)에 대입
		//   ** 결과 값이 한 도서의 Book 객체가 아니라 리스트인 이유
		//   보통 프로그램에서 검색 할 때 풀 네임을 쳐서 검색하지 않고 키워드로 검색
		//   즉, 키워드를 포함한 결과가 하나가 아닌 여러 개일 수 있기 때문에 리스트로 받기
		// 3. 조건식 이용해서
		if(searchList.isEmpty()) {
			//   3_1. searchList가 "비어있는 경우" --> "검색 결과가 없습니다."라는 알람 문구 출력
			System.out.println("검색 결과가 없습니다.");
		} else {
			//   3_2. searchList가 "비어있지 않은 경우" --> 반복문으로 searchList 안의 Book 객체들 출력
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		System.out.println();
	}
	public void deleteBook() {
		// 1. 삭제할 도서명 입력 받기 (String title)
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		// 2. 삭제할 저자명 입력 받기 (String author)
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();
		// ** 도서명과 저자명을 같이 입력 받는 이유
		//  --> 같은 도서명이라고 해도 저자명이 다른 도서가 있을 수 있기 때문에
		// 3. bc(BookConroller)의 deleteBook() 메소드로 위의 title, autor 값 전달 후
		// 	--> 결과 값을 임의의 Book(Book remove)에 대입
		Book removedBook = bc.deleteBook(title, author);
		// 4. 조건식 이용해서
		if(removedBook != null) {
			//  4_1. remove가 존재하는 경우 --> "성공적으로 삭제되었습니다."라는 문구 출력
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			//  4_2. remove가 존재하지 않은 경우 --> "삭제할 도서를 찾지 못했습니다."라는 문구 출력
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		System.out.println();
	}
	public void ascBook() {
		// bc(BookController)의 ascBook() 메소드 값에 따라
		int isSorted = bc.ascBook();
		// 성공 시 “정렬에 성공하였습니다.”, 실패 시 “정렬에 실패하였습니다.” 출력
		if(isSorted == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
		System.out.println();
	}
}
