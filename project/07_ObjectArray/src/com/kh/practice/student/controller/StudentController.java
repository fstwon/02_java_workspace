package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	// field
	/*
		- Student[] sArr = new Student[5]
		+ CUT_LINE : int = 60
	*/
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;

	// constructor
	/*
		+ StudentController()
	*/
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
		/*
		sArr = new Student[] {
				
		};
		*/
	}
	
	// method
	/*
		+ printStudent() : Student[]
		+ sumScore() : int
		+ avgScore() : double[]
	*/
	public Student[] printStudent() {
		return sArr;
	}
	public int sumScore() {
		int totalScore = 0;
		for(Student s : sArr) {
			totalScore += s.getScore();
		}
		return totalScore;
	}
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0]/sArr.length;
		return avgArr;
	}
}
