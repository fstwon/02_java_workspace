package com.kh.generic.ex3;

//타입 제한
//<T extends 클래스 또는 인터페이스>
//클래스 또는 인터페이스를 상속(구현)하는 타입으로 제한
//*클래스의 경우 해당 클래스도 포함

//Number 클래스를 상속하는 타입으로 제한 
public class Box<T extends Number> {
	private T ob;
	
	public T get() {
		return ob;
	}
	public void set(T o) {
		this.ob = o;
	}
}

class Apple {
	@Override
	public String toString() {
		return "I'm an apple.";
	}
}
class Orange {
	@Override
	public String toString() {
		return "I'm an orange.";
	}
}