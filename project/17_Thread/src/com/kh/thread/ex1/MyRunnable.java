package com.kh.thread.ex1;

public class MyRunnable implements Runnable {
	public void run() {
		int n1 = 5;
		int n2 = 10;
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}
}
