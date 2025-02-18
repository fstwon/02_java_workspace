package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	/*
	 * -sc:Scanner = new Scanner(System.in) -cc:CircleController = new
	 * CircleController -rc:RectangleController = new RectangleController
	 */
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	/*
	  + mainMenu() : void 
	  + circleMenu() : void 
	  + rectangleMenu():void 
	  + calcCircum():void 
	  + calcCircleArea():void 
	  + calcPerimeter():void 
	  +calcRectArea():void
	 */
	public void mainMenu() {
		while (true) {
			// 메인메뉴 출력, 잘못 입력했을 시 다시 받도록 반복
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원"); // ➔ circleMenu()
			System.out.println("2. 사각형"); // ➔ rectangleMenu()
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");
			int menu = sc.nextInt();

			switch (menu) {
			case 1: // menu == 1
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default: // menu != 1 || menu != 2 || menu != 9
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}

	public void circleMenu() {
		// 원 메뉴 출력, 잘못 입력했을 시 메인메뉴로 돌아감
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");	 // ➔ calcCircum()
		System.out.println("2. 원 넓이");  // ➔ calcCircleArea()
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
			case 1: calcCircum(); break;
			case 2: calcCircleArea(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); return;
			default: 
				System.out.println("잘못입력했습니다. 메인으로 돌아갑니다."); 
				// return;
				break;
		}
	}

	public void rectangleMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레");		// ➔ calcPerimeter()
		System.out.println("2. 사각형 넓이");		// ➔ calcRectArea()
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: calcPerimeter(); break;
		case 2: calcRectArea(); break;
		case 9: System.out.println("메인으로 돌아갑니다."); break;
		default: System.out.println("잘못입력했습니다. 메인으로 돌아갑니다.");
		}
	}

	public void calcCircum() {
		// x, y 좌표와 반지름을 받아 원의 정보와 원 둘레 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		// 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내
		// 반환 값 출력
		String info = cc.calcCircum(x, y, r);
		System.out.println(info);
	}

	public void calcCircleArea() {
		// X, y 좌표와 반지름을 받아 원의 정보와 원 넓이 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		// 데이터를 CircleController(cc)의 calcArea()의 매개변수로 보내 반환 값 출력
		System.out.println( cc.calcArea(x, y, r) );
	}

	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		System.out.print("너비 : ");
		int w = sc.nextInt();
		
		// 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로 보내 반환값 출력
		System.out.println(rc.calcPerimeter(x, y, h, w));
	}

	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		System.out.print("너비 : ");
		int w = sc.nextInt();
		
		// 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로 보내 반환값 출력
		System.out.println(rc.calcArea(x, y, h, w));
	}
}
