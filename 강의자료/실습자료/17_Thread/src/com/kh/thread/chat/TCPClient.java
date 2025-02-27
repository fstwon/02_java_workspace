package com.kh.thread.chat;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		// 1) 서버의 IP주소, 포트번호 확인 => localhost, 7979
		// 2) Socket 객체 생성 (=> 서버 정보를 전달)
		try {
			Socket socket = new Socket("localhost", 7979);
			
			if (socket != null) {
				// 3) 스트림 생성 후 데이터 통신
				
				// **Thread 클래스 상속받는 방법**
				// * 서버로부터 메시지를 받는 쓰레드 => ClientReceiver
				ClientReceiver receiver = new ClientReceiver(socket);
				receiver.start();
								
				// * 서버로 메시지를 보내는 쓰레드 => ClientSender
				ClientSender sender = new ClientSender(socket);
				sender.start();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
