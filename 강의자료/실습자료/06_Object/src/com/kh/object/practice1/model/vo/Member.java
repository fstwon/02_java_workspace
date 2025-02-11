package com.kh.object.practice1.model.vo;

public class Member {
	/* ---- 필드부 ---- */
	/*
		- memberId : String
		- memberPwd : String
		- memberName : String
		- age : int
		- gender : char
		- phone : String
		- email : String
	 */
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	/* ---------------------------- */
	
	/* ---- 생성자부 ---------------- */
	/*
		+ Member()
	*/
	public Member() {}
	/* ---------------------------- */
	/* ---- 메소드부 ---------------- */
	/*
		+ changeName(name:String):void
		+ printName():void
	*/
	public void changeName(String name) {
		memberName = name;
	}
	public void printName() {
		System.out.println("이름 : " + memberName);
	}
	/* ----------------------------- */
}





