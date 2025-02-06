package com.kh.object.ex3;

public class Book {
	// 필드부
	// 모든 변수는 클래스 내에서만 접근 가능
	// 제목
	private String title;
	// 장르
	private String genre;
	// 저자
	private String author;
	// 페이지 수
	private int maxPage;
	
	// 생성자부 
	public Book() {
		// 매개변수가 없는 형태의 기본 생성자
	}
	public Book(String title, String genre, String author) {
		// 매개변수가 3개인 생성자
		// 생성하는 곳에서 매개변수를 입력 시 해당 생성자로 인스턴스를 생성
		/*
		this.title = title;
		this.genre = genre;
		this.author = author;
		*/
		// this()를 사용하여 클래스 내 다른 생성자 호출
		this(title, genre, author, 0);
	}
	public Book(String title, String genre, String author, int maxPage) {
		// 매개변수가 4개인 생성자
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.maxPage = maxPage;
	}
	
	// 메소드부 
	// private 변수에 접근하기 위한 메소드(getter, setter)
	
	// 제목 변수의 값을 조회하는 메소드(getter)
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	// 저장된 데이터(변수)들을 조회하는 메소드 (toString)
	public String toString() {
		return 
			"제목 : " + title + "\n" + 
			"장르 : " + genre + "\n" + 
			"저자 : " + author + "\n" + 
			"페이지 수 :" + maxPage;
	}
}



























