package com.kh.api;

public class API02_StringBuilder {

	public static void main(String[] args) {
		String str = "Winter";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.toString());
		int hash = System.identityHashCode(sb);
		System.out.println(hash);
		
		// 값 변경 : 변수명.append(추가문자열)
		sb.append(" is cold ");
		sb.append("wating for Spring");
		System.out.println(sb);
		int hash2 = System.identityHashCode(sb);
		System.out.println(hash2);
	}

}
