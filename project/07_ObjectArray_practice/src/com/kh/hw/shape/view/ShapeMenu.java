package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	// field
	/*
		- sc : Scanner = new Scanner(System.in)
		- scr : SquareController = new
		SquareController()
		- tc : TriangleController = new
		TriangleController()
	*/
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	
	// method
	/*
		+ inputMenu() : void
		+ triangleMenu() :void
		+ squareMenu():void
		+ inputSize(type:int, menuNum:int):void
		+ printInformation(type:int):void
	*/
	public void inputMenu() {
		// 삼각형과 사각형을 선택하게 하는 메소드
		// ===== 도형 프로그램 =====
		System.out.println("===== 도형 프로그램 =====");
		// 3. 삼각형 ==> triangleMenu()
		System.out.println("3. 삼각형");
		// 4. 사각형 ==> squareMenu()
		System.out.println("4. 사각형");
		// 9. 프로그램 종료 => “프로그램 종료” 출력 후 프로그램 종료
		System.out.println("9. 프로그램 종료");
		// 메뉴 번호 :
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		switch(menuNum) {
			case 3:
				triangleMenu();
			case 4:
				squareMenu();
			case 9:
				System.out.println("프로그램 종료");
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				inputMenu();
		}
	}
	public void triangleMenu() {
		// 삼각형 메뉴 출력 메소드
	}
	public void squareMenu() {
		// 사각형 메뉴 출력 메소드
	}
	public void inputSize(int type, int menuNum) {
		// 너비와 높이를 받아 요청사항을 처리하거나 색깔을 받아 요청사항을 처리하는 메소드
	}
	public void printInformation(int type) {
		// 매개변수에 따라 삼각형/사각형의 정보를 출력하는 메소드
	}
}
