package com.kh.thread.ex2;

public class Task2 extends Thread {
	@Override
	public void run() {
		try {
			for(int i = 1; i < 20; i++) {
				if(i % 2 != 0) {
					String name = Thread.currentThread().getName();
					System.out.println(name + " : " + i);
				}
					Thread.sleep(200);
				}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
