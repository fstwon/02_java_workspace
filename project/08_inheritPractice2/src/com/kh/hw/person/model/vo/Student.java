package com.kh.hw.person.model.vo;

public class Student extends Person {
	// field
	/*
		- grade : int // 학년
		- major : String // 전공
	*/
	private int grade;
	private String major;
	
	// constructor
	/*
		+ Student()
		+ Student(name:String, age:int, height:double, weight:double, grade:int, major:String)
	*/
	public Student() {}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	// method
	/*
		+ getter/setter()
		+ toString() : String
	*/
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return this.grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public String toString() {
		return super.toString() + ", grade : " + grade + ", major : " + major;
	}
	
}
