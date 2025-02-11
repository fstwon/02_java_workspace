package com.kh.hw.member.model.vo;

public class Member {
	/*
	 접근제한자 변수명 : 자료형
		- id : String
		- name : String
		- password : String
		- email : String
		- gender : char
		- age : int
	 */
	// 접근제한자 [예약어] 자료형 변수명 [= 값;]
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;
	
	/*
	 접근제한자 생성자명([변수명:자료형])
	 		  ->클래스명
		+ Member()
		+ Member(id:String, name:String, password:String,
		email:String, gender:char, age:int)	 
	 */
	// 기본생성자
	public Member() {
		
	}
	// 모든 필드를 매개변수로 가지는 생성자 (6개)
	public Member(String id, String name, String password, String email, char gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	/*
	 접근제한자 메소드명([변수명:자료형]):자료형
	 							  -> 반환형
		+ setter() / getter()
		+ inform() : String
	 */
	// 접근제한자 [예약어] 반환형 메소드명(매개변수정보) {}
	public String inform() {
		return String.format("%s %s %s %s %c %d"
				, this.id, this.name, this.password, this.email
				, this.gender, this.age);
	}
	
	public String getId() {
		return this.id;
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





