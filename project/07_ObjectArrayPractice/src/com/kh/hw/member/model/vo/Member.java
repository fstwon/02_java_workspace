package com.kh.hw.member.model.vo;

public class Member {
	// field
	/*
		- id : String
		- name : String
		- password : String
		- email : String
		- gender : char
		- age : int
	*/
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;
	
	// constructor
	/*
		+ Member()
		+ Member(id:String, name:String, password:String,
		email:String, gender:char age:int)
	*/
	public Member() {}
	public Member(String id, String name, String password, String email, char gender, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	// method
	/*
		+ setter() / getter()
		+ inform() : String	
	*/
	public String inform() {
		// Member 클래스의 모든 필드 값들을 합쳐 반환
		return id + " " + name + " " + password + " " + email + " " + gender + " " + age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
