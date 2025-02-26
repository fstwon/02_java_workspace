package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {}
	
	/**
	 * 공백을 토큰으로 처리한 문자열 반환
	 * @param str 문자열
	 * @return 공백을 제외한 문자열
	 */
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		// => 전달받은 문자열(str)과 구분자(" ")를 가지고 객체 생성
		
		StringBuilder sb = new StringBuilder("");
		// String after="";
		
		// [1] 토큰 처리 가능여부 확인
		while(st.hasMoreTokens()) {
			// [2] 토큰 처리 (=> 구분자 기준으로 문자열 분해하기..)
			sb.append(st.nextToken());
			// => StringBuilder 클래스를 사용하여 토큰화된 문자열 합치기!
			
			// after += st.nextToken();
		}
		
		return sb.toString();
		// return after;
	}
	
	/**
	 * 첫 글자만 대문자로 바꾼 문자열 반환
	 * @param input 문자열
	 * @return 첫글자만 대문자로 바꾼 문자열
	 */
	public String firstCap(String input) {
		if (input.length() <= 1) return input;
		
		return (input.substring(0, 1)).toUpperCase()
				// 0번인덱스부터 1-1인덱스까지 => 0번 인덱스 값만 추출하여 
				//    대문자로 변경
					+ input.substring(1);
				// 1번인덱스부터 마지막 위치까지 추출
	}
	
	/**
	 * 문자열 안에 찾을 문자 개수가 몇 개 들어가있는지 반환
	 * @param input 문자열
	 * @param one 찾을 문자
	 * @return 문자열 내의 찾을 문자 개수
	 */
	public int findChar(String input, char one) {
		if (input.indexOf(one) == -1) return 0;
		
		int count = 0;
		
		// * charAt():char 메소드 사용
		/*
		for(int i=0; i<input.length(); i++) {
			if (input.charAt(i) == one) { 
				count++;
			}
		}
		*/
		// * toCharArray():char[] 메소드 사용
		char[] chArr = input.toCharArray();
		for(char ch : chArr) {
			if (ch == one) count++;
		}		
		
		return count;
	}
}




