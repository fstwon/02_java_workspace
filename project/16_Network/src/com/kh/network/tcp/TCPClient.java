package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		// 서버로 요청 시 필요한 정보
		// IP, 포트 번호
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			int port = 3000;
			socket = new Socket(inetAddress.getHostAddress(), port);
			if(socket != null) {
				System.out.println("서버와 연결 성공");
				
				// 2) 서버와의 입출력 스트림 생성
				// 3) 보조스트림을 사용하여 성능 개선
				
				// 입력용 스트림
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
								
				// 출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					System.out.print("서버 전송 메시지 : ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage);
					pw.flush();
					
					String resMessage = br.readLine(); 
					System.out.println("서버에서 전달받은 메시지 : " + resMessage);		
				}
				
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(pw != null) {
					pw.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}