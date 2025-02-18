package com.kh.practice.chap01_poly.model.vo;

public class Member {
	
	private String name; 		 // 회원명
	private int age;	 		 // 회원나이
	private char gender; 		 // 성별
	private int couponCount = 0; // 요리학원쿠폰개수 = 0
	
	//	+ Member()
	public Member() {}
	//	+ Member(name:String, age:int, gender:char)
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//	+ toString() : String
	//  => 오버라이딩! Object 클래스의 정의된 메소드!
	//  alt+shift+s -> v : 오버라이딩 자동완성
	//  alt+shift+s -> s : toString() 자동완성 => 클래스명 [필드명=저장된값,...]
	@Override	
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount + "]";
	}
	// getter/setter
	// alt + shift + s -> r : getter/setter 자동완성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getCouponCount() {
		return couponCount;
	}
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
	
}




