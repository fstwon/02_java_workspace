package com.kh.object.practice4.model.vo;

public class Student {
	// field
	// -grade:int
	private int grade;
	
	// -classroom:int
	private int classroom;
	
	// -name:String
	private String name;
	
	// -height:double
	private double height;
	
	// -gender:char
	private char gender;
	
	// init block 
	{
		grade = 1;
		classroom = 1;
		name = "W";
		height = 172.5;
		gender = 'm';
	}
	
	// constructor
	// +Student()
	public Student() {}
	
	// method
	// +information():void
	public void information() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", classroom=" + classroom + ", name=" + name + ", height=" + height
				+ ", gender=" + gender + "]";
	}
	
}
