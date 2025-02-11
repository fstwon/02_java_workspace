package com.kh.inherit.after;

public class Run {

	public static void main(String[] args) {
		Desktop d1 = new Desktop("Samsung", "ss-001", "사무용PC", 1000000, true);
		TV t1 = new TV("LG", "lg-001", "가정용", 1000000, 90);
		System.out.println(d1.information());
		System.out.println(t1.information());
	}
}
