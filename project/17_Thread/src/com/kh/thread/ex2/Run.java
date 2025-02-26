package com.kh.thread.ex2;

public class Run {

	public static void main(String[] args) {
		// Thread1 : 20 미만 짝수 출력 (0.2초 텀)
		Task1 t1 = new Task1();
		// Thread2 : 20 미만 홀수 출력 (0.2초 텀)
		Task2 t2 = new Task2();
		
		t1.start();
		t2.start();
	}

}
