package com.kh.last.p6;

import java.util.Random;

public class Provider extends Thread {
	// field
	/*
		-data:Data
	*/
	private Data data;
	
	// constructor
	public Provider(Data data) {
		this.data = data;
	}
	
	// method
	public void run() {
		// Data의 value에 1부터 100 사이의 정수를 기록하는 작업 10번 실행한다.
		try {
			Random random = new Random();
			int randomInt = random.nextInt(100) + 1;
			for(int i = 0; i < 10; i++) {
				// 한번 기록하고 0.1초 중지
				data.setValue(randomInt);
				System.out.println("값이 입력되었습니다.");
				System.out.print("put value : " + randomInt + "\n");
				Thread.sleep(100);
			} 
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
