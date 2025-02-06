package com.kh.object.practice1.run;
import com.kh.object.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// Member 객체 생성
		Member m1 = new Member();
		
		// chageName 메소드로 값 변경
		m1.changeName("GD");
		// printName 으로 출력 
		m1.printName();
		
		Member m2 = new Member();
		m2.changeName("TOP");
		m2.printName();
	}
}
