package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	// field
	/*
		-sc:Scanner = new Scanner(System.in)
		-cc:CircleController = new CircleController
		-rc:RectangleController = new RectangleController
	*/
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController(); 
	private RectangleController rc = new RectangleController();
	
	// method
	/*
		+ mainMenu() : void
		+ circleMenu() : void
		+ rectangleMenu():void
		+ calcCircum():void
		+ calcCircleArea():void
		+ calcPerimeter():void
		+ calcRectArea():void
	*/
	
	public void mainMenu() {
		while(true) {
			// 메인메뉴 출력, 잘못 입력했을 시 다시 받도록 반복
			System.out.println("===== 메뉴 =====");
			// 1. 원 ➔ circleMenu()
			System.out.println("1. 원");
			// 2. 사각형 ➔ rectangleMenu()
			System.out.println("2. 사각형");
			// 9. 끝내기
			System.out.println("9. 끝내기");
			// 메뉴 번호 :
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch(menuNum) {
				case 1:
					circleMenu();
					break;
				case 2:
					rectangleMenu();
					break;
				case 9:
					System.out.println("종료합니다.");
					return;
				default: 
					System.out.println("잘못 입력했습니다.");
			}
		}
	}
	public void circleMenu() {
		// 원 메뉴 출력, 잘못 입력했을 시 메인메뉴로 돌아감
		System.out.println("===== 원 메뉴 =====");
		// 1. 원 둘레 ➔ calcCircum()
		System.out.println("1. 원 둘레");
		// 2. 원 넓이 ➔ calcCircleArea()
		System.out.println("2. 원 넓이");
		// 9. 메인으로
		System.out.println("9. 메인으로");
		// 메뉴 번호 : 
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		switch(menuNum) {
			case 1:
				calcCircum();
				break;
			case 2:
				calcCircleArea();
				break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
		}
	}
	public void rectangleMenu() {
		// 사각형 메뉴 출력, 잘못 입력했을 시 메인 메뉴로 돌아감
		System.out.println("===== 사각형 메뉴 =====");
		// 1. 사각형 둘레 ➔ calcPerimeter()
		System.out.println("1. 사각형 둘레");
		// 2. 사각형 넓이 ➔ calcRectArea()
		System.out.println("2. 사각형 넓이");
		// 9. 메인으로
		System.out.println("9. 메인으로");
		// 메뉴 번호 : 
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		switch(menuNum) {
			case 1:
				calcPerimeter();
				break;
			case 2:
				calcRectArea();
				break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
		}
	}
	public void calcCircum() {
		// x, y 좌표와 반지름을 받아 원의 정보와 원 둘레 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		// 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내 반환 값 출력
		String circum = cc.calcCircum(x, y, radius);
		System.out.println(circum);
	}
	public void calcCircleArea() {
		// x, y 좌표와 반지름을 받아 원의 정보와 원 넓이 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("반지름 : ");
		int radius = sc.nextInt();

		// 데이터를 CircleController(cc)의 calcArea()의 매개변수로 보내 반환 값 출력
		String area = cc.calcArea(x, y, radius);
		System.out.println(area);
	}
	public void calcPerimeter() {
		// x, y 좌표와 높이, 너비를 받아 사각형의 정보와 사각형 둘레 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("높이 : ");
		int height = sc.nextInt();
		
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		// 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로 보내 반환값 출력
		String perimeter = rc.calcPerimeter(x, y, height, width);
		System.out.println(perimeter);
	}
	public void calcRectArea() {
		// x, y 좌표와 높이, 너비를 받아 사각형의 정보와 사각형 넓이 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("높이 : ");
		int height = sc.nextInt();
		
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		// 데이터를 RectangleController(rc) calcArea()의 매개변수로 보내 반환값 출력
		String area = rc.calcArea(x, y, height, width);
		System.out.println(area);
	}
	
}
