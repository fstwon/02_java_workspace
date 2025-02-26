package com.kh.practice.book.view;

import java.io.File;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	// field
	/*
		- sc : Scanner = new Scanner(System.in)
		- bc:BookController = new BookController()
		- bArr:Book[]
	*/
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	
	// constructor
	/*
		+ BookMenu()
	*/
	public BookMenu() {
		// 파일이 없을 때 만들어주기 위해 
		// BookController(bc)에 makeFile() 호출
		File f = new File("book.txt");
		// 파일 생성 확인
		if(!f.exists()) {
			// 없으면 bc.makeFile();
			bc.makeFile();
		}
		
		// 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입
		bArr = bc.fileRead();
	}
	
	// method
	/*
		+ mainMenu() : void
		+ fileSave() : void
		+ fileRead() : void
	*/
	public void mainMenu() {
		while(true) {
			// 1. 도서 추가 저장 ➔ fileSave()
			System.out.println("1. 도서 추가 저장");
			// 2. 저장 도서 출력 ➔ fileRead()
			System.out.println("2. 저장 도서 출력");
			// 9. 프로그램 끝내기 ➔ “프로그램 종료” 출력 후 종료
			System.out.println("9. 프로그램 끝내기");
			// 메뉴 번호 :
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
				case 1: fileSave(); break;
				case 2: fileRead(); break;
				case 9: System.out.println("프로그램 종료"); return;
				// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}			
		}
	}
	public void fileSave() {
		/*
			private String title;
			private String author;
			private int price;
			private String date;
			private double discount;
		*/
		// 도서 명 :
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		// sc.next();
		// 저자 명 :
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		// sc.next();
		// 도서 가격 :
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		// 출판 날짜(yyyy-mm-dd) :
		System.out.print("출판 날짜 : ");
		String date = sc.next();
		// sc.next();
		// 할인율 :
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		// 입력받은 값을 Book 객체에 담고
		Book b = new Book(title, author, price, date, discount);
		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] == null) {
				bArr[i] = b;
				break;
			}
		}
		bc.fileSave(bArr);
	}
	public void fileRead() {
		// bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력
		Book[] oldBArr = bc.fileRead();
		for(int i = 0; i < oldBArr.length; i++) {
			Book oldB = oldBArr[i];
			if(oldB != null) {
				System.out.println(oldB);
			}
		}
	}
}
