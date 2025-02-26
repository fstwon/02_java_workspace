package com.kh.api;

import java.util.StringTokenizer;

public class API02_StringTokenizer {

	public static void main(String[] args) {
		String data = "안녕하세요|나는ㅇㅇㅇ입니다|반갑습니다";
		StringTokenizer st = new StringTokenizer(data, "|");
		
		// * 변수명.hasMoreTokens():boolean => 토큰화 가능 여부 체크
		// * 변수명.nextToken():String => 토큰화(분리)된 문자열 반환
		
		String[] arr = new String[3];
		int idx = 0;
		while(st.hasMoreTokens()) {
			arr[idx] = st.nextToken();
			System.out.println(arr[idx]);
			idx++;
		}	
	}
}
