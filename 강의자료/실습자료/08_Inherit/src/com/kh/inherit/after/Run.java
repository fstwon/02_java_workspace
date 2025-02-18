package com.kh.inherit.after;

public class Run {

	public static void main(String[] args) {

		// Desktop 타입의 객체 생성
		Desktop d1 = new Desktop("엘지", "d101", "사무용PC", 1000000, true);
		System.out.println(d1.information());
		
		// TV 객체 생성
		String info =new TV("삼성", "s1010", "LED TV", 1000000, 55).information();
		System.out.println(info);
	}

}
