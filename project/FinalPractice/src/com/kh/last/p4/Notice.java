package com.kh.last.p4;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Notice implements Serializable {
	/**
	 * 
	 */
	// field
	/*
		- no:int
		- title:String
		- date:Date
		- writer:String
		- content:String	
	*/
	private int no;
	private String title;
	private Date date;
	private String writer;
	private String content;
	
	
	/*
		Notice 클래스를 작성하고, 
		키보드로 각 필드에 기록할 값을 입력 받아 
		
		생성자 초기값으로 사용하여 객체를 할당한다.
		Object[] 에 3개의 Notice 객체를 초기화 선언한 다음 
		Object[] 에 기록된 객체정보를 “notice.dat” 파일에 객체 단위로 출력 저장한다. 
		그 다음 “notice.dat” 파일에 기록된 정보를 객체 단위로 읽어 들여서, 
		Notice 타입으로 변환한 다음 
		ArrayList<Notice> 에 저장하고
		리스트 정보를 출력한다.
	*/
	
	// constructor
	public Notice() {
		
	}
	// (no:int, title:String, date:Date, writer:String, content:String
	public Notice(int no, String title, Date date, String writer, String content) {
		// 생성자 값으로 초기화
		this.no = no;
		this.title = title;
		this.date = date;
		this.writer = writer;
		this.content = content;
	}
	// method
	/*
		+toString():String
		+setXXX()
		+getXXX()	
	*/
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return no + " " + title + " " + sdf.format(date) + " " + writer + " " + content;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
