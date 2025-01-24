package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 실수형 점수를 입력 받아 총점과 평균 정수형으로 출력
		// 국어 점수 입력 받기
		System.out.print("국어: ");
		double koLang = sc.nextDouble();
		
		// 영어 점수 입력 받기
		System.out.print("영어: ");
		double enLang = sc.nextDouble();
		
		// 수학 점수 입력 받기
		System.out.print("수학: ");
		double math = sc.nextDouble();
		
		// 총점 출력 (형변환)
		int total = (int)(koLang + enLang + math);
		System.out.println("총점: " + total);
		
		// 평균 출력
		int avg = total / 3;
		System.out.println("평균: " + avg);
	}
}
