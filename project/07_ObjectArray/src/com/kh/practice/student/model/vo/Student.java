package com.kh.practice.student.model.vo;

public class Student {
	// field
	/*
		- name : String // 이름
		- subject : String // 과목
		- score : int // 점수
	*/
	private String name;
	private String subject;
	private int score;
	// constructor
	/*
		+ Student()
		+ Student(name:String, subject:String, score:int)
	*/
	public Student() {}
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	// method
	/*
		+ setter() / getter()
		+ inform() : String
	*/
	public String inform() {
		return String.format("이름 : %s / 과목 : %s / 점수 : %d", name, subject, score);
	}
	public String getName() {
		return name;
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
}
