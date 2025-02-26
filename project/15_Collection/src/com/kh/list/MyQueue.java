package com.kh.list;

import java.util.ArrayList;

public class MyQueue <T> {
	/*
	 * MyQueue
	 * -queue:ArrayList<T> = new ArrayList<>();
	 * 
	 * 
	 * +enQueue(data:T):void
	 * +deQueue():T
	*/
	// field
	private ArrayList<T> queue = new ArrayList<>();
	
	// constructor
	public MyQueue() {}
	
	// method
	public void enQueue(T data) {
		queue.add(data);
	}
	
	public T deQueue() throws MyQueueException {
		boolean isEmpty = queue.isEmpty();
		if(isEmpty) {
			throw new MyQueueException("리스트가 비었습니다.");
		}
		return queue.remove(0);
	}
	@Override 
	public String toString() {
		return queue.toString();
	}
}

class MyQueueException extends Exception {
	private static final long serialVersionUID = 1L;
	public MyQueueException() {}
	public MyQueueException(String msg) {
		super(msg);
	}
}
