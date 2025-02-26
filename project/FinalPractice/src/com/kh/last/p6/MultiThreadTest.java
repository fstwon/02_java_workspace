package com.kh.last.p6;

public class MultiThreadTest {

	public static void main(String[] args) {
		Data data = new Data(); //공유데이터
				
		// data 를 공유하는 Provider 와 Customer 객체 생성 : Thread 객체 생성함
		Thread putThread = new Provider(data);
		Thread getThread = new Customer(data);
		
		// 쓰래드 구동
		putThread.start();
		getThread.start();
	}

}
