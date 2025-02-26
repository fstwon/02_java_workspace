package com.kh.practice2.score.view;

import java.io.*;
import java.util.Scanner;

import com.kh.practice2.score.controller.ScoreController;

public class ScoreMenu {
	// field
	/*
	 * - sc : Scanner = new Scanner(System.in) 
	 * - scr:ScoreController = new ScoreController()
	 */
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	// method
	/*
	 * + mainMenu() : void 
	 * + saveScore() : void 
	 * + readScore() : void
	 */
	public void mainMenu() {
		while(true) {
			// 1. 성적 저장 ➔ saveScore()
			System.out.println("1. 성적 저장");
			// 2. 성적 출력 ➔ readScore()
			System.out.println("2. 성적 출력");
			// 9. 끝내기 ➔ “프로그램을 종료합니다.” 출력 후 종료
			System.out.println("9. 끝내기");
			// 메뉴 번호 : 
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
				case 1: saveScore(); break;
				case 2: readScore(); break;
				case 9: System.out.println(""); return;
				default:
					// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
	}
	public void saveScore() {
		int num = 0; // 학생 숫자를 나타낼 변수
		char answer = '\0';
		
		while(answer != 'n' && answer != 'N') {
			num++;
			// N번 째 학생 정보 기록
			System.out.printf("%d번 째 학생 정보 기록\n", num);
			// 이름 :
			System.out.print("이름 : ");
			String name = sc.next();
			// 국어 점수 :
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			// 영어 점수 :
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			// 수학 점수 :
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			// 그 학생 점수의 합계와 평균도 함께 매개변수로 넣어줌
			int sum = kor + eng + math;
			double avg = sum / 3;
			
			// ScoreController(scr)의 saveScore() 매개변수로 모두 넘겨 주고
			scr.saveScore(name, kor, eng, math, sum, avg);
			
			// 그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 :
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			// N이나 n을 입력하면 사용자에게 받는 반복문을 나감
			answer = sc.next().charAt(0);
			// N이나 n을 입력하지 않으면 이름 및 점수를 받는 것을 반복함
		}

	}
	public void readScore() {
		int count = 0; // 몇 명의 학생인지(반복문이 몇 번 실행됐는지) 담을 변수
		int sumAll = 0;
		double avgAll = 0.0; // 모든 학생들의 합과 평균을 담을 변수

		// scr의 readScore()의 반환 값을 DataInputStream에 담고 반복문을 이용하여
		// 안에 들어가있는 데이터를 가지고 와서 출력
	    System.out.printf("%-10s %-5s %-5s %-5s %-5s %-7s\n", "이름", "국어", "영어", "수학", "총점", "평균");
		try(DataInputStream dis = scr.readScore()) {
			while(true) {
                String name = dis.readUTF();
                int kor = dis.readInt();
                int eng = dis.readInt();
                int math = dis.readInt();
                int sum = dis.readInt();
                double avg = dis.readDouble();

                System.out.printf("%-10s %-5d %-5d %-5d %-5d %-7.2f\n", name, kor, eng, math, sum, avg);

                count++;
                sumAll += sum;
                avgAll += avg;
			}
		} catch(EOFException e) {
			// 모든 파일이 읽어졌을 때 나오는 EOFException을 이용하여
	        System.out.printf("읽은 횟수: %-2d  전체 합계: %-4d  전체 평균: %.2f\n", count, sumAll, (count > 0 ? avgAll / count : 0.0));
			// EOFException가 일어났을 때 읽은 회수, 전체 합계, 전체 평균 출력
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
