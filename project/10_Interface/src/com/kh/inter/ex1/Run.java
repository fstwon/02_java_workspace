package com.kh.inter.ex1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// 사용자가 선택한 메뉴에 따라 동물 객체를 크기가 3인 배열에 담기
		/*
			1. 고양이
			2. 강아지
			3. 토끼
		*/
		Scanner sc = new Scanner(System.in);
		Animal[] aniArr = new Animal[3];
		
		for(int i = 0; i < aniArr.length; i++) {
			System.out.println("동물 번호를 입력해주세요.");
			System.out.println("1. 고양이");
			System.out.println("2. 강아지");
			System.out.println("3. 토끼");
			System.out.print("동물 선택 : ");
			int num = sc.nextInt();
			switch(num) {
				case 1:
					aniArr[i] = new Cat();
					break;
				case 2:
					aniArr[i] = new Dog();
					break;
				case 3:
					aniArr[i] = new Rabbit();
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
			}			
		}
		
		// 배열 위치에 접근하여 move() 호출 (단, Baby는 "움직일 수 없습니다" 출력
		for(int i = 0; i < aniArr.length; i++) {
			Animal a = aniArr[i];
			if(a != null) {
				if(a instanceof Baby) {
					System.out.println("움직일 수 없습니다.");
					continue;
				}
				a.move();
			}
		}
	}

}
