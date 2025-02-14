package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
	/*
		+ NUMBERPAD : char[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'}	
	*/
	// field
	public static final char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};
	
	
	// method
	public abstract String makeCall(); // 전화 걸기
	public abstract String takeCall(); // 전화 받기
}
