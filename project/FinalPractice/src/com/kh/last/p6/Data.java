package com.kh.last.p6;

public class Data {
	// field
	/*
		- value:int
		- isEmpty:boolean = true
	*/
	private int value;
	private boolean isEmpty = true;
	
	// contructor
	public Data() {
	}
	
	// method
	@Override
	public String toString() {
		return "Data [value=" + value + ", isEmpty=" + isEmpty + "]";
	}
	public synchronized int getValue() throws EmptyException {
        System.out.println("getValue Thread " + Thread.currentThread().getName());

        while (isEmpty) { // 값이 없으면 대기
            try {
                wait(); // 대기
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 인터럽트 상태 복원
                throw new EmptyException("스레드가 인터럽트되었습니다.");
            }
        }

        isEmpty = true;
        notifyAll(); // 대기 중인 setValue() 실행 가능

        return value;
	}
	public synchronized void setValue(int value) {
        System.out.println("setValue Thread " + Thread.currentThread().getName());

        while (!isEmpty) { // 값이 비어있지 않다면 대기
            try {
                wait(); // 대기
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 인터럽트 상태 복원
            }
        }

        this.value = value;
        isEmpty = false;
        notifyAll(); // 대기 중인 getValue() 실행 가능
	}
	public boolean isEmpty() {
		return isEmpty;
	}
	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
}
