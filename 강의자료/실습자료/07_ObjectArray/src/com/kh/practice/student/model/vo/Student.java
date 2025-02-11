package com.kh.practice.student.model.vo;

public class Student {
/*
// --- 필드부 ------------
- name : String // 이름
- subject : String // 과목
- score : int // 점수
// ---------------------
// --- 생성자 ------------
+ Student()
+ Student(name:String, subject:String, score:int)
// ---------------------
// -- 메소드 -----------
+ setter() / getter()
+ inform() : String
// ------------------
 */
	private String name; 	// 이름
	private String subject;	// 과목
	private int score;		// 점수
	
	public Student() {}
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String inform() {
		// 이름 : 김길동 / 과목 : 자바 / 점수 : 100
		return String.format("이름 : %s / 과목 : %s / 점수 : %d", 
								this.name, this.subject, this.score);
	}
	
}
