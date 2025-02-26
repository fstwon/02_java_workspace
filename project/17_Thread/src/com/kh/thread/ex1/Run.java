package com.kh.thread.ex1;

public class Run {

	public static void main(String[] args) {
		// 스레드 생성 : 
		// 1) Thread 클래스 상속
		Task t1 = new Task();
		// 2) Runnable 인터페이스를 구현하여 생성
		Runnable task = new MyRunnable();
		Thread t2 = new Thread(task);
		// 람다식 사용하여 생성한 Thread
		Runnable task2 = () -> {
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (n1 + n2));
		};
		Thread t3 = new Thread(task2);
		
		t1.start();
		t2.start();
		t3.start();
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + "End main");		
	}

}
