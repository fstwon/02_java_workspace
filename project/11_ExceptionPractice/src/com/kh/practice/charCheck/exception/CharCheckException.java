package com.kh.practice.charCheck.exception;

public class CharCheckException extends Exception {
	// a static final serialVersionUID field of type long
	private static final long serialVersionUID = 0L; 
	
	// constructor
	/*
		+ CharCheckException()
		+ CharCheckException(msg:String)
	*/
	public CharCheckException() {}
	public CharCheckException(String msg) {
		/*
			매개변수로 받은 값을 부모
			생성자로 넘기는 생성자		
		*/
		super(msg);
	}
	/*
	@Override
	public String getMessage() {
		return "";
	}
	*/
}
