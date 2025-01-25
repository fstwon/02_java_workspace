package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		// Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		// 실수형 가로, 세로 입력 후 사각형 면적, 둘레 계산 출력
		// 가로 입력
		System.out.print("가로: ");
		double width = sc.nextDouble();
		
		// 세로 입력
		System.out.print("세로: ");
		double vertical = sc.nextDouble();
	
		// 면적 계산, 가로 * 세로
		double area = width * vertical;
		System.out.println("면적: " + area);
		
		// 둘레 계산
		double peri = width * vertical * 2;
		System.out.println("둘레: " + peri);
	}
}
