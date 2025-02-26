package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	// field
	/*
		- list:List = new ArrayList()
	*/
	private ArrayList<Book> bookList = new ArrayList<>();
	
	// constructor
	/*
		+ BookController()
	*/
	public BookController() {
		// 초기 값 4개 추가
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	// method
	/*
		+ insertBook(bk:Book):void
		+ selectList():ArrayList
		+ searchBook(keyword:String):ArrayList
		+ deleteBook(title:String, author:String):Book
		+ ascBook() : int
	*/
	public void insertBook(Book bk) {
		// 전달 받은 bk를 bookList에 추가
		bookList.add(bk);
	}
	
	public ArrayList<Book> selectList() {
		return bookList;
	}
	public ArrayList<Book> searchBook(String keyword) {
		// 검색 결과 리스트를 담아줄 리스트(ArrayList searchList) 선언 및 생성
		ArrayList<Book> searchList = new ArrayList<>();
		// 반복문을 통해 list의 책 중 책 명에 전달 받은 keyword가 포함되어있는 경우
		for(int i = 0; i < bookList.size(); i++) {
			Book b = bookList.get(i);
			if(b.getTitle().contains(keyword)) {
				searchList.add(b);
			}
		}
		// searchList에 해당 책 추가하고 searchList 반환
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		// 삭제된 도서를 담을 Book객체 (Book removeBook) 선언 및 null로 초기화
		Book removeBook = null;
		// 반복문을 통해 bookList의 책 중 책 명이 전달 받은 title과 동일하고
		// 저자 명이 전달 받은 author와 동일한 경우 해당 인덱스 도서 삭제 후 빠져나감
		for(int i = 0; i < bookList.size(); i++) {
			// title 동일, author 동일
			Book b = bookList.get(i);
			if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
				removeBook = bookList.remove(i);
			}
		}
		// 이 때 해당 인덱스 도서를 removeBook에 대입 후 removeBook 반환
		return removeBook;
	}
	public int ascBook() {
		// 책 이름으로 오름차순 후 1 반환
		Collections.sort(bookList);
		return 1;
	}
}
