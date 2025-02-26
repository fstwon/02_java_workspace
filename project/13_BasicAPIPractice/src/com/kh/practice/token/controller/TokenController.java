package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	// filed
	/*
	 * +TokenController()
	 * 
	 */
	public TokenController() {
	}

	// method
	/*
	 * +afterToken(str:String):String +firstCap(input:String):String
	 * +findChar(input:String, one:char):int
	 */
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		StringTokenizer st = new StringTokenizer(str, " ");
		// 띄어쓰기를 없애고 없앤 문자열 반환
		String result = "";
		// StringBuilder sb = new StringBuilder("");
		while (st.hasMoreTokens()) {
			result += st.nextToken();
			// sb.append(st.nextToken());
		}
		// return String.valueOf(sb)/sb.toString();
		return result;
	}

	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		// input의 첫 글자 접근
		// toUpperCase로 접근한 첫 글자 대문자로 변경
		// + input.substring(1);
		if(input.length() <= 1) {
			return input.toUpperCase();
		}
		String fc = String.valueOf(input.charAt(0)).toUpperCase() + input.substring(1);
		// String fc = (input.substring(0, 1).toUpperCase()) + input.substring(1);
		return fc;
	}

	public int findChar(String input, char one) {
		if(input.indexOf(one) < 0) {
			return 0;
		}
		int count = 0;
		/*
		String character = String.valueOf(one);
		String[] sArr = input.split("");
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].equals(character)) {
				count++;
			}
		}
		*/
		for(int i = 0; i < input.length(); i++) {
			if(one == input.charAt(i)) {
				count++;
			}
		}
		// toCharArray():char[] 메소드 사용
		/*
		for(char c : input.toCharArray()) {
			if(c == one) {
				count++;
			}
		}
		*/
		return count;
	}
}
