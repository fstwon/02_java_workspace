package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	// field
	/*
		- StudentController ssm
		= new StudentController()
	*/
	private StudentController ssm = new StudentController();
	
	// constructor
	/*
		+ StudentMenu ()
	*/
	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		Student[] ssmArr = ssm.printStudent();
		for(Student s : ssmArr) {
			System.out.println(s.inform());
		}
		System.out.println();
		System.out.println("========== 학생 성적 출력 ==========");
		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
		System.out.print("학생 점수 합계 : ");
		System.out.print((int)ssm.avgScore()[0]);
		System.out.println();
		System.out.print("학생 점수 평균 : ");
		System.out.print(ssm.avgScore()[1]);
		
		System.out.println();
		System.out.println();
		System.out.println("========== 성적 결과 출력 ==========");
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		for(Student s : ssmArr) {
			int CUT_LINE = StudentController.CUT_LINE;
			if(s.getScore() >= CUT_LINE) {
				System.out.printf("%s학생은 통과입니다.", s.getName());
			} else {
				System.out.printf("%s학생은 재시험 대상입니다.", s.getName());
			}
			System.out.println();
		}
	}
}
