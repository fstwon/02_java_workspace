package com.kh.object.practice1.model.vo;

public class Member {
	// field
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// constructor
	public Member() {}
	
	// method
	public void changeName(String name) {
		memberName = name;
	}
	public void printName() {
		System.out.println(memberName);
	}
}
