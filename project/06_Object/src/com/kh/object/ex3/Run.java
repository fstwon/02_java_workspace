package com.kh.object.ex3;

public class Run {

	public static void main(String[] args) {
		// 기본 생성자
		Book b1 = new Book();
		b1.setTitle("자바의 정석");
		String b1Title = b1.getTitle();
		System.out.println("b1 : " + b1Title);
		
		// 클래스 내 정의된 생성자
		Book b2 = new Book("자바 프로그래밍 입문", "전공 서적", "박은종");
		b2.setTitle("Doit! 자바프로그래밍 입문");
		
		String info = b2.toString();
		System.out.println(info);
		
		Book b3 = new Book("", "", "", 0);
	}

}
