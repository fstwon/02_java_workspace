package com.kh.list;

import java.util.LinkedList;

public class MyStack <T> {
//	 * MyStack
//	 * -----------------
//	 * -arrStack:LinkedList<String> = new LinkedList<>();
//	 * -----------------
//	 * +push(data:String):void
//	 * +pop():String
//	 * 
//	 * * isEmpty() => 리스트가 비어있는지 확인 후 true면 "리스트가 비었습니다." 반환
//	 * * remove() => 해당 위치의 데이터 제거 후 제거된 데이터 반환
//	 *
	// field
	private LinkedList<T> arrStack = new LinkedList<>();
	
	// constructor
	public MyStack() {}
	
	// method
	public void push(T data) {
		arrStack.add(data);
	}
	public T pop() throws MyStackException {
		boolean isEmpty = arrStack.isEmpty();
		if(isEmpty) {
			throw new MyStackException("리스트가 비었습니다.");
		}
		return arrStack.remove(arrStack.size() - 1);
	}
	@Override 
	public String toString() {
		return arrStack.toString();
	}
}

class MyStackException extends Exception {
	private static final long serialVersionUID = 1L;
	public MyStackException() {}
	public MyStackException(String msg) {
		super(msg);
	}
}
