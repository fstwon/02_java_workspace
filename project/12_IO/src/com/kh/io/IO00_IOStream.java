package com.kh.io;

import java.io.*;

public class IO00_IOStream {
	public static void main(String[] args) {
		// I/O Stream을 사용하여 키보드로 입력 받아 콘솔창에 출력
		
		// 키보드 입력 -> 프로그램 -> 콘솔창 출력
		
		// 입력
		InputStream in = System.in; // 표준 입력 스트림
		
		// 출력
		OutputStream out = System.out; // 표준 출력 스트림
		
		byte[] buf = new byte[1024]; // 입출력 시 버퍼의 데이터를 저장하기 위한 변수
		int len = 0;
		try {
			// in.read 메소드는 입력된 데이터의 길이를 반환
			while(len != -1) {
				len = in.read(buf);
				// write 메소드 매개변수 정보, (출력 값, 시작 위치, 길이)
				out.write(buf, 0, len);
				out.flush();
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 자원 반납(해제) => 프로그램에서 사용한 외부 장치 연결 해제
			try {
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
