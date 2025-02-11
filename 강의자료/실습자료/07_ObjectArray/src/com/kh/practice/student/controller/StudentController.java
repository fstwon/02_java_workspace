package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
/*
	- Student[] sArr = new Student[5]
	+ CUT_LINE : int = 60 (밑줄)
	---------------------------------
	+ StudentController()
	---------------------------------
	+ printStudent() : Student[]
	+ sumScore() : int
	+ avgScore() : double[]
 */
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		/*
			name subject score
			김길동 자바 	100
			박길동 디비 	50
			이길동 화면 	85
			정길동 서버 	60
			홍길동 자바 	20
		 */
		// * 인덱스 위치를 사용하여 초기화
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
		
		// * 초기화하여 할당
		/*
		sArr = new Student[] {
				  new Student("김길동", "자바", 100)
				, new Student("박길동", "디비", 50)
				, new Student("이길동", "화면", 85)
				, new Student("정길동", "서버", 60)
				, new Student("홍길동", "자바", 20)
		};
		*/
		
	}
	/**
	 * 객체 배열에 있는 데이터를 반환
	 */
	public Student[] printStudent() {
		return sArr;	// sArr 변수는 생성된 배열 주소를 가지고 있음!
	}
	/**
	 * 객체 배열의 점수를 합한 값 리턴
	 */
	public int sumScore() {
		int total = 0;
		for(int i=0; i<sArr.length; i++) {
			total += sArr[i].getScore();
		}
		return total;
	}
	/**
	 * double배열을 만들어 
	 *  sumScore의 리턴 값을 0번째 인덱스에 저장하고 
	 *  합의 평균을 1번째 인덱스에 저장 후 
	 *  배열 리턴
	 */
	public double[] avgScore() {
		double[] result = new double[2];
		
		int total = sumScore();
		result[0] = total;	// int -> double 자동 형변환되어 저장될 것임!
		result[1] = total / sArr.length;
				// 학생들의 점수 총합 / 학생 수
		
		return result;
	}
}



