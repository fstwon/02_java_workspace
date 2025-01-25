package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice1 {
	public static void main(String[] args) {
		// scanner 생성
		Scanner sc = new Scanner(System.in);
		// 이름
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();

		// 성별
		System.out.print("성별을 입력하세요(남/여): ");
		String gender = sc.next();
		// char 타입으로 사용하고 싶은 경우 
		// .charAt(0); 
		char gen = gender.charAt(0);
		
		// 나이
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		// 키 
		System.out.print("키를 입력하세요(cm): ");
		double height = sc.nextDouble(); // 메소드 확인 필요
		
		// 출력 텍스트 
		// System.out.println("키 " + height + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다");
		// System.out.printf("키 %.1f인 %d살 %s자 %s님 반갑습니다", height, age, gender, name);
		System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다", height, age, gen, name);
	}
}
