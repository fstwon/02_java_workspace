package com.kh.practice.file.view;

import java.io.File;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	// field
	/*
		- sc : Scanner = new Scanner(System.in)
		- fc:FileController = new FileController()
	*/
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	final String EXIT = "ex끝it";
	
	// method
	/*
		+ mainMenu():void
		+ fileSave():void
		+ fileOpen():void
		+ fileEdit():void
	*/
	public void mainMenu() {
		while(true) {
			System.out.println("***** My Note *****");
			// 1. 노트 새로 만들기 ➔ fileSave()
			System.out.println("1. 노트 새로 만들기");
			// 2. 노트 열기 ➔ fileOpen()
			System.out.println("2. 노트 열기");
			// 3. 노트 열어서 수정하기 ➔ fileEdit()
			System.out.println("3. 노트 열어서 수정하기");
			// 9. 끝내기 ➔ “프로그램을 종료합니다.” 출력 후 종료
			System.out.println("9. 끝내기");
			// 메뉴 번호 :
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
				case 1:
					fileSave();
					break;
				case 2:
					fileOpen();
					break;
				case 3:
					fileEdit();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}			
		}	
	}
	public void fileSave() {
		String str = null;
		String fileContent = "";
		while(!EXIT.equals(str)) {
			// exit(끝) 이라고 입력하면 종료됩니다.
			// 파일에 저장할 내용을 입력하세요.	
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			// 내용 :
			System.out.print("내용 : ");
			str = sc.nextLine();
			if(EXIT.equals(str)) {
				break;
			}
			fileContent += str + "\n";
		}
		
		String fileName = null;
		char answer = 'n';
		while(answer == 'n' || answer == 'N') {
			// 저장할 파일 명을 입력해주세요(ex. myFile.txt) :
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			fileName = sc.nextLine();
			boolean isFileExists = fc.checkName(fileName);
			// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면 -> getFileName()
			if(isFileExists) {
				// “이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)”가 출력됨
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				// n를 입력하면 “저장할 파일 명을 입력해주세요 ~”가 다시 나오게끔 반복
				answer = sc.next().charAt(0);
			}
		}
		// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 String 넘김
		fc.fileSave(fileName, fileContent);
		System.out.println("file saved");
	}
	public void fileOpen() {
		// 열 파일 명 :
		System.out.print("열 파일 명 : ");
		String fileName = sc.next();
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		boolean isExists = fc.checkName(fileName);
		if(!isExists) {
			// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
			System.out.println("없는 파일입니다.");
			return;
		}
		// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 반환 값 출력
		System.out.println(fc.fileOpen(fileName));
	}
	public void fileEdit() {
		// 수정할 파일 명 :
		System.out.print("수정할 파일 명 : ");
		String fileName = sc.next();
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		boolean isExists = fc.checkName(fileName);
		if(!isExists) {
			// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
			System.out.println("없는 파일입니다.");
			return;
		}
		// 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음
		// 파일에 저장할 내용을 입력하세요.
		
		System.out.println("파일에 저장할 내용을 입력하세요.");
		String str = null;
		String fileContent = "";
		while(!EXIT.equals(str)) {
			// “ex끝it”를 입력할 때까지 사용자가 입력하게 하고 그 값들을 String에 저장
			// exit(끝) 이라고 입력하면 종료됩니다.
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			// 내용 :
			System.out.print("내용 : ");
			str = sc.next();
			if(EXIT.equals(str)) {
				break;
			}
			fileContent += str + "\n";
		}
		// ex끝it를 입력하면 반복문 종료 후 fc의 fileEdit()에 파일 명과 StringBuilder 전달
		fc.fileEdit(fileName, fileContent);
	}
}
