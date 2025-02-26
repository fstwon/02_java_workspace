package com.kh.generic.ex4;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBox<String, Integer> b1 = new DBox<>();
		
		b1.set("Text1", 100);
		// b1.set(100, "Test1"); // Error
		System.out.println(b1); // b1.toString();
		
		DBox<Double, Boolean> b2 = new DBox<>();
		b2.set(12.34, false);
		System.out.println(b2); // b2.toString();
	}

}
