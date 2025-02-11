package com.kh.object.ex3;

public class Run {

	public static void main(String[] args) {
		// 클래스명 참조변수명 = new 클래스명();
		//                   * 클래스명() -> 생성자 
		Book b1 = new Book();
		// b1.title = "자바의 정석";
		// => title 변수에 접근 불가!! 
		// --> 해당 변수는 private으로 선언되어 있어
		//     해당 클래스(Book)에서만 접근 가능!!
		b1.setTitle("자바의 정석");		// 값을 저장
		String b1Title = b1.getTitle();	// 값을 조회
		System.out.println("b1: " + b1Title);
		// ---------------------------------------
		
		Book b2 = new Book("자바 프로그래밍 입문", "전공 서적", "박은종");
		b2.setTitle("Doit! 자바프로그래밍 입문");
		
		String info = b2.toString();
		System.out.println(info);
	}

}



