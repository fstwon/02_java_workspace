package com.kh.last.p2;

public class StringTest {
	public static void main(String[] args) {
		String str = "A, b, c, D, a, B, C, d, f, F";
		String[] st = str.split(", "); /* str에서 ‘, ‘ 으로 데이터를 분리한다. */;
		// st 에서 char[] 로 바꾼다.
		char[] data = new char[st.length]; /* 배열 할당 선언 */;
		for(int i = 0; i < st.length; i++) { //for~each 문 사용한다.
			// char[] 배열에 문자 데이터를 넣는다.
			data[i] = st[i].charAt(0);
		}
		// char[] 에서 대문자만 골라서 출력 한다. continue 문 사용할 것
		int index = 0;
		while(index < data.length) { 
			if(data[index] >= 'A' && data[index] <= 'Z') {
				System.out.printf("data[%d] : %c \n", index, data[index++]);
				continue;
			}
		} //while loop 문 사용한다. 
	}
}
