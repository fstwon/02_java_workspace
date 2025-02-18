package com.kh.inherit.before;

public class Run {

	public static void main(String[] args) {
		Desktop dt = new Desktop("LG", "Lg-001", "사무용PC", 1000000, false);
		System.out.println(dt.information());
		
		TV tv = new TV("Samsung", "ss01", "LED TV", 1000000, 55);
		System.out.println(tv.information());

	}

}
