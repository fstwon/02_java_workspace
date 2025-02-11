package com.kh.object.practice1.run;

import com.kh.object.practice1.model.vo.Member;
// => 패키지 경로가 다른 클래스 이므로 import 해야함!

public class Run {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.changeName("홍길동");		
		m1.printName();

		Member m2 = new Member();
		m2.changeName("아이유");
		m2.printName();
	}
}
