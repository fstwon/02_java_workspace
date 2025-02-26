package com.kh.last.p6;

public class Customer extends Thread {
	private Data data;
	
	public Customer(Data data) {
		this.data = data;
	}
	
	public void run() {
		// Data가 가진 value 값을 10 번 꺼내어 출력한다.
		try {
            for (int i = 0; i < 10; i++) {
                try {
                    int value = data.getValue(); // 값 가져오기
                    System.out.println("get value : " + value);
                    System.out.println("값을 꺼냈습니다. value가 비었습니다.");
                } catch (EmptyException e) {
                    e.printStackTrace();
                    continue; // 다시 시도
                }
                Thread.sleep(100);
            }
		} catch(InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}
}
