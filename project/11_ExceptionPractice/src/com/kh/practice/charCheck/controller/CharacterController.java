package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	// constructor
	/*
		+ CharacterController()
	*/
	public CharacterController() {}
	
	/*
		+ countAlpha(s:String) : int throws
		CharCheckException	
	*/
	public int countAlpha(String s) throws CharCheckException {
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		if(s.contains(" ")) {
			// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		}
		int count = 0;
		// 문자열.toUpperCase();
		// 문자열.toLowerCase();
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			/*
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				count++;
			}
			*/
			if(c >= 'a' && c <= 'z') {
				count++;
			}
		}
		return count;
	}
}
