package com.kh.inherit.before;

public class Run {

	public static void main(String[] args) {
		Desktop dt = new Desktop("Samsung", "ss-001", "사무용PC", 1000000, true);
		Tv tv = new Tv("LG", "lg-001", "가정용", 1000000, 90);
		System.out.println(dt.information());
		System.out.println(tv.information());
	}

}

