package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// server 프로그램
		// 1) 포트 번호 지정 
		int port = 3000;
		
		// 2) ServerSocket 객체 생성
		try {
			server = new ServerSocket(port);
			// ServerSocket을 생성하면 클라이언트의 요청을 기다린다. 
			System.out.println("클라이언트 요청 대기 중");
			
			// 3) 요청이 들어오면 수락 후 소켓 객체 생성
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress());
			
			// 입출력 스트림 생성
			// 4) 클라이언트와 입출력 기반 스트림 생성 (바이트 스트림만 가능)
			
			// 5) 보조 스트림을 활용하여 성능 개선
			// 입력용 스트림 (클라이언트로부터 전달된 값을 한줄 단위로 읽어오기 위해 사용)
			// readLine 메소드 사용 가능 

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 출력용 스트림 (클라이언트로 값을 전달)
			// print, println 메소드 사용 가능
			pw = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String message = br.readLine();
				System.out.println("클라이언트에서 전달 받은 메시지 : " + message);
				
				System.out.print("클라이언트로 전달할 메시지 : ");
				String res = sc.nextLine();
				
				pw.println(res);
				pw.flush(); // 스트림에 존재하는 데이터 강제로 내보내기				
			}
		
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 6) 통신 종료 처리
			try {
				if(server != null) {
					server.close();				
				}
				if(br != null) {
					br.close();				
				}
				if(pw != null) {
					pw.close();					
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
