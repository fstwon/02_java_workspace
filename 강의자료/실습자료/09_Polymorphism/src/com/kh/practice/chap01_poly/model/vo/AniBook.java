package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {
	private int accessAge; // 제한 나이
	
	public AniBook() {}
	
	public AniBook(String title, String author
					, String publisher, int accessAge) {
//		this.title = title;
//		this.author = author;
//		this.publisher = publisher;
		// => private 변수는 직접 접근 불가!
		// (1) 생성자 사용 (2) setter 메소드 사용
		super(title, author, publisher);
		// => 부모클래스 생성자는 항상 첫줄에 작성(제일 먼저 실행!)
		this.accessAge = accessAge;
	}
	//+ toString() : String
	@Override
	public String toString() {
		return "AniBook ["+ super.toString()	// => 부모클래스(Book) toString() 실행
				+", accessAge=" + accessAge + "]";
	}
	
	// accessAge:int 변수에 대한 getter/setter
	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	
}





